package lr2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();
        if (  num % 5 == 2 && num % 7 == 1)
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");
    }

}
