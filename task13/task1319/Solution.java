package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        boolean isExit = false;

        while (!isExit){
            String newString = reader.readLine();


            writer.write(newString + "\n");


            isExit = newString.equals("exit");
        }
        writer.close();

    }
}
