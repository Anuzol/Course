package lr4;

public class Ex1 {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j;
        int z;
        for (i = 0; i <= figure; i++) {
            System.out.println();
            z = 0;
            for (j = -13; j < figure; j++) {
                System.out.print("+ ");
                z = z + 1;
            }
        }
    }
}

