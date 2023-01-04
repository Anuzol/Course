package lr3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int num = id.nextInt();
        int num3 = 0;
        for (int num1 = 0; num1 <= num; ++num1) {
            if (num1 % 5 == 2 || num1 % 3 == 1) {
                System.out.printf("%d, ", num1);
                num3 = num3 + num1;
            }
        }
        System.out.printf("Сумма чисел: %d, ", num3);


        }



}