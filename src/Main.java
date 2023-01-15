import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        System.out.println(Arrays.toString(sorting.mergeSort(readFile.readFileInt("fileI.txt"))));
        System.out.println(Arrays.toString(sorting.mergeSort(readFile.readFileInt("fileI2.txt"))));
        System.out.println(Arrays.toString(sorting.merge(sorting.mergeSort(readFile.readFileInt("fileI.txt")),
                sorting.mergeSort(readFile.readFileInt("fileI2.txt")))));
        writeFile.wrireIntFile((sorting.merge(sorting.mergeSort(readFile.readFileInt("fileI.txt")),
                sorting.mergeSort(readFile.readFileInt("fileI2.txt")))));
//        System.out.println(Arrays.toString(sorting.mergeSortString(readFile.readFileString("fileS.txt"))));
//        System.out.println(Arrays.toString(sorting.mergeSortString(readFile.readFileString("fileS2.txt"))));
//        System.out.println(Arrays.toString(sorting.mergeString(sorting.mergeSortString(readFile.readFileString("fileI.txt")),
//                sorting.mergeSortString(readFile.readFileString("fileI2.txt")))));
    }

}
