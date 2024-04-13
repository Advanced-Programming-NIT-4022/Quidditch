package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            match object = new match();
            object.start();

            System.out.println(" 1) Rematch 2) Close ");
            int response = scanner.nextInt();

            if (response == 1)
                continue;
            if (response ==2)
                break;
            if (response!=1 || response!=2)
                System.out.println("wrong input!!!");
            }
        }
    }
