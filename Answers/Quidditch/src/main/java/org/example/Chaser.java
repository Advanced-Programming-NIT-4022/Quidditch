package org.example;

public class Chaser extends Player implements isSuccess{
    public void isSuccess() {
        double rand = Math.random()*100;
        rand = (Math.floor(rand))%100+1;
        if(rand<=30)
        {
            isSuccessful = true;
        }

    }
}
