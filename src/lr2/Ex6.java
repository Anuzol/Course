package lr2;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();
        number = num / 1000;
        System.out.printf("thousands is: %d", number);

    }

}
