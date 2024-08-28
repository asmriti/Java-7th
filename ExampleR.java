import java.io.File;
import java.io.IOException;

public class ExampleR {
    public static void main(String[] args) throws IOException {
        File f1= new File("Pk.txt");
        f1.createNewFile();
        System.out.println("File Exists"+f1.exists());
        System.out.println("Location"+f1.getAbsolutePath());
        System.out.println("Length"+f1.length());
    }
}
