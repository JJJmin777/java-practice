package chap_06;

public class _03_Return {
    public static String getPhoneNumber() {
        String phoneNumber = "0107777";
        return phoneNumber;
    }

    public static String getAddress() {
        return "seuol";
    }

    public static void main(String[] args) {
        String num = getPhoneNumber();
        System.out.println(num);
        String place = getAddress();
        System.out.println(place);
    }
}
