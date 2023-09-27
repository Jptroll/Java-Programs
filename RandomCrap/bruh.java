package RandomCrap;
import java.util.Scanner;
public class bruh {
    

    public static void main(String[] args)
    {
        printX(10, 5);
    }

    public static void printX(int x, int y) {
        System.out.print(x + " ");
        if (x > y)  {
            printX(x - 1, y);
        }
    }
    
    

}

