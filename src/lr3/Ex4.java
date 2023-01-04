package lr3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int num = id.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        for (int num1 = num; num1 > 0; --num1) {
            System.out.printf("%d, ", c);
            c = a + b;
            a = b;
            b = c;
        }


    }
}
