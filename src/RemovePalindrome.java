public class RemovePalindrome {
    public static void main(String[] args) {
        String input = "He did a good deed .";
        String[] inputStrings = input.split(" ");
        for (String str : inputStrings) {
            if (!palindrome(str)) {
                System.out.print(str + " ");
            }
        }
    }
    private static boolean palindrome(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                continue;
            } else return false;
        }
        return true;
    }
}
