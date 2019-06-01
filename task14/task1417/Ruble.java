package com.javarush.task.task14.task1417;

public class Ruble extends Money{

    public Ruble(double a){
        super(a);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
