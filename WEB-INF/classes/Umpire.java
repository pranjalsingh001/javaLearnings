class Umpire {
    Guesser guesser;
    Player p1, p2, p3;

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void startGame(int guesserNum, int p1Guess, int p2Guess, int p3Guess) {
        // Setup
        guesser = new Guesser();
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Assign values
        guesser.guessingNum(guesserNum);
        p1.predictingNum(p1Guess);
        p2.predictingNum(p2Guess);
        p3.predictingNum(p3Guess);

        // Get numbers
        numFromGuesser = guesser.getNumber();
        numFromPlayer1 = p1.getGuess();
        numFromPlayer2 = p2.getGuess();
        numFromPlayer3 = p3.getGuess();
    }

    String compare() {
        StringBuilder result = new StringBuilder("Result: ");
        boolean winnerFound = false;

        if (numFromGuesser == numFromPlayer1) {
            result.append("Player 1 wins! ");
            winnerFound = true;
        }
        if (numFromGuesser == numFromPlayer2) {
            result.append("Player 2 wins! ");
            winnerFound = true;
        }
        if (numFromGuesser == numFromPlayer3) {
            result.append("Player 3 wins! ");
            winnerFound = true;
        }

        if (!winnerFound) {
            result.append("Game lost. Try Again! ");
        }

        result.append("Guesser guessed: ").append(numFromGuesser);

        return result.toString();
    }
}
