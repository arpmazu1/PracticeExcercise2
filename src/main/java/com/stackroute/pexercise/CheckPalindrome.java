package com.stackroute.pexercise;

public class CheckPalindrome {
        public String palindrome(int n) {
            int orig = n;
            int rev = 0;
            while (n > 0) {
                int t = n % 10;
                rev = 10 * rev + t;
                n = n / 10;
            }
            if (orig == rev) {
                return "Palindrome";
            }
            else
                return "Not Palindrome";
        }
    }


