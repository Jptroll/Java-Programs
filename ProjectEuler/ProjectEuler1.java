package ProjectEuler;
public class ProjectEuler1 {
    public static void main(String[] args)
    {
        // If we list all the natural numbers below 10 that are multiples of 3 or 5, 
        // we get 3, 5, 6 and 9. The sum of these multiples is 23.
        // Find the sum of all the multiples of 3 or 5 below 1000.
        int x = 0;
        for(int i = 3; i < 1000; i+=3)
        {
            if(i % 5 != 0)
            {
                x = i + x;
            }
        }
        
        for(int h = 5; h < 1000; h+=5)
        {
            x = h + x;
        }
        
        System.out.println(x);
    }
}
