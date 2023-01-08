package Lr6;


class Sum {
    static public long quadSum(long n) {
        long tmp = 0;
        for (long i = 1; i <= n; i++) {
            tmp += i * i;
        }
        return tmp;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        var n = 3;
        var result = Sum.quadSum(n);
        System.out.println("result: " + result);

        var check = n*(n + 1)*(2 * n + 1) / 6;
        System.out.println("real answer: " + check);


    }
}