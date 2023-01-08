package Lr6;


class SimpleMath {
    static int max(int... args) {
        var tmp = Integer.MIN_VALUE;
        for (int arg : args) {
            tmp = Math.max(tmp, arg);
        }
        return tmp;
    }

    static int min(int... args) {
        var tmp = Integer.MAX_VALUE;
        for (int arg : args) {
            tmp = Math.min(tmp, arg);
        }
        return tmp;
    }

    static int avg(int... args) {
        var tmp = 0;
        for (int arg : args) {
            tmp += arg;
        }
        return tmp / args.length;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("max(1,2,3):" + SimpleMath.max(1, 2, 3));
        System.out.println("min(1,2,3):" + SimpleMath.min(1, 2, 3));
        System.out.println("avg(1,2,3):" + SimpleMath.avg(1, 2, 3));
    }
}