package lr1;

import java.util.Scanner;

public class Ex16{

    public static void main(String[] args) {

        int number_2;
        int number_3;
        int number_4;
        int number_5;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int number_1 = in.nextInt();
        number_2 = number_1 - 1;
        number_3 = number_1 + 1;
        number_4 = number_1 + number_2 + number_3;
        number_5 = number_4 * number_4;
        System.out.printf("Number is: %s %s %s %d", number_2, number_1, number_3, number_5);
    }
}
