package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김 = true;
        boolean 계 = true;
        boolean 제 = true;

        System.out.println(김 || 계 || 제);
        System.out.println(김 && 계 && 제);

        System.out.println((5 > 3) && (3 < 1));

        System.out.println((5 < 3) || (3 < 1));
        System.out.println(!true);
        System.out.println(!(5==5));
    }
}
