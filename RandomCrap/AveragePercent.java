package RandomCrap;
import java.util.Scanner;

public class AveragePercent
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(input);
        
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        double g = 0;
        double h = 0;
        double i = 0;
        double j = 0;
        double k = 0;

        System.out.println("How many doubles will you enter? (2-10)");
        double amount = input.nextDouble(); 

        if(amount == 2)
        {
        System.out.println("Enter your values");
        b = input.nextDouble(); 
        c = input.nextDouble(); 
        
        System.out.println((b + c + d + e + f + g + h + i + j + k) / amount );
        }

        if(amount == 3)
        {
        System.out.println("Enter your values");
        b = input.nextDouble(); 
        c = input.nextDouble();
        d = input.nextDouble(); 
        System.out.println((b + c + d + e + f + g + h + i + j + k) / amount );
        }

        if(amount == 4)
        {
        System.out.println("Enter your values");
        b = input.nextDouble(); 
        c = input.nextDouble();
        d = input.nextDouble(); 
        e = input.nextDouble();
        System.out.println((b + c + d + e + f + g + h + i + j + k) / amount );
        }

        if(amount == 5)
        {
        System.out.println("Enter your values");
        b = input.nextDouble(); 
        c = input.nextDouble();
        d = input.nextDouble(); 
        e = input.nextDouble();
        f = input.nextDouble(); 
        System.out.println((b + c + d + e + f + g + h + i + j + k) / amount );
        }

        if(amount == 6)
        {
        System.out.println("Enter your values");
        b = input.nextDouble(); 
        c = input.nextDouble();
        d = input.nextDouble(); 
        e = input.nextDouble();
        f = input.nextDouble(); 
        g = input.nextDouble();
        System.out.println((b + c + d + e + f + g + h + i + j + k) / amount );
        }

        if(amount == 7)
        {
        System.out.println("Enter your values");
        b = input.nextDouble(); 
        c = input.nextDouble();
        d = input.nextDouble(); 
        e = input.nextDouble();
        f = input.nextDouble(); 
        g = input.nextDouble();
        h = input.nextDouble(); 
        System.out.println((b + c + d + e + f + g + h + i + j + k) / amount );
        }

        if(amount == 8)
        {
        System.out.println("Enter your values");
        b = input.nextDouble(); 
        c = input.nextDouble();
        d = input.nextDouble(); 
        e = input.nextDouble();
        f = input.nextDouble(); 
        g = input.nextDouble();
        h = input.nextDouble(); 
        i = input.nextDouble();
        System.out.println((b + c + d + e + f + g + h + i + j + k) / amount );
        }

        if(amount == 9)
        {
        System.out.println("Enter your values");
        b = input.nextDouble(); 
        c = input.nextDouble();
        d = input.nextDouble(); 
        e = input.nextDouble();
        f = input.nextDouble(); 
        g = input.nextDouble();
        h = input.nextDouble(); 
        i = input.nextDouble();
        j = input.nextDouble();
        System.out.println((b + c + d + e + f + g + h + i + k + j) / amount );
        }

        if(amount == 10)
        {
        System.out.println("Enter your values");
        b = input.nextDouble(); 
        c = input.nextDouble();
        d = input.nextDouble(); 
        e = input.nextDouble();
        f = input.nextDouble(); 
        g = input.nextDouble();
        h = input.nextDouble(); 
        i = input.nextDouble();
        j = input.nextDouble(); 
        k = input.nextDouble();
        System.out.println((b + c + d + e + f + g + h + i + k + j) / amount );
        }

        

        
        
    }
}