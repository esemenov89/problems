package org.just.leetcode.leetcode1507;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<String, String> MONTHS = new HashMap<>();

    static {
        MONTHS.put("Jan", "01");
        MONTHS.put("Feb", "02");
        MONTHS.put("Mar", "03");
        MONTHS.put("Apr", "04");
        MONTHS.put("May", "05");
        MONTHS.put("Jun", "06");
        MONTHS.put("Jul", "07");
        MONTHS.put("Aug", "08");
        MONTHS.put("Sep", "09");
        MONTHS.put("Oct", "10");
        MONTHS.put("Nov", "11");
        MONTHS.put("Dec", "12");
    }

    public String reformatDate(String date) {
        String result;
        String[] dateSplit = date.split(" ");
        result = dateSplit[2] + "-" + MONTHS.get(dateSplit[1]) + "-";
        if (Character.isDigit(dateSplit[0].charAt(1))) {
            result += dateSplit[0].substring(0, 2);
        } else {
            result += "0" + dateSplit[0].charAt(0);
        }

        return result;
    }
}