package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        calculateScore(true, 800, 5, 100);
//
//        calculateScore(true, 10000, 8, 200);

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        int playerPosition1 = calculateHighScorePosition(1000);
        int playerPosition2 = calculateHighScorePosition(900);
        int playerPosition3 = calculateHighScorePosition(400);
        int playerPosition4 = calculateHighScorePosition(50);

        displayHighScorePosition("player1", playerPosition1);
        displayHighScorePosition("player2", playerPosition2);
        displayHighScorePosition("player3", playerPosition3);
        displayHighScorePosition("player4", playerPosition4);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String player, int position) {
        System.out.println(player + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }

}
