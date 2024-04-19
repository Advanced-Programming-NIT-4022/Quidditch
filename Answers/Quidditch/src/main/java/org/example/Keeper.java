package org.example;

public class Keeper extends Player implements isSuccess{
    @Override
    public void isSuccess() {
        double rand = Math.random()*100;
        rand = (Math.floor(rand))%100+1;
        if(rand<=70)
        {
            isSuccessful = true;
        }
    }
    public void Setname(String name)
    {
        this.name = name;
    }
}
