package RandomCrap;
import java.util.*;
public class CuadraticFormulaCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(input);
        System.out.println("Enter A value");
        double a = input.nextDouble();

        System.out.println("Enter B value");
        double b = input.nextDouble();

        System.out.println("Enter C value");
        double c = input.nextDouble();

        double discriminator = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        if(discriminator >= 0)
        {
            System.out.println("X1 = " + ((-b + discriminator)/ (2 * a)));
            System.out.println("X2 = " + ((-b - discriminator)/ (2 * a)));
        }
        
        else {
            System.out.println("Imaginary number");
            discriminator = Math.sqrt(-(Math.pow(b, 2) - (4 * a * c)));
            System.out.println("X1 = " + (("(" + -b + " + " + (discriminator + "i")) + ")" + " / " + (2 * a)));
            System.out.println("X2 = " + (("(" + -b + " - " + (discriminator + "i")) + ")" +  " / " + (2 * a)));
        }

    }
}