package lr2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();
        if (num % 3 > 0)
            System.out.println("Not delitsya na 3");
        else
            System.out.println("Delitsya na 3");
    }

}
