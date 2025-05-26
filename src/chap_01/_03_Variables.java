package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "min";
        int hour = 12;

        System.out.println(name + " "+ hour + "시 배송예정");
        System.out.println(name + " 배송완료");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "평균 점수" + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다");

        boolean pass = true;
        System.out.println(pass);

        double d = 3.1431232131232131;
        float f = 3.143213213213213F;
        System.out.println(d);
        System.out.println(f);

        long l = 1212121212121L;
        System.out.println(l);
    }
}
