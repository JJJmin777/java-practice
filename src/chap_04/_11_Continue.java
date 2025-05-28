package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i +"gogo");
            if (i == noShow) {
                System.out.println("noShow");
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("sold out");
                break;
            }
        }
    }


}
