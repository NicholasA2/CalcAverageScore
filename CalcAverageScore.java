/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcaveragescore;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Nicholas Adiohos
 */
public class CalcAverageScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Get the amount of numbers to make
        int amountOfNumbers;
        Scanner getAmount = new Scanner(System.in);
        System.out.print("Enter the amount of random numbers you want generated: ");
        amountOfNumbers = getAmount.nextInt();
        
        //Naming values
        int sum = 0;
        int divideBy = 0;
        
        //Use a for loop to increment a variable that will give a new random number each time
        for (int i=0;i<amountOfNumbers;i++)
        { Random randomNumberStepOne = new Random();
        int randomNumberStepTwo = randomNumberStepOne.nextInt(101);
           if (randomNumberStepTwo>40) {
        divideBy = ++divideBy;
        sum = sum + randomNumberStepTwo;
        System.out.println(randomNumberStepTwo);
        System.out.println(divideBy);
        }
        }
        
        //Calculate average
        if (divideBy==0)
        {  System.out.print("Average is 0");}
        else{
        int average = sum / divideBy;
        System.out.println("The average is: " + average);}
    }
    
}
