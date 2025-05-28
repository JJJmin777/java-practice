package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        boolean han = true;
        boolean man = true;

        if (!han) {
            System.out.println("한라봉 에이드 +1");
        } else if (!man) {
            System.out.println("망고 에이드 +1");
        } else {
            System.out.println("디카페인 커피");
        }
    }
}
