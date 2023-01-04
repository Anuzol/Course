package lr3;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        char[] letter = new char[10];
        char[] delete = {'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';
        for (int n = 0; n < letter.length; b++)
        {
            for (int c = 0; c < delete.length; c++)
            {
                if (b == delete[c]){
                    b++;
                }
            }
            letter[n] = b;
            System.out.println(letter[n]);
            n++;
        }
    }
}

