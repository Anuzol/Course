package lr1;

import java.util.Scanner;

public class Ex10{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input day of week: ");
        String week = in.next();
        System.out.print("Input month: ");
        String month = in.next();
        System.out.print("Input day number: ");
        int number = in.nextInt();
        System.out.printf("Today is: %s %d %s", week, number, month);
        in.close();
    }
}

