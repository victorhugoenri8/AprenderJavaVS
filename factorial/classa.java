package factorial;
import java.math.BigInteger;

import factorial.dos;
public class classa {
    public static void main(String[] args) {

        // dos ee = new dos();
        // ee.hola();



                        
                    BigInteger fact = fact(100);
                    System.out.println("fact(100) = " + fact);
                    System.out.println("fact(100).longValue() = " + fact.longValue());
                    System.out.println("fact(100).intValue() = " + fact.intValue());
                    int powerOfTwoCount = 0;
                    BigInteger two = BigInteger.valueOf(2);
                    while (fact.compareTo(BigInteger.ZERO) > 0 && fact.mod(two).equals(BigInteger.ZERO)) {
                        powerOfTwoCount++;
                        fact = fact.divide(two);
                    }
                    System.out.println("fact(100) powers of two = " + powerOfTwoCount);
                }

                private static BigInteger fact(long n) {
                    BigInteger result = BigInteger.ONE;
                    for (long i = 2; i <= n; i++)
                        result = result.multiply(BigInteger.valueOf(i));
                    return result;
                    
                    }
    
}

