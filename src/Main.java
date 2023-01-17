import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры сортировки в формате, показанном ниже, соблюдая порядок:\n-d out.txt file.txt file2.txt");
        String[] condishions = sc.nextLine().split(" ");
        String isDesc = null, typeOfData, outFileName = null;
        ArrayList inFileName = new ArrayList<>();
        for (int i=0; i < condishions.length; i++){
            if (condishions[0].equals("-d") | condishions[0].equals("-a") ) {
                switch (i) {
                    case (0):
                        isDesc = condishions[i];
                        break;
//                    case (1):
//                        typeOfData = condishions[i];
//                        break;
                    case (1):
                        outFileName = condishions[i];
                        break;
                    case (2), (3), (4):
                        inFileName.add(condishions[i]);
                        break;
                }
            } else
                switch (i) {
//                    case (0):
//                        typeOfData = condishions[i];
//                        break;
                    case (0):
                        outFileName = condishions[i];
                        break;
                    case (2), (3), (1):
                        inFileName.add(condishions[i]);
                        break;
                }
        }

        if (isDesc == null)
        {
            switch (inFileName.size()) {
                case (0):
                    System.out.println("Вы не указали входных файлов!");
                    break;
                case (1):
                    writeFile.wrireIntFile(sortingInt.mergeSort(readFile.readFileInt(inFileName.get(0).toString())), outFileName);
                    break;
                case (2):
                    writeFile.wrireIntFile(sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt(inFileName.get(0).toString())),
                            sortingInt.mergeSort(readFile.readFileInt(inFileName.get(1).toString()))), outFileName);
                    break;
                case (3):
                    int[] out = sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt(inFileName.get(0).toString())),
                            sortingInt.mergeSort(readFile.readFileInt(inFileName.get(1).toString())));
                    writeFile.wrireIntFile((sortingInt.merge(out,
                            sortingInt.mergeSort(readFile.readFileInt(inFileName.get(2).toString())))), outFileName);
                    break;
            }
        }
        else
        {
            switch (inFileName.size()) {
                case (0):
                    System.out.println("Вы не указали входных файлов!");
                    break;
                case (1):
                    writeFile.wrireIntFile(sortingInt.mergeSort(readFile.readFileInt(inFileName.get(0).toString()), isDesc), outFileName);
                    break;
                case (2):
                    writeFile.wrireIntFile(sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt(inFileName.get(0).toString()), isDesc),
                            sortingInt.mergeSort(readFile.readFileInt(inFileName.get(1).toString()), isDesc)), outFileName);
                    break;
                case (3):
                    int[] out = sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt(inFileName.get(0).toString()), isDesc),
                            sortingInt.mergeSort(readFile.readFileInt(inFileName.get(1).toString()), isDesc));
                    writeFile.wrireIntFile((sortingInt.merge(out,
                            sortingInt.mergeSort(readFile.readFileInt(inFileName.get(2).toString()), isDesc))), outFileName);
                    break;
            }
        }


//        int[] out = sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt(inFileName.get(0).toString())),
//                sortingInt.mergeSort(readFile.readFileInt(inFileName.get(1).toString())));
//
//        System.out.println(isDesc + outFileName + inFileName.toString());
//
//
        System.out.println(Arrays.toString(sortingInt.mergeSort(readFile.readFileInt("file.txt"), isDesc)));
        System.out.println(Arrays.toString(sortingInt.mergeSort(readFile.readFileInt("file2.txt"), isDesc)));

        System.out.println(Arrays.toString(sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt("file.txt"), isDesc),
                sortingInt.mergeSort(readFile.readFileInt("file2.txt"), isDesc))));
//
//
//        System.out.println(Arrays.toString(out));
//        System.out.println(Arrays.toString(sortingInt.merge(out,
//                sortingInt.mergeSort(readFile.readFileInt("file3.txt")))));
//TODO изменить запись файла с передачей имени выходного файла


//        writeFile.wrireIntFile((sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt("file.txt")),
//                sortingInt.mergeSort(readFile.readFileInt("file2.txt")))));
//        System.out.println(Arrays.toString(sorting.mergeSortString(readFile.readFileString("fileS.txt"))));
//        System.out.println(Arrays.toString(sorting.mergeSortString(readFile.readFileString("fileS2.txt"))));
//        System.out.println(Arrays.toString(sorting.mergeString(sorting.mergeSortString(readFile.readFileString("fileI.txt")),
//                sorting.mergeSortString(readFile.readFileString("fileI2.txt")))));
    }

}
