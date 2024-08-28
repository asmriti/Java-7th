import java.io.FileOutputStream;

public class FileOutDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("abc.txt");
            String s = "Hello World";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("File written successfully");
        } catch (Exception e){
                System.out.println(e);     
     }}
}
