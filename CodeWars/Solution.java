/*
Write a program that will calculate the number of trailing zeros in a factorial of a given number.

http://mathworld.wolfram.com/Factorial.html

N! = 1 * 2 * 3 * 4 ... N

zeros(12) = 2 # 1 * 2 * 3 .. 12 = 479001600
that has 2 trailing zeros 4790016(00)
Be careful 1000! has length of 2568 digital numbers.
*/

import java.math.*;

public class Solution {

    public static int zeros(int n) {
        int count = 0;
        BigInteger r = BigInteger.ONE;
        for(int i = 1; i <= n; i++) {
            r = r.multiply(BigInteger.valueOf(i));
        }
        String s = String.valueOf(r);
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '0') count++;
            else break;
        }
        return count;
    }

}
