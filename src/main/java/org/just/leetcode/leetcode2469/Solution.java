package org.just.leetcode.leetcode2469;

public class Solution {

    public double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        double scale = Math.pow(10, 5);
        result[0] = Math.round((celsius + 273.15) * scale) / scale;
        result[1] = Math.round((celsius * 1.80 + 32.00) * scale) / scale;
        return result;
    }
}