//!!!
//
// НЕ ДОДЕЛАНО
//
//!!!
import java.util.Arrays;

public class sortingString {
    public static void main(String[] args) {
        String[] array1 = { "ab", "ac","ad" ,"ada","adb","adq" };
        String[] array2 = { "ba", "bb","bc" ,"bab","babz","baz" };
//        String[] result = mergeSortString(array1);
//        System.out.println(Arrays.toString(result));
        System.out.println(mergeString(array1,array2));
    }

    public static void de() {
        String s = "addr";
        String e = "adda";
        for (int i = 0; i < s.length() & i < e.length(); i++) {
            if (s.charAt(i) == e.charAt(i)) i++;
            if (s.charAt(i) > e.charAt(i)) {
                System.out.println("fewfefef");
            }
        }
    }


    public static String[] mergeSortString(String[] array1) {
        String[] buffer1 = Arrays.copyOf(array1, array1.length);
        String[] buffer2 = new String[array1.length];
        String[] result = mergesortInnerString(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static String[] mergesortInnerString(String[] buffer1, String[] buffer2,
                                                int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        String[] sorted1 = mergesortInnerString(buffer1, buffer2, startIndex, middle);
        String[] sorted2 = mergesortInnerString(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        String[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            for (int i = 0; i < sorted1[index1].length() & i < sorted2[index2].length(); i++){
                if (sorted1[index1].charAt(i) == sorted2[index2].charAt(i)) continue;
                else result[destIndex++] = sorted1[index1].charAt(i) < sorted2[index2].charAt(i)
                        ? sorted1[index1++] : sorted2[index2++];
            }
            while (index1 < middle) {
                result[destIndex++] = sorted1[index1++];
            }
            while (index2 < endIndex) {
                result[destIndex++] = sorted2[index2++];
            }
        }
        return result;
    }

    public static String[] mergeString(String array1[], String array2[]) {
        int i1 = 0, i2 = 0, ir = 0;
        String [] result = new String[array1.length + array2.length];

        while (i1 < array1.length && i2 < array2.length) {
            for (int i = 0;i < array1[i1].length() & i < array2[i2].length(); i++){
                if (array1[i1].charAt(i) == array2[i2].charAt(i)) continue;
                else if (array1[i1].charAt(i) < array2[i2].charAt(i)) {
                    result[ir] = array1[i1];
                    i1++;;
                }
                else {
                    result[ir] = array2[i2];
                    i2++;
                }
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
