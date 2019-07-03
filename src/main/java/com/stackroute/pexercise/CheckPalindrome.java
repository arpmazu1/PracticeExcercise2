package com.stackroute.pexercise;

public class CheckPalindrome {
    //Checking if String is palindrome or nto
        public String palindrome(String str) {
            if(str==null)
                return "null";
            String orig = str;
            String rev="";

            for(int i = str.length() - 1; i >= 0; i--)
            {
                rev = rev + str.charAt(i);
            }

            if (orig.equals(rev)) {
                return "Palindrome";
            }
            else
                return "Not Palindrome";
        }
    }


