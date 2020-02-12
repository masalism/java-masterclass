package mantas.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//	    if (score < 5000 && score > 1000) {
//			System.out.println("Your score is less than 5000 bute greater than 1000");
//			System.out.println("This was executed");
//		} else if (score < 1000) {
//			System.out.println("Your score was less than 1000");
//		} else {
//			System.out.println("Got Here");
//		}

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score " + finalScore);
        }

        int secondScore = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = secondScore + (levelCompleted * bonus);
            System.out.println("Your final score " + finalScore);
        }
    }
}
