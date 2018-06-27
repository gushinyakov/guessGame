
public class GameLogic {

    GameCheck gameCheck = new GameCheck();
    GameVisual gameVisual = new GameVisual();

    public void gameStart(int bound, int attempt) {

        gameVisual.startGame(bound);
        int setNumber = gameCheck.setRandom(bound, 0);

        for (int i = 0; i < attempt; i++) {

            gameVisual.inputMsg(attempt - i);
            String userInput = gameCheck.userInput();

            while (! gameCheck.correctUserInt(userInput, bound, 0) ) {
                gameVisual.incorrectNum();
                userInput = gameCheck.userInput();
            }

            int userGuess = Integer.parseInt(userInput);

            if (userGuess == setNumber) {
                gameVisual.win();
                break;
            }

            if (i == (attempt - 1) ){
                gameVisual.lose(setNumber);
                break;
            }

            if (gameCheck.sub(userGuess, setNumber) == 1 || gameCheck.sub(setNumber, userGuess) == 1) {
                gameVisual.closeToWin();
            }
            else if (userGuess > setNumber){
                int helpValue = userGuess - gameCheck.setRandom( gameCheck.sub(userGuess, setNumber) - 1, 1);
                gameVisual.helpMsg(helpValue, true);
                System.out.println("dsa");
            }
            else {
                int helpValue = userGuess + gameCheck.setRandom( gameCheck.sub(setNumber, userGuess) - 1, 1);
                gameVisual.helpMsg(helpValue, false);
            }

        }
    }
}
