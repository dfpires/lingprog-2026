import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/lojad";
        try { // tenta se conectar no banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "123");
            System.out.println("Conexão com sucesso");
        }
        catch (SQLException e){ // caso dê erro, desvia pra cá
            System.out.println("Erro ao conectar com o banco " + e.getMessage());
        }
    }
}