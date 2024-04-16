package org.example;

import java.util.Scanner;


public class MyApp {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (; ; ) {
            Match match = new Match();
            match.Start();
            System.out.print(" 1) Rematch \n 2) Exit \n >>> ");
            char ans = input.next().charAt(0);
            switch (ans) {
                case '1': {
                    continue;

                }
                case '2': {
                    return;
                }
                default: {
                    System.out.println(" Wrong command number !!");
                    return;
                }
            }

        }


    }

}
