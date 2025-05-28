package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equalsIgnoreCase("python"));
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234");
        s2 = new String("1234"); // 두개가 참조하는 게 다름(메모리에서)

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // 참조가 달라 false


    }
}
