
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author georgedias
 */
public class Guess {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random r = new Random(); 
        int number = r.nextInt(100); // number is now  random int less than 100
        int[] guesses = new int[10]; // this code i can save all number of guess 
        int count = 0;// start the guess between 0 and 10
        int guess; // i can save the guess 
        
        while (count < 10) { // loop
            System.out.print("Guess the number (0-100): ");
            guess = input.nextInt();
            
            boolean alreadyGuessed = false; // variable where in can use in true or false
            for (int i = 0; i < count; i++) { //this code for check if users are trying to guess the number
            if (guesses[i] == guess) {
            System.out.println("That was a waste - you already guessed that number!");
            alreadyGuessed = true;
            break;
            }
        }
            
            if (alreadyGuessed) {
                continue;
                
            }
            guesses[count] = guess; // save the numbers in [] guesses and count
            count++;
            
            if (guess == number) {
                System.out.println("You win!");
                break; // the program finished
          
                
             
            } else if (count == 0) {
                System.out.println("Hard luck! The number was " + number);
            } else {
          
                System.out.println("Try again. You have " + count + " guesses left.");
            }
        }
    }
}    