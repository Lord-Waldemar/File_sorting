import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        System.out.println(Arrays.toString(sortingInt.mergeSort(readFile.readFileInt("fileI.txt"))));
        System.out.println(Arrays.toString(sortingInt.mergeSort(readFile.readFileInt("fileI2.txt"))));
        System.out.println(Arrays.toString(sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt("fileI.txt")),
                sortingInt.mergeSort(readFile.readFileInt("fileI2.txt")))));
        writeFile.wrireIntFile((sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt("fileI.txt")),
                sortingInt.mergeSort(readFile.readFileInt("fileI2.txt")))));
//        System.out.println(Arrays.toString(sorting.mergeSortString(readFile.readFileString("fileS.txt"))));
//        System.out.println(Arrays.toString(sorting.mergeSortString(readFile.readFileString("fileS2.txt"))));
//        System.out.println(Arrays.toString(sorting.mergeString(sorting.mergeSortString(readFile.readFileString("fileI.txt")),
//                sorting.mergeSortString(readFile.readFileString("fileI2.txt")))));
    }

}
