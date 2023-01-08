package Lr6;



class Shuffler {
    static public char[] shuffle(char[] chars) {
        var tmp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            tmp[i] = chars[chars.length - i - 1];
        }
        return tmp;
    }
}

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(Shuffler.shuffle(new char[]{'a', 'b', 'c', 'd', 'e'}));
    }
}