package org.just.leetcode.leetcode1108;

public class Solution {

    public String defangIPaddr(String address) {
        String result = address.replaceAll("\\.", "[.]");
        return result;
    }
}