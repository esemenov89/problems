package org.just.leetcode.leetcode1922;

import java.math.BigInteger;

public class Solution {

    private final long mod = 1000000007;

    public int countGoodNumbers(long n) {
        return (int) ((quickmul(5, (n + 1) / 2) * quickmul(4, n / 2)) % mod);
    }

    // use fast exponentiation to calculate x^y % mod
    public long quickmul(int x, long y) {
        long ret = 1;
        long mul = x;
        while (y > 0) {
            if (y % 2 == 1) {
                ret = (ret * mul) % mod;
            }
            mul = (mul * mul) % mod;
            y /= 2;
        }

        return ret;
    }

    public int countGoodNumbers2(long n) {
        int result;
        BigInteger bigIntegerResult = BigInteger.ONE;
        BigInteger module = BigInteger.valueOf(1_000_000_007);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                bigIntegerResult = bigIntegerResult.multiply(BigInteger.valueOf(5));
            } else {
                bigIntegerResult = bigIntegerResult.multiply(BigInteger.valueOf(4));
            }
        }
        bigIntegerResult = bigIntegerResult.mod(module);
        result = bigIntegerResult.intValue();
        return result;
    }
}