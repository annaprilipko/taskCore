package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        boolean checkExit = true;

        while(checkExit) {

            key = reader.readLine();
            //переменная checkExit никогда не бывает false. Но зачем она тогда нужна.
            if(key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"))checkExit = true;
            else break;

            if (key.equals("user")) {
                person = new Person.User();
            } else if (key.equals("loser")) {
                person = new Person.Loser();
            } else if (key.equals("coder")) {
                person = new Person.Coder();
            } else {
                person = new Person.Proger();
            }
            // Да можно немного упростить код. Но лучше при встречи это обсудить потому что много писать)

            doWork(person);
        }
    }

    public static void doWork(Person person) {

        if( person instanceof Person.User) ((Person.User) person).live();
        else if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
