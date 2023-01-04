package lr3;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int num = id.nextInt();
        int[] numbers = new int[num];
        int c = 0;
        for (int n = 0; n < numbers.length; n++){
            numbers[n] = c;
            c += 1;
            if (c % 5 == 2){
                System.out.println(c);}
        }


    }
}


