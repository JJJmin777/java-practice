package chap_02;

public class _05_Operator {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        String max = (x < y) ? "oh" : "nono";

        System.out.println(max);
        boolean a = (x != y) ? true : false;
        System.out.println(a);
    }
}
