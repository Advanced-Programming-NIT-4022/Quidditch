package org.example;

import java.util.Random;

abstract class Player implements Success
{

    String name;
    int number ;
    public Player(String name, int number)
    {
        this.name = name;
        this.number = number;
    }
}
class Keeper extends Player
{

    public Keeper(String name, int number)
    {
        super(name, number);
    }
    @Override
    public int isSuccessful()
    {
        Random MakeRandomNumber = new Random();
        int c = MakeRandomNumber.nextInt(100);
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


    public Seeker(String name, int number)
    {
        super(name, number);
    }
    @Override
    public int isSuccessful()
    {
        Random MakeRandomNumber = new Random();
        int c = MakeRandomNumber.nextInt(100);
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
    public Chaser(String name, int number)
    {
        super(name, number);
    }
    @Override
    public int isSuccessful()
    {
        Random MakeRandomNumber = new Random();
        int c = MakeRandomNumber.nextInt(100);
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
    public Beater(String name, int number)
    {
        super(name, number);
    }
    @Override
    public int isSuccessful()
    {
        Random MakeRandomNumber = new Random();
        int c = MakeRandomNumber.nextInt(100);
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
