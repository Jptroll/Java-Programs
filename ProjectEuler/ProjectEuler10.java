package ProjectEuler;


public class ProjectEuler10 {
    public static void main(String[] args)
    {
        long sum = 2;
        for(int i = 3; i < 2000000; i += 2)
        {
            if(isPrime(i) == true)
            {
                sum += i;
            }
            
        }
        System.out.println(sum);
    }


    public static boolean isPrime(int value)
    {
        for(int i = 2; i < value/2; i++)
        {
            if(value % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
