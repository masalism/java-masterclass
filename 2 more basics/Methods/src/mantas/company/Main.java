package mantas.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score: " + highScore);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score: " + highScore);

        String playerName = "Mantas";
        int otherScore = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName, otherScore);

        playerName = "Darius";
        otherScore = calculateHighScorePosition(900);
        displayHighScorePosition(playerName, otherScore);

        playerName = "Petras";
        otherScore = calculateHighScorePosition(400);
        displayHighScorePosition(playerName, otherScore);

        playerName = "Andrius";
        otherScore = calculateHighScorePosition(50);
        displayHighScorePosition(playerName, otherScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return  4;

        int position = 4; // assuming position 4 will be returned

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position =  2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
