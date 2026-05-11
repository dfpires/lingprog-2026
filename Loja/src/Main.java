import java.sql.*;

public class Main{
    public static void criarTabela(Connection conn) throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                        "id SERIAL PRIMARY KEY, " +
                        "nome TEXT NOT NULL, " +
                        "preco REAL NOT NULL, " +
                        "estoque INTEGER DEFAULT 0)";
        // cria objeto de instrução SQL
        Statement stmt = conn.createStatement();
        stmt.execute(sql); // executa comando SQL
        stmt.close(); // fecha instrução SQL
        System.out.println("Tabela produtos criada com sucesso");
    }
    public static void insere(Connection conn, String nome, double preco, int estoque)
                throws SQLException {
        // cria SQL
        String sql = "INSERT INTO produtos (nome, preco, estoque) values (?, ?, ?)";
        // prepara uma instrução SQL
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nome); // define o nome do produto
        ps.setDouble(2, preco); // define o preço do produto
        ps.setInt(3, estoque); // define estoque do produto
        ps.executeUpdate(); // executa o SQL
        System.out.println("Produto inserido com sucesso");
        ps.close();
    }
    public static void consulta(Connection conn) throws SQLException{
        // cria o comando SQL
        String sql = "SELECT * FROM produtos ORDER BY nome";
        Statement stmt = conn.createStatement();
        // executa a consulta no banco e armazena o resultado em rs
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            // recupera o valor de cada coluna
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            double preco = rs.getDouble("preco");
            int estoque = rs.getInt("estoque");
            // mostra os registros da consulta
            System.out.printf("[%d] %s - R$ %.2f (estoque: %d)%n", id, nome, preco, estoque);
        }
    }

    public static void remove(Connection conn, int id) throws SQLException{
        String sql = "DELETE FROM produtos WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int linhasAfetadas = ps.executeUpdate();
        ps.close();
        if (linhasAfetadas > 0){
            System.out.println("Produto removido");
        }
        else System.out.println("ID não encontrado");
    }

    public static void atualizarPreco(Connection con, int id,
                         double novoPreco) throws SQLException {
        String sql = "UPDATE produtos SET preco = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, novoPreco);
        ps.setInt(2, id);
        int linhasAfetadas = ps.executeUpdate();
        if (linhasAfetadas > 0){
            System.out.println("Preço atualizado com sucesso");
        }
        else {
            System.out.println("Produto não encontrado");
        }
    }
    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/lojad";
        try { // tenta se conectar no banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "123");
            System.out.println("Conexão com sucesso");
            // cria a tabela produto
            criarTabela(conn);
           // insere(conn, "placa de vídeo", 1299, 1);
            consulta(conn);
           // remove(conn, 3);
            atualizarPreco(conn, 2, 109);
            consulta(conn);
        }
        catch (SQLException e){ // caso dê erro, desvia pra cá
            System.out.println("Erro ao conectar com o banco " + e.getMessage());
        }
    }
}