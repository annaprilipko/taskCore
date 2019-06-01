package com.javarush.task.task14.task1417;

public class Hrivna extends Money {

    public Hrivna(double a){
        super(a);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
