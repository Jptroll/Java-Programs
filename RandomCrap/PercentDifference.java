package RandomCrap;
import java.util.Scanner;

public class PercentDifference
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(input);
        
        System.out.println("Enter two doubles");
        double x = input.nextDouble(); // Assign x and y, the two variables
        double y = input.nextDouble();
        
        System.out.println(((-1*(x - y))/((x + y)/2))*100);
        
        
    }
}

