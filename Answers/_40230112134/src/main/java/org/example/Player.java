package org.example;

import java.util.Random;

class Player implements Success
{
    Random MakeRandomNumber = new Random();
    int c = MakeRandomNumber.nextInt(100);
    String name;
    int number ;
    public void setPlayer(String name , int number)
    {
        this.name = name;
        this.number = number;
    }
    @Override
    public int isSuccessful()
    {
        return 2;
    }
}
class Keeper extends Player
{
    public void setKeeper(String name, int number)
    {
        this.name = name;
        this.number = number;
    }
    @Override
    public int isSuccessful()
    {
        if (c < 70)
        {
            c = 1;
        }
        else
        {
            c = 0;
        }
        return c;
    }
}
class Seeker extends Player
{

    public void setSeeker(String name, int number)
    {
        this.name = name;
        this.number = number;
    }
    @Override
    public int isSuccessful()
    {
        if (c < 5)
        {
            c = 1;
        }
        else
        {
            c = 0;
        }
        return c;
    }
}
class Chaser extends Player
{
    public void setChaser(String name, int number)
    {
        this.name = name;
        this.number = number;
    }
    @Override
    public int isSuccessful()
    {
        if (c < 30)
        {
            c = 1;
        }
        else
        {
            c = 0;
        }
        return c ;
    }
}
class Beater extends Player
{
    public void setBeater(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    @Override
    public int isSuccessful()
    {
        if (c < 40)
        {
            c = 1;
        }
        else
        {
            c = 0;
        }
        return c;
    }
}
