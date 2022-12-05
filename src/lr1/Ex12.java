package lr1;

import java.util.Scanner;

public class Ex12{

    public static void main(String[] args) {

        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Input year of birth: ");
        int birth = in.nextInt();
        age = 2022 - birth;
        System.out.printf("Your age is: %d", age);
            }
}
