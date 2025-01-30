public class MergeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {0,3,9};
        int[] result = mergeDistinct(arr, arr1);
        int i = 0;
        do {
            System.out.print(result[i] + ", ");
            i++;
        } while (i < result.length && result[i] > result[i -1]);
    }
    public static int[] mergeDistinct(int[] arr, int[] arr1) {
        int resultLength = arr.length + arr1.length;
        int[] result = new int[resultLength];
        int i = 0, j = 0, k =0;
        while (k < resultLength) {
            if (i < arr.length && j < arr1.length) {
                if (arr[i] < arr1[j]) {
                    result[k] = arr[i];
                    i++;
                } else if (arr[i] > arr1[j]) {
                    result[k] = arr1[j];
                    j++;
                } else {
                    result[k] = arr[i];
                    i++;
                    j++;
                }
            }else if (i < arr.length) {
                result[k] = arr[i];
                i++;
            }else if (j < arr1.length) {
                result[k] = arr1[j];
                j++;
            }
            k++;
        }
        return result;
    }
}
