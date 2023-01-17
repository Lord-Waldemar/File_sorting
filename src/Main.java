import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название диска на котором у вас лежат файлы для сортировки.");
        String diskName = sc.nextLine().toUpperCase();
        System.out.println("Введите параметры сортировки в формате, показанном ниже, соблюдая порядок. Вы можете указать до 3х входных файлов." +
                "\n-d out.txt file.txt file2.txt");
        String[] conditions = sc.nextLine().split(" ");
        String isDesc = null, typeOfData, outFileName = null;
        ArrayList<Object> inFileName = new ArrayList<>();
        //Loop for processing input data
        for (int i=0; i < conditions.length; i++){
            if (conditions[0].equals("-d") | conditions[0].equals("-a") ) {
                switch (i) {
                    case (0) -> isDesc = conditions[i].toLowerCase();
//                    Для сортировки строк
//                    case (1) -> typeOfData = conditions[i];
                    case (1) -> outFileName = conditions[i];
                    case (2), (3), (4) -> inFileName.add(conditions[i]);
                }
            } else
                switch (i) {
//                    Для сортировки строк
//                    case (0) -> typeOfData = conditions[i];
                    case (0) -> outFileName = conditions[i];
                    case (2), (3), (1) -> inFileName.add(conditions[i]);
                }
        }
        //If not specified in which order to sort
        if (isDesc == null)
        {
            switch (inFileName.size()) {
                case (0) -> System.out.println("Вы не указали входных файлов!");
                //If 1 input file is specified
                case (1) ->
                        writeFile.writeIntFile(sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(0).toString())), diskName, outFileName);
                //If 2 input files are specified
                case (2) ->
                        writeFile.writeIntFile(sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(0).toString())),
                                sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(1).toString()))), diskName, outFileName);
                //If 3 input files are specified
                case (3) -> {
                    int[] out = sortingInt.merge(sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(0).toString())),
                            sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(1).toString())));
                    writeFile.writeIntFile((sortingInt.merge(out,
                            sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(2).toString())))), diskName, outFileName);
                }
            }
        }
        //If specified in which order to sort
        else
        {
            switch (inFileName.size()) {
                case (0) -> System.out.println("Вы не указали входных файлов!");
                //If 1 input file is specified
                case (1) ->
                        writeFile.writeIntFile(Objects.requireNonNull(sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(0).toString()), isDesc)), diskName, outFileName);
                //If 2 input files are specified
                case (2) ->
                        writeFile.writeIntFile(sortingInt.merge(Objects.requireNonNull(sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(0).toString()), isDesc)),
                                Objects.requireNonNull(sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(1).toString()), isDesc)), isDesc), diskName, outFileName);
                //If 2 input files are specified
                case (3) -> {
                    int[] out = sortingInt.merge(Objects.requireNonNull(sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(0).toString()), isDesc)),
                            Objects.requireNonNull(sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(1).toString()), isDesc)), isDesc);
                    writeFile.writeIntFile((sortingInt.merge(out,
                            Objects.requireNonNull(sortingInt.mergeSort(readFile.readFileInt(diskName, inFileName.get(2).toString()), isDesc)), isDesc)), diskName, outFileName);
                }
            }
        }
    }
}
