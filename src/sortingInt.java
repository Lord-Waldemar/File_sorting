import java.util.Arrays;

public class sortingInt {
    public static void main(String[] args) {
    }

//Sort without direction
    public static int[] mergeSort(int[] array) {
        int[] bufferCopy = Arrays.copyOf(array, array.length);
        int[] bufferNew = new int[array.length];
        return mergeSortInner(bufferCopy, bufferNew, 0, array.length);
    }

    public static int[] mergeSortInner(int[] bufferCopy, int[] bufferNew,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return bufferCopy;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(bufferCopy, bufferNew, startIndex, middle);
        int[] sorted2 = mergeSortInner(bufferCopy, bufferNew, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == bufferCopy ? bufferNew : bufferCopy;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static int[] merge(int[] array1, int[] array2) {
        int i = 0, j = 0, iResult = 0;
        int [] result = new int[array1.length + array2.length];

        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[iResult] = array1[i];
                i++;
            } else {
                result[iResult] = array2[j];
                j++;
            }
            iResult++;
        }
        while (i < array1.length) {
            result[iResult] = array1[i];
            i++;
            iResult++;
        }
        while (j < array2.length) {
            result[iResult] = array2[j];
            j++;
            iResult++;
        }
        return result;
    }

//Direction sorting
    public static int[] mergeSort(int[] array, String isDesc) {
        if (!isDesc.equals("-a") & !isDesc.equals("-d")){
            System.out.println("Введенный режим сортировки не удалось распознать. Вы можете ввести -a или ничего не вводить для сортировки по возрастанию, -d для сортировки по убыванию.");
            return null;
        }
        int[] buffer1 = Arrays.copyOf(array, array.length);
        int[] buffer2 = new int[array.length];
        return mergeSortInner(buffer1, buffer2, 0, array.length, isDesc);
    }
    public static int[] mergeSortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex, String isDesc) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle, isDesc);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex, isDesc);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        if (isDesc.equals("-a")) {
            while (index1 < middle && index2 < endIndex) {
                result[destIndex++] = sorted1[index1] < sorted2[index2]
                        ? sorted1[index1++] : sorted2[index2++];
            }
        } else if (isDesc.equals("-d")) {
            while (index1 < middle && index2 < endIndex) {
                result[destIndex++] = sorted1[index1] > sorted2[index2]
                        ? sorted1[index1++] : sorted2[index2++];
            }
        }

        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static int[] merge(int[] array1, int[] array2, String isDesc) {
        int i = 0, j = 0, iResult = 0;
        int[] result = new int[array1.length + array2.length];
        try {
            switch (isDesc) {
                case ("-a"):
                    while (i < array1.length && j < array2.length) {
                        if (array1[i] <= array2[j]) {
                            result[iResult] = array1[i];
                            i++;
                        } else {
                            result[iResult] = array2[j];
                            j++;
                        }
                        iResult++;
                    }
                case ("-d"):
                    while (i < array1.length && j < array2.length) {
                        if (array1[i] >= array2[j]) {
                            result[iResult] = array1[i];
                            i++;
                        } else {
                            result[iResult] = array2[j];
                            j++;
                        }
                        iResult++;
                    }
            }
            while (i < array1.length) {
                result[iResult] = array1[i];
                i++;
                iResult++;
            }
            while (j < array2.length) {
                result[iResult] = array2[j];
                j++;
                iResult++;
            }
        }
            catch(NullPointerException e) {
                System.out.println("Введенный режим сортировки не удалось распознать. Вы можете ввести -a или ничего не вводить для сортировки по возрастанию, -d для сортировки по убыванию.");

            }
        return result;
    }
}