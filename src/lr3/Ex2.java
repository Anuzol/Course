package lr3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = id.nextInt();
        String dayString;
        switch (day) {
            case 1:
                dayString = "Понедельник";
                break;
            case 2:
                dayString = "Вторник";
                break;
            case 3:
                dayString = "Среда";
                break;
            case 4:
                dayString = "Четверг";
                break;
            case 5:
                dayString = "Пятница";
                break;
            case 6:
                dayString = "Суббота";
                break;
            case 7:
                dayString = "Воскресенье";
                break;
            default:
                dayString = "Введено не корректное число";
                break;
        }
        System.out.println(dayString);
    }
}