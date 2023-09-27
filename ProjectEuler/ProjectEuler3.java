package ProjectEuler;
public class ProjectEuler3 {
    public static void main(String[] args)
    {
        // The prime factors of 13195 are 5, 7, 13 and 29
        // What is the largest prime factor of the number 600851475143 ?
        int x = 2;
        int y = Integer.MAX_VALUE;
        int z = 1;
        for(int i = 2; i <= 13195/2; i++)
        {
            while((i/2) % x != 0)
            {
                y = i/2;
                x++;
                if(x == y && i % x == 0)
                {
                    z = x;
                }
            }
        }
        System.out.println(z);
    }
}
