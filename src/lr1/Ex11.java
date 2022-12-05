package lr1;

import java.util.Scanner;

public class Ex11{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What month: ");
        String month = in.next();
        System.out.print("How many days: ");
        int days = in.nextInt();
        System.out.printf("Month: %s Have days: %d", month, days);
        in.close();
    }
}