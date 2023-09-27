package ProjectEuler;

public class ProjectEuler12 {
    public static void main(String[] args)
    {
        long bigNumber = 0;   // IT TAKES LIKE 5 MINUTES TO FIND IT
        long countingNumber = 0;
        int numDivisors = 0;

        while(numDivisors < 500)
        {
            numDivisors = 0;
            countingNumber++;
            bigNumber += countingNumber;
            for(int i = 1; i <= bigNumber/2; i++)
            {
                if(bigNumber % i == 0)
                {
                    numDivisors++;
                    
                }
            }
            System.out.println("STILL SEARCHING FOR BIG FAT NUMBER " + bigNumber);
            
        }
        System.out.println("BIG NUMBER WAS FOUND!!!!! " + bigNumber);
    }

}
