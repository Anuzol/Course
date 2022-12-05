package lr1;

import java.util.Scanner;

public class Ex8{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input last Surname: ");
        String Surname = in.next();
        System.out.print("Input name: ");
        String name = in.next();
        System.out.print("Input middle name: ");
        String middle_name = in.next();
        System.out.printf("Hello %s %s %s", Surname, name, middle_name);
        in.close();
    }
}
