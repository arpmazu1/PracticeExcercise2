package com.stackroute.pexercise;

import java.io.*;


public class ConvertIntoUppercase {
    public static void main(String[] args) throws IOException
    {
        int ch;
    FileReader fr=null;
        try
    {
        fr = new FileReader("/home/arpita/Practice-exercise-2/src/main/java/com/stackroute/pexercise/text1.txt");
    }
        catch (FileNotFoundException fe)
    {
        System.out.println("File not found");
    }

       while ((ch=fr.read())!=-1) {
           if(Character.isLowerCase(ch))
               ch = Character.toUpperCase(ch);
           System.out.print((char)ch);

       }
        fr.close();
} }