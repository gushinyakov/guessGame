import java.util.Random;
import java.util.Scanner;

public class GameCheck {

    GameVisual gameVisual = new GameVisual();

    // set random value
    public int setRandom(int bound, int min) {
        Random random = new Random();
        return random.nextInt(bound) + min;
    }

    // sub two values: a - b
    public int sub(int a, int b) {
        assert(a >= b);
        return a - b;
    }


    // user String input
    public String userInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    // check user input value. Type must be int and  minVal <= value <= maxVal
    public boolean correctUserInt(String userInput, int maxVal, int minVal) {
        if (!userInput.matches("[0-9]+") ||
                Double.parseDouble(userInput) > maxVal ||
                Double.parseDouble(userInput) < minVal )
        {
            return false;
        }
        return true;
    }

    public String userAnswer (String answer) {
        return answer.trim().toLowerCase().substring(0,1);
    }


}

