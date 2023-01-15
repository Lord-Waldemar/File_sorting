import java.io.*;
import java.lang.reflect.Array;

public class writeFile {

    public static void main(String[] args) {
    }

    public static void wrireIntFile(int[] text){
        try(FileWriter writer = new FileWriter("X:/out.txt", false)) {
            for (int i = 0; i < text.length; i++) {
                writer.write(text[i]+"\n");
            }
        writer.flush();
    }
        catch(IOException ex){
        System.out.println(ex.getMessage());
    }
}
}


