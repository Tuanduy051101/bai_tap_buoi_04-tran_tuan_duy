package bt1;

public class BT1 {

    public static Character getTheFirstDontRepeatChar(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return null;
    }

    public static Character getTheFirstDontRepeatChar1(String str) {
        int[] charCount = new int[256]; //

        // Đếm số lần xuất hiện của mỗi ký tự
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Tìm ký tự đầu tiên không lặp lại
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String testString = "gibblegabbler";

        // Cach 1: O(n^2)
        System.out.println("\nCách 1: O(n^2)\n");
        Character result = getTheFirstDontRepeatChar(testString);
        if (result != null) {
            System.out.println("Ký tự đầu tiên không lặp lại là: " + result);
        } else {
            System.out.println("Không có ký tự nào không lặp lại.");
        }

        // Cach 2: O(n)
        System.out.println("\nCách 2: O(n)\n");
        Character result1 = getTheFirstDontRepeatChar1(testString);
        if (result1 != null) {
            System.out.println("Ký tự đầu tiên không lặp lại là: " + result1);
        } else {
            System.out.println("Không có ký tự nào không lặp lại.");
        }
    }
}
