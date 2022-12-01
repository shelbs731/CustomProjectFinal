import java.util.*;

public class GuessRules extends GuessingGame
{    
    void rulesn(Scanner in) {
        try {
        Random random = new Random(); //generate random number
        int answer = random.nextInt(100); //add def to random number 1-100
        answer++;
        int tries = 0; //add def to number of tries for output of how many tries it took
        int guess; //users input
        boolean win = false; //to start the program
        
        while (win == false) {
            //the loop starts
            System.out.println("Guess the number 1-100: "); //print the question once the main program starts
            guess = in.nextInt(); //add def to the users input
        
        if (guess > 100) {
            System.out.println("Your guess is not within range."); //to keep the guess within bounds (1-100)
        } else if (guess < 1) {
            System.out.println("Your guess is not within range."); //to keep the guess withing bounds (1-100)
        } else if (guess == answer) {
            win = true; //the loop stops once number is guessed correctly
            tries++; //count number of tries for output
        }else if (guess < answer) {
            System.out.println("Higher.");
            tries++; //count number of tries for output
        } else if (guess > answer) {
            System.out.println("Lower."); 
            tries++; //count number of tries for output
        }
        }
        System.out.println("You got it! The number was " + answer + "."); //output once the program finishes/user guesses the number correctly
        System.out.println("It took you " + tries + " tries."); //the total number of tries from tries++'s counts
    } catch (Exception e) {
        System.out.println("Something went wrong, restart the program.");
    }
}
}