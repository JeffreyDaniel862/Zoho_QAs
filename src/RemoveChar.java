public class RemoveChar {
    public static void main(String[] args) {
        String str1 = "expErience";
        String str2 = "En";
        char[] charArray = str1.toCharArray();

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            for (int j = 0; j < charArray.length; j++) {
                if (ch == charArray[j]) {
                    charArray[j] = '0';
                }
            }
        }
        for (char ch : charArray) {
            if (ch != '0') {
                System.out.print(ch);
            }
        }
    }
}
