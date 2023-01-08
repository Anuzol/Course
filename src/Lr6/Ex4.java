package Lr6;



class Factorial {
    static public long doubleFactorial(int n) {
        long tmp = 1;
        for (int i = n; i >=1; i-=2) {
            tmp *= i;
        }
        return tmp;
    }
}

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(Factorial.doubleFactorial(5)); // = 15
    }
}