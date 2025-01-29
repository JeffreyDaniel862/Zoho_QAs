public class Palindrome {
    public static void main(String[] args) {
        palindromeFinder("he knows malayalam");
    }
    public static void palindromeFinder(String str) {
        String[] list = str.split(" ");
        for (String element : list) {
            if (isPalindrome(element)) {
                System.out.println(element);
            }
        }
    }

    private static boolean isPalindrome(String str) {
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length / 2; i++) {
            if (!(strArr[i] == strArr[strArr.length - 1 -i])) {
                return false;
            }
        }
        return true;
    }
}
