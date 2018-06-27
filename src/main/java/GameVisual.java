
public class GameVisual {

    /*
        Visual comments for launching guessGame
     */
    void textMsg(String msg) {
        System.out.println(msg);
    }

    void greeting() {
        textMsg("Welcome to guess Game. Do you want to change game settings? [Yes/No]");
    }

    void changeBound() {
        textMsg("Set new bound (from 10 to 1000)");
    }

    void changeAttempts() {
        textMsg("Set amount of attempt (from 1 to 10)");
    }

    void saveSettings() {
        textMsg("All changes were saved.");
    }

    void playAgain() {
        textMsg("Do you want play again? [Yes/No]");
    }

    /*
        Info comments for game logic
     */
    void startGame(int bound) {
        textMsg("You should guess the number from 0 to " + bound +
                "\nGood luck!\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    void inputMsg(int attempt) {
        textMsg("You have " + attempt + " attempts\nInput number");
    }

    void helpMsg(int helpNum, boolean over) {
        if (over) {
            textMsg("Number less than: " + helpNum);
        } else {
            textMsg("Number more than: " + helpNum);
        }
    }

    void win() {
        textMsg("Congratulations, you win!");
    }

    void lose(int settedNum) {
        textMsg("You lose. The number was: " + settedNum);
    }

    void closeToWin() {
        textMsg("Your answer is very close");
    }

    /*
        Error messages
     */

    void incorrectNum() {
        textMsg("Incorrect number! Try again");
    }

    void incorrectAnswer() {
        textMsg("Your answer must be \"Yes\" or \"No\"! Try again");
    }

}
