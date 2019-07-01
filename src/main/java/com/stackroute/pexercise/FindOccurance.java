package com.stackroute.pexercise;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FindOccurance {
    public static void main(String[] args) throws IOException {

        File file = new File("/home/arpita/Practice-exercise-2/src/main/java/com/stackroute/pexercise/text2.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        Map<String, Integer> map = new HashMap<>();
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
            String[] str = st.split("\\s+|\\.|,");


            for (String w : str) {
                Integer n = map.get(w);
                n = (n == null) ? 1 : ++n;
                map.put(w, n);
            }
        }
        System.out.println(map);
    }
}

