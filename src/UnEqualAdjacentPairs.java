import java.util.ArrayList;

public class UnEqualAdjacentPairs {
    public static void main(String[] args) {
        System.out.println(isEqualAdjacent("aabbcc", "aabccc"));
    }
    private static ArrayList<String> isEqualAdjacent(String str, String str1) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            String pair1 = str.substring(i, i+2);
            String pair2 = str1.substring(i, i+2);

            if (!pair1.equals(pair2)) {
                result.add(pair1 + "-" + pair2);
            }
        }
        return result;
    }
}
