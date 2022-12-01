import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GuessRules rules = new GuessRules(); //calling other class, GuessRules
        rules.rulesn(in); //using what user inputs to other class code
    }
}

