import java.io.FileWriter;
import java.io.IOException;

public class Segundo {
    public static void main(String[] args){
        try {
            FileWriter fw = new
                    FileWriter("notas.txt");
            fw.write("Ana: 8.0\n");
            fw.write("Bruno: 5.0\n");
            fw.write("Carlos: 10.0\n");
            fw.close();
            System.out.println("Salvo!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
