import java.util.Scanner;

/**
 * Game launch
 */

public class GameLaunch {

    private static GameLogic game = new GameLogic();
    private static GameCheck gameCheck = new GameCheck();
    private static GameVisual gameVisual = new GameVisual();

    public static void main(String[] args) {


        setSettings();

        boolean playAgain = true;
        while (playAgain) {
            gameVisual.playAgain();
            if (gameCheck.userAnswer(gameCheck.userInput()).equals("y")) {
                setSettings();
            } else {
                playAgain = false;
            }
        }


    }

    static void setSettings() {

        gameVisual.greeting();

        String userInput = "error";
        do {
            userInput = gameCheck.userAnswer(gameCheck.userInput());

            if (userInput.equals("y")) {
                //changing boundaries
                gameVisual.changeBound();
                String inputBound = gameCheck.userInput();

                while (! gameCheck.correctUserInt(inputBound, 1000, 10) ) {
                    gameVisual.incorrectNum();
                    inputBound = gameCheck.userInput();
                }

                int newBound = Integer.parseInt(inputBound);

                //changing amount of attempts
                gameVisual.changeAttempts();
                String inputAttempt = gameCheck.userInput();

                while (!gameCheck.correctUserInt(inputAttempt, 10, 1)){
                    gameVisual.incorrectNum();
                    inputAttempt = gameCheck.userInput();
                }

                int newAttempt = Integer.parseInt(inputAttempt);

                gameVisual.saveSettings();
                game.gameStart(newBound, newAttempt);

            } else if (userInput.equals("n")) {
                game.gameStart(100, 8);
            } else {
                gameVisual.incorrectAnswer();
                userInput = "error";
            }
        } while (userInput.equals("error"));


    }

}

