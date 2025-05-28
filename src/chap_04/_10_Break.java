package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        int max = 20;
        for (int i = 1; i < 50; i++) {
            System.out.println(i+"coming");
            if (i == max) {
                System.out.println("sold out");
                break;
            }
        }
        System.out.println("We closed");

        int index = 1;
        while (index <= 50) {
            System.out.println(index +"coming");
            if (index == max) {
                System.out.println("sold out");
                break;
            }
            index++;
        }
    }
}
