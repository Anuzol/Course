package lr5;
public class Ex1 {
    public static void main(String[] args) {
        Example Example1 = new Example();
        Example1.viewCode();

        Example1.Set('A');
        System.out.println("Char code = " + Example1.getCodeSymbol());

        Example1.viewCode();
    }
}
class Example {

    private char ch;


    public void Set(char ch1) {
        ch = ch1;
    }


    public int getCodeSymbol() {
        return ch;
    }


    public void viewCode() {
        System.out.println("ch1 = " + ch);
        int code = ch;
        System.out.println("ch1 = " + code);
    }


}