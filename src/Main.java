import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        System.out.println(Arrays.toString(sortingInt.mergeSort(readFile.readFileInt("file.txt"))));
        System.out.println(Arrays.toString(sortingInt.mergeSort(readFile.readFileInt("file2.txt"))));
        System.out.println(Arrays.toString(sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt("file.txt")),
                sortingInt.mergeSort(readFile.readFileInt("file2.txt")))));

        int[] out = sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt("file.txt")),
                sortingInt.mergeSort(readFile.readFileInt("file2.txt")));
        System.out.println(Arrays.toString(out));
        System.out.println(Arrays.toString(sortingInt.merge(out,
                sortingInt.mergeSort(readFile.readFileInt("file3.txt")))));
//TODO изменить запись файла с передачей имени выходного файла
        writeFile.wrireIntFile((sortingInt.merge(out,
                sortingInt.mergeSort(readFile.readFileInt("file3.txt")))));
//        writeFile.wrireIntFile((sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt("file.txt")),
//                sortingInt.mergeSort(readFile.readFileInt("file2.txt")))));
//        System.out.println(Arrays.toString(sorting.mergeSortString(readFile.readFileString("fileS.txt"))));
//        System.out.println(Arrays.toString(sorting.mergeSortString(readFile.readFileString("fileS2.txt"))));
//        System.out.println(Arrays.toString(sorting.mergeString(sorting.mergeSortString(readFile.readFileString("fileI.txt")),
//                sorting.mergeSortString(readFile.readFileString("fileI2.txt")))));
    }

}
