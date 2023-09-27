package ProjectEuler;

public class ProjectEuler14 {
    public static void main(String[] args)
    {
        int num = 1;
        long altNum = 0;
        int finalNum = 0;
        long chainNum = 0;
        long finalChainNum = 0;
        while(num < 1000000)
        {
            chainNum = 0;
            num++;
            altNum = num;
            while(altNum != 1)
            {
                if(altNum % 2 == 0)
                {
                    altNum /= 2;
                    chainNum++;
                }
                else  
                {
                    altNum = (altNum * 3) + 1;
                    chainNum++;

                }
            }
            System.out.println(num);
            if(chainNum > finalChainNum)
            {
                finalChainNum = chainNum;
                finalNum = num;
            }
        }
        System.out.println(finalNum);
    }
    
}
