package com.javarush.task.task14.task1417;

public class USD extends Money{
    public USD(double a){
        super(a);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
