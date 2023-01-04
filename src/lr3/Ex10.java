package lr3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Ex10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int num = id.nextInt();
        int[] numbers = new int[num];
        int c = 0;
        for (int n = 0; n < numbers.length; n++)
            numbers[n] = (int) (Math.random() * num);
            for (int n : numbers)
                System.out.print(n + " ");

        Arrays.sort(numbers);
        int[] sorted = Arrays.stream(numbers).sorted().toArray();

        int[] reversesorted = IntStream.rangeClosed(1, sorted.length)
                .map(i -> sorted[sorted.length-i])
                .toArray();

        System.out.println(Arrays.toString(reversesorted));

    }
}







