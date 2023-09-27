package RandomCrap;
import java.util.*;
public class triangles {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(input);
        
        System.out.println("Please enter height: ");
        Double height = input.nextDouble();

        System.out.println("Please enter width:");
        Double width = input.nextDouble();

        double hypotenuse = Math.sqrt((height*height) + (width*width)); 

        double widthAngle = Math.toDegrees(Math.atan((height)/(width)));
        double heightAngle = Math.toDegrees(Math.atan((width)/(height)));

        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Hypotenuse: " + ((int) (hypotenuse + 0.5)));
        System.out.println("Width angle " + widthAngle);
        System.out.println("Height angle " + heightAngle);
    }
    
}
