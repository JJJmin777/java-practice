package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5;
        boolean isSmallCar = true;
        boolean Disable = false;

        int fee = hour * 4000;

        if (fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || Disable) {
            fee /= 2;
        }

        System.out.println("요금" + fee + "원입니다.");
    }
}
