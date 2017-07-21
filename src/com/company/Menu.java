package com.company;

import java.util.Scanner;

/**
 * Created by cosminciocan on 19/07/2017.
 */
public class Menu {
    ReadInput readInput = new ReadInput();


    public void printOptions()
    {
        System.out.println("Meniul este: \n" +
                "1. Adunare\n" +
                "2. Scadere\n" +
                 "0. LogOut");

    }

    public boolean chooseOption(int option){

        switch (option){

            case 1:
                System.out.println("Introdu doua numere.");
                int nr1 = readInput.readNumber();
                int nr2 = readInput.readNumber();
                Calculator calculator = new Calculator();
                System.out.println("Rezultatul este: ");
                System.out.println(calculator.sum(nr1, nr2) );
               // System.out.println("");
                break;
            case 0:
                System.out.println("Exit");
                //int nr3=readInput.readNumber();
                return false;
            default:
                System.out.println("");


        }
        return true;
    }
    public void runProgram(){
        int option;
        do{  printOptions();
            System.out.println("Alege optiunea: ");

            option = readInput.readNumber();

        }
        while(chooseOption(option));




    }
}
