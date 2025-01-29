public class PrintXFormat {
    public static void main(String[] args) {
        printX("Jeffrey");
    }
    public static void printX (String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i || j == arr.length - 1 - i) {
                    System.out.print(arr[j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
