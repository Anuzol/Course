package lr1;

import java.util.Scanner;

public class Ex17{

    public static void main(String[] args) {

        int number_3;
        int number_4;
        int number_5;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int number_1 = in.nextInt();
        System.out.print("Input number 2: ");
        int number_2 = in.nextInt();
        number_3 = number_1 + number_2;
        number_4 = number_1 - number_2;
        if (number_4 < 0)
            number_4 = number_4 * -1;
        System.out.printf("Sum is: %d, difference is: %d", number_3, number_4);
    }
}
