package com.stackroute.pexercise;

public class CheckPower {
    public String Check( int n ){

        if (n==0)
            return "Zero";
        while(n!=1)
        {
            if(n%4!=0)
            {  return "The number is not a power of 4";}
            n=n/4;
        }
        return "The number is a power of 4";
    }
}
