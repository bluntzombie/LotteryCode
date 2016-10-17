package lottery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Christopher Kambayi
 * Date: 11/10/2016
 * Lottery.java
 */

import javax.swing.JOptionPane;

public class LotteryApp 
{
    public static void main(String [] args)
    {
        //Declaring variables
        int [][] lotto = new int [3][5];
        
        //Creating objects
        Lottery myLotto = new Lottery(lotto);
        
        //Array for user's guesses
        int [] lucky = new int [5];
        
        //while loop to input guesses into array
        int i = 0;
        while(i!=5)
        {
            lucky[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number: " + (i+1)));
            i++;
        }
        
        //generate the random numbers
        myLotto.generate();
        
        //compare the random numbers with entered numbers
        myLotto.verify(lucky);
        
        //print the generated numbers
        myLotto.printResults(); 
        
        //print the entered numbers
        System.out.println("Your guesses are :" + lucky[0]+ " " + lucky[1]+ " " + lucky[2]+ " " + lucky[3]+ " " + lucky[4]);
    }
}
