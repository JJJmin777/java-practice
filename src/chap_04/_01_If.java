package chap_04;

public class _01_If {
    public static void main(String[] args) {
        int hour = 15;
        if (hour < 14) {
            System.out.println("ice americano + 1");
        }
        System.out.println("good");
        hour = 10;
        boolean mo_co = false;
        if (hour < 14 && !mo_co) {
            System.out.println("ice americano + 1");
        }

        hour = 15;
        mo_co = true;
        if (hour >= 14 || !mo_co) {
            System.out.println("ice americano + 1dsadsa");
        }
    }
}
