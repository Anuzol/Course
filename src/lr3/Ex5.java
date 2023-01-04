package lr3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = id.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = id.nextInt();

        for (int num3 = num1; num3 % 1 == 0; ++num3) {
            System.out.printf("%d, ", num3);
            if (num3 == num2)
                break;
        }


    }
}