package org.just.leetcode.leetcode535;

import java.util.Base64;

public class Codec {

    public String encode(String longUrl) {
        String result = longUrl;
        int lastIndexOfSlash = result.lastIndexOf("/");
        String temp = longUrl.substring(0, lastIndexOfSlash + 1);
        if (lastIndexOfSlash == longUrl.length() - 1) {
            lastIndexOfSlash = temp.substring(0, temp.length() - 1).lastIndexOf("/");
            temp = longUrl.substring(0, lastIndexOfSlash + 1);
        }
        String temp2 = longUrl.substring(lastIndexOfSlash + 1);
        temp2 = Base64.getEncoder().encodeToString(temp2.getBytes());
        temp2 = temp2.replace('/', '[');
        result = temp + temp2;
        return result;
    }

    public String decode(String shortUrl) {
        String result = shortUrl;
        int lastIndexOfSlash = result.lastIndexOf("/");
        String temp = shortUrl.substring(0, lastIndexOfSlash + 1);
        if (lastIndexOfSlash == shortUrl.length() - 1) {
            lastIndexOfSlash = temp.substring(0, temp.length() - 1).lastIndexOf("/");
            temp = shortUrl.substring(0, lastIndexOfSlash + 1);
        }
        String temp2 = shortUrl.substring(lastIndexOfSlash + 1);
        temp2 = temp2.replace('[', '/');
        temp2 = new String(Base64.getDecoder().decode(temp2.getBytes()));
        result = temp + temp2;
        return result;
    }
}