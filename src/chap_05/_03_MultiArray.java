package chap_05;

import java.sql.SQLOutput;

public class _03_MultiArray {
    public static void main(String[] args) {
        String[] seatA = {"A1", "A2", "A3","A4","A5"};

        // 3 * 5
        String[][] seats = new String[][] {
                {"A1", "A2", "A3","A4","A5"},
                {"B1", "B2", "B3","B4","B5"},
                {"C1", "C2", "C3","C4","C5"},
        };
        System.out.println(seats[0][1]);


    }
}
