import java.io.*;
import java.lang.reflect.Array;

public class writeFile {

    public static void main(String[] args) {
    }

    public static void wrireIntFile(int[] text, String fileName){
        try(FileWriter writer = new FileWriter("C:/" + fileName, false)) {
            for (int i = 0; i < text.length; i++) {
                writer.write(text[i]+"\n");
            }
            System.out.println("Отсортированный список успешно записан в файл " + fileName + "!");
        writer.flush();
    }
        catch(IOException ex){
        System.out.println(ex.getMessage());
    }
}
}


