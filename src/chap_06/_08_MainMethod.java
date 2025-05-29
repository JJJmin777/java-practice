package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }


        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("ddds");
                    break;
                case "2":
                    System.out.println("dwqdqdqwdqwdwq");
                    break;
                default:
                    System.out.println("wrong");
            }
        } else {
            System.out.println("하나만");
        }
    }
}
