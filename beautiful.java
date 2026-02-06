package bha;

import java.util.Arrays;

public class beautiful {
    public static void main(String[] args) {
        String s = "abdde";
        int n = s.length();
        int[] a = new int[n];

        // map chars to 0..25
        for (int i = 0; i < n; i++) a[i] = s.charAt(i) - 'a';
        Arrays.sort(a);

        int l = 0, r = 0, best = 0;

        // while-loop sliding window: keep max - min <= 1
        while (r < n) {
            while (a[r] - a[l] > 1) l++;
            int len = r - l + 1;
            if (len > best) best = len;
            r++;
        }

        // minimum deletions = total length - longest beautiful len
        System.out.println(n - best); // Output: 2
    }
}