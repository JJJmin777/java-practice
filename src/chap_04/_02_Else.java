package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        int hour = 15;
        if (hour < 14) {
            System.out.println("커피");
        } else {
            System.out.println("디카페인 커피");
        }
        hour = 10;
        boolean m0_co = true;
        if (hour >= 14 || m0_co == true) {
            System.out.println("디카페인 커피");
        } else {
            System.out.println("커피");
        }
    }
}
