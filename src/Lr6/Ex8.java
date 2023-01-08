package Lr6;


class Averager {
    static public float average(int[] ints) {
        float tmp = 0;
        for (int anInt : ints) {
            tmp += anInt;
        }
        return tmp / ints.length;
    }
}

public class Ex8 {
    public static void main(String[] args) {
        System.out.println(Averager.average(new int[]{1, 2, 3, 4, 5}));
    }
}