package lr1;

import java.util.Scanner;

public class Ex14{

    public static void main(String[] args) {

        int birth;
        Scanner in = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age = in.nextInt();
        birth = 2022 - age;
        System.out.printf("Your birth is: %d", birth);
    }
}