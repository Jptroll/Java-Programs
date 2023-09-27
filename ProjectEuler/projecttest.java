package ProjectEuler;

public class projecttest {
    public static void main(String[] args) {
        long bigNumber = 0;  // the big triangle number we're looking for
        long countingNumber = 0;  // the current number we're adding to the triangle number
        int numDivisors = 0;  // the number of divisors of the current triangle number

        while (numDivisors < 500) {
            countingNumber++;  // increment the current counting number
            bigNumber += countingNumber;  // add the counting number to the triangle number
            numDivisors = countDivisors(bigNumber);  // count the divisors of the triangle number
            System.out.println("STILL SEARCHING FOR BIG FAT NUMBER " + bigNumber);
        }

        System.out.println("BIG NUMBER WAS FOUND!!!!! " + bigNumber);
    }

    private static int countDivisors(long n) {
        int count = 1;  // start with 1 because every number has at least 1 divisor (itself)
        for (int i = 2; i * i <= n; i++) {  // iterate up to the square root of n
            int exponent = 0;  // count the exponent of the current prime factor
            while (n % i == 0) {  // while i is a prime factor of n
                exponent++;  // increment the exponent
                n /= i;  // divide n by i to remove the current factor from n
            }
            count *= (exponent + 1);  // update the count using the formula based on the prime factors
        }
        if (n > 1) {  // if n has a prime factor greater than the square root
            count *= 2;  // add 1 to the count (for the prime factor) and multiply by 2
        }
        return count;  // return the final count
    }
}

