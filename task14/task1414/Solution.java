package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean checkExit = true;
        while (checkExit){
            String key = reader.readLine();

            Movie movie = MovieFactory.getMovie(key);
            // тут та же беда с переменной checkExit. Она никогда не меняется и ведёт бессмысленную жизнь)
            if(key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera")) checkExit = true;
            else break;

            System.out.println(movie.getClass().getSimpleName());

        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            //может ли в метод попасть неверный ключ? и что в таком случае произойдёт?
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)){
                movie = new Cartoon();
            } else if("thriller".equals(key)){
                movie = new Thriller();
            }else{
                //Непонятно зачем нужен последний елсе
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

}
