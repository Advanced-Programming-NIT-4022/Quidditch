package org.example;

public class Beater extends Player implements isSuccess{
    public void isSuccess() {
        double rand = Math.random()*100;
        rand = (Math.floor(rand))%100+1;
        if(rand<=40)
        {
            isSuccessful = true;
        }

    }
    public void Setname(String name)
    {
        this.name = name;
    }
}
