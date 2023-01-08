package ttimus;

import java.util.Scanner;

public class Task2012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int b = ((5 - 1) * 60) / 45;
        int f = in.nextInt();
        int a = b + f;


        if (a >= 12) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}