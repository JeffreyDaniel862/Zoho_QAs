import java.util.Arrays;

public class ProcessArray {
    public static void main(String[] args) {
        int[] inputArray = new int[]{0, 2, 2, 2, 0, 6, 6, 0, 8};
        int[] result = processArray(inputArray);
        System.out.println(Arrays.toString(result));
    }
    private static int[] processArray(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
              if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                  result[index++] = arr[i] + arr[i + 1];
                  arr[i + 1] = 0;
              } else {
                  result[index++] = arr[i];
              }
            }
        }
        return result;
    }
}
