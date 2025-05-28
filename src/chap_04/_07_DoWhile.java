package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance) {
            System.out.println("keep going");
            System.out.println(move);
            move += 3;
        }
        System.out.println("Complete");

        int distance2 = 25;
        int move2 = 0;
        int height2 = 2;
        while (move2 + height2 < distance2) {
            System.out.println("keep going");
            System.out.println(move);
            move += 3;
        }
        System.out.println("Complete");

        do {
            System.out.println("keep going");
            System.out.println(move);
            move += 3;
        } while (move2 + height2 < distance2);

    }
}
