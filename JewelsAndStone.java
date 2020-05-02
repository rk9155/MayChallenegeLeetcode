package io.github.jiangdequan;

import java.util.*;

public class JewelsAndStone {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        int ans = numJewelsInStones(s1, s2);
        System.out.print(ans);
    }

    static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (S.charAt(i) == J.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}