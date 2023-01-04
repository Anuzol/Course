package lr3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int num = id.nextInt();
        char[] letter = new char[num];
        char b = 'a';
        for (int n = 0; n < letter.length; n++){
            letter[n] = b;
            b+=2;
            System.out.print(letter[n]);
        }
        System.out.println();
        for (int n = letter.length - 1 ; n >= 0; n--){
            System.out.print(letter[n]);
        }
    }
}

