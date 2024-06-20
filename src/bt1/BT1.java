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

    public static void main(String[] args) {
        System.out.println(BT1.getTheFirstDontRepeatChar("gibblegabbler"));
    }
}