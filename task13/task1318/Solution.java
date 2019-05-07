package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(str));

        while (inputStream.available() > 0){
            char c = (char)inputStream.read();
            System.out.print(c);
        }

        inputStream.close();
        reader.close();

    }
}