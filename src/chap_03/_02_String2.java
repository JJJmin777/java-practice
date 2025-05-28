package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "hi hi min dong";

        System.out.println(s.replace(" hi", ","));
        System.out.println(s.substring(3));
        System.out.println(s.substring(s.indexOf("min")));
        System.out.println(s.substring(s.indexOf("min"), s.indexOf("g")));
        System.out.println();

        s = "      hi hi min dong";
        String s2 = "jeon";
        System.out.println(s.trim());
        System.out.println(s.concat(",").concat(s2));
    }
}
