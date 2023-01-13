import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class readFile {
    public static void main(String[] args) {
        String fileName = "file1.txt";
//        System.out.println(readFileInt(fileName));
        System.out.println(readFileString(fileName));
    }

    public static ArrayList readFileInt(String fileName) {
        try {
            File file = new File("/Users/PCUser/Desktop/" + fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            ArrayList list = new ArrayList<>();
            while (line != null) {
                line = line.trim();
                if (!line.contains(" ") & line.matches("-?[\\d ]+") & !line.matches("-?[\\n ]+")) {
                    list.add(line);
                }
                line = reader.readLine();
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList readFileString(String fileName) {
        try {
            File file = new File("/Users/PCUser/Desktop/" + fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            ArrayList list = new ArrayList<>();
            while (line != null) {
                line = line.trim();
                if (!line.contains(" ") & !line.matches("-?[\\d]+")) {
                    list.add(line);
                }
                line = reader.readLine();
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}