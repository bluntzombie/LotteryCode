/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

/**
 * @author Christopher Kambayi
 * Date: 11/10/2016
 * Lottery.java
 */

public class Lottery 
{
    //Declaring variables
    private int [][] lotto;
    private int lineOne, lineTwo, lineThree;

    //Default constructor
    public Lottery()
    {
        this.lotto = new int[3][5];
        lineOne = 0;
        lineTwo = 0;
        lineThree = 0;
    }
    //Overloaded constructor
    public Lottery(int[][] lotto) 
    {
        this.lotto = lotto;
        lineOne = 0;
        lineTwo = 0;
        lineThree = 0;
    }

    //generates 5 random numbers into an array
    public void generate()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 5; j++)
            {             
                lotto[i][j] = 1 + (int)(Math.random() * 40);
            }
        }
    }
    
    //Compares generated numbers against numbers in entered array
    public void verify(int [] numbers)
    {
       int counter = 0;
       for(counter = 0;counter < 5; counter++)
       {
            for(int i = 0; i < 3; i++)
            { 
               for(int x = 0; x < 5; x++)
               {
                   if(numbers[counter] == lotto[i][x])
                   {
                       if(i==0)
                       lineOne = lineOne + 1;

                       if(i==1)
                       lineTwo = lineTwo + 1;

                       if(i==2)
                       lineThree = lineThree + 1;  
                   }            
                }        
            } 
       }
    }

    public int getLineOne() 
    {
        return lineOne;
    }

    public int getLineTwo() 
    {
        return lineTwo;
    }

    public int getLineThree() 
    {
        return lineThree;
    }

    
    //Prints the results
    public void printResults()
    {
        System.out.println("Lotto Numbers are :" + lotto[0][0]+ " " + lotto[0][1]+ " " + lotto[0][2]+ " " + lotto[0][3]+ " " + lotto[0][4]);
        System.out.println("Lotto Numbers are :" + lotto[1][0]+ " " + lotto[1][1]+ " " + lotto[1][2]+ " " + lotto[1][3]+ " " + lotto[1][4]);
        System.out.println("Lotto Numbers are :" + lotto[2][0]+ " " + lotto[2][1]+ " " + lotto[2][2]+ " " + lotto[2][3]+ " " + lotto[2][4]);
        System.out.println("You got " + lineOne + " right");
        System.out.println("You got " + lineTwo + " right");
        System.out.println("You got " + lineThree + " right");
    }
}