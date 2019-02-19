package com.company;

public class Difference {
    public char findTheDifference(String s, String t) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret -= (int) s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            ret += (int) t.charAt(i);
        }
        System.out.println(ret);
        return (char) ret;
    }
}
