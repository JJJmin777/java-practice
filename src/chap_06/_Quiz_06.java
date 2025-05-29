package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String name, int num) {
        String result = name.substring(0,num);

        int len = name.length() - result.length();

        for (int i = 0; i < len; i++) {
            result = result + "*";
        }
        return result;
    }


    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민: " + getHiddenData(id, 8));
        System.out.println("phonenum:" + getHiddenData(phone, 9));
    }
}
