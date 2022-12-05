package lr1;

import java.util.Scanner;

public class Ex15{

    public static void main(String[] args) {

        int number_3;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int number_1 = in.nextInt();
        System.out.print("Input number 2: ");
        int number_2 = in.nextInt();
        number_3 = number_1 + number_2;
        System.out.printf("Sum number is: %s", number_3);
    }
}
