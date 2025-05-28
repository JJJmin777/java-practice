package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"1","2","3","4"};

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]);
        }
        for (String coffee : coffees) {
            System.out.println(coffee + "gksk");
        }
    }
}
