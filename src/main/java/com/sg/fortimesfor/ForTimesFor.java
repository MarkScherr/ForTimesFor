/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.fortimesfor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mrsch
 */
public class ForTimesFor {
    public static void main(String[] args) {
        int multiplyBy, numberGuessed;
        int correctGuesses = 0; 
        int totalGuesses = 0;
        int randomMultiplier;
        
        Random rdm = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the number table you want to be challenged: ");
        multiplyBy = in.nextInt();
        
        while(totalGuesses < 11) {
            randomMultiplier = rdm.nextInt(10)+3;
            
            System.out.println("What is " + multiplyBy + " x " + randomMultiplier);
            numberGuessed = in.nextInt();
            
            if (numberGuessed == (multiplyBy * randomMultiplier)) {
                System.out.println("You are a rock star!\n");
                correctGuesses++;
            } else {
                System.out.println("You need to try on the next one!\n");
            }
           totalGuesses++;
        }
        if (correctGuesses <= 9) {
            System.out.println("You need some work on these you only got " + correctGuesses
            + "/11  :(");
        } else {
         System.out.println("You got a total of " + correctGuesses + "/11 correct! Great job! ");
        }
    }
}
