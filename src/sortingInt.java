import java.util.Arrays;

public class sortingInt {
    public static void main(String[] args) {
        int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
        int[] result = mergeSort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // ��� ������������.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // �������
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
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

    public static int[] merge(int array1[], int array2[]) {
        int i1 = 0, i2 = 0, ir = 0;
        int [] result = new int[array1.length+array2.length];

        while (i1 < array1.length && i2 < array2.length) {
            if (array1[i1] <= array2[i2]) {
                result[ir] = array1[i1];
                i1++;
            } else {
                result[ir] = array2[i2];
                i2++;
            }
            ir++;
        }
        while (i1 < array1.length) {
            result[ir] = array1[i1];
            i1++;
            ir++;
        }
        while (i2 < array2.length) {
            result[ir] = array2[i2];
            i2++;
            ir++;
        }
        return result;
    }
}