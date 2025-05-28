package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "hihihhiddsadsAAAda";
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("hi"));
        System.out.println(s.contains("hello"));
        System.out.println(s.indexOf("AAA"));
        System.out.println(s.indexOf("dwqdwqdwq"));
        System.out.println(s.indexOf("hi"));
        System.out.println(s.lastIndexOf("hi"));
        System.out.println(s.startsWith("dsa"));
        System.out.println(s.endsWith("ddsa"));


    }
}
