package lr1;

import java.util.Scanner;

public class Ex9{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("name: ");
        String name = in.next();
        System.out.print("Age: ");
        int age = in.nextInt();
        System.out.printf("Your name: %s Your age: %d", name, age);
        in.close();
    }
}