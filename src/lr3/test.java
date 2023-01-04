package lr3;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        char[] omitArray = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};   // for any size of an array
        char b = 'A';                                                   //first char element
        int i = 0;                                                      //counter for symbols
        int j = 0;                                                      //counter for an array length
        for(i = 0; i < n; i++)
        {
            Boolean statement = true;
            for(j = 0; j < omitArray.length; j++)
            {
                if(b == omitArray[j])
                {
                    i--;
                    statement = false;
                    break;
                }
            }
            if(statement)
            {
                charArray[i] = b;
            }
            b++;
        }

        for(int k = 0; k < n; k++){
            System.out.print(charArray[k] + "\t");
        }
    }
}