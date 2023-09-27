package ProjectEuler;

import java.math.BigInteger;

public class ProjectEuler16 {

    public static void main(String[] args)
    {


        String num = Integer.toString((int) Math.pow(2, 15));
        long sum = 0;
        for(int i = 0; i < num.length(); i++)
        {
            sum += Long.parseLong(Character.toString(num.charAt(i)));
        }
        System.out.println(sum);
    }

    public String power(long num, long exp)
    {
        BigInteger result = new BigInteger.valueOf(9);
        for(int i = 1; i <= exp; i++)
        {
            BigInteger 
        }


        return "";
    }

}
