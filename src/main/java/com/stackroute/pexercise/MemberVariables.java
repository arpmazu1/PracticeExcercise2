package com.stackroute.pexercise;

public class MemberVariables {
    Members me;

    public String Display()
    {
       String s;
       me = new Members();
       s=("Name:"+me.getName());
       s=s+("\nAge:"+me.getAge());
       s=s+("\nSalary:"+me.getSalary());

       return s;
    }
}
