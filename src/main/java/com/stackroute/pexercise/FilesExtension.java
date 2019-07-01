package com.stackroute.pexercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllBytes;

public class FilesExtension {

    public static void main(String a[]) throws IOException {
        File file = new File("/home/arpita/Practice-exercise-2");
        File[] files = file.listFiles();

            for (File f : files) {
                System.out.println(f.getName());
            }
            Path path= Paths.get("/home/arpita/Practice-exercise-2/src/main/java/com/stackroute/pexercise/text2.txt");
            byte[] data= readAllBytes(path);
        System.out.println(new String(data));
    }
}
