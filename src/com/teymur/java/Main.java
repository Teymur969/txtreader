package com.teymur.java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

public class Main {


    public static void main(String[] args) throws IOException
    {
        String path = args[0];
        String soz = args[1];
        String text = new String(Files.readAllBytes(Paths.get(path)));
        //   File file = new File("C:\\Users\\Teymur\\Desktop\\Nana az\\chargebox");
       // Scanner text = new Scanner(new File("C:\\Users\\Teymur\\Desktop\\Nana az\\chargebox\\test.txt"));
        int index = text.indexOf(soz);

         System.out.println(index);

    }
}
