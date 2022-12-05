package lr1;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("What your name: ");
        String name = in.next();
        System.out.print("Input year of birth: ");
        int birth = in.nextInt();
        age = 2022 - birth;
        System.out.printf("Your name: %s age is: %d", name, age);
    }
}