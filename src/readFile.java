import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;

public class readFile {
    public static void main(String[] args) {
        }

    public static int[] readFileInt(String diskName, String fileName) {
        try {
            File file = new File(diskName + ":/" + fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            ArrayList<Integer> list = new ArrayList<Integer>();
            while (line != null) {
                line = line.trim();
                if (!line.contains(" ") & line.matches("-?[\\d ]+") & !line.matches("-?[\\n ]+")) {
                    list.add(Integer.valueOf(line));
                }
                line = reader.readLine();
            }
            return list.stream().filter(Objects::nonNull).mapToInt(i -> i).toArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //НЕ ДОДЕЛАНО
//    public static String[] readFileString(String fileName) {
//        try {
//            File file = new File("C:/" + fileName);
//            FileReader fr = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fr);
//            String line = reader.readLine();
//            ArrayList list = new ArrayList<>();
//            while (line != null) {
//                line = line.trim();
//                if (!line.contains(" ") & !line.matches("-?[\\d]+")) {
//                    list.add(line);
//                }
//                line = reader.readLine();
//            }
//            String[] arrStr = (String[]) list.stream().toArray(String[]::new);
//            return arrStr;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}