package Java.Projects;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "yes";
        int round = 0;
        int totalscore = 0, totaltries = 0;
        System.out.println();
        System.err.println("A number choosen between 1 to 100 and guess the number within 5 tries");
        while (play.equals("yes")) {
            ++round;
            int guess, i, k = 5, tries = 0, score = 5;
            Random rand = new Random();
            int number = rand.nextInt(100);
            for (i = 0; i < k; i++) {
                System.out.println();
                System.out.print("Guess the number : ");
                guess = sc.nextInt();
                if (number == guess) {
                    tries++;
                    System.out.println("Congratulations ! You guessed the right number.");
                    System.out.println();
                    result(tries, score);
                    totaltries += tries;
                    totalscore += score;
                    System.out.println();
                    System.err.println("Would you like to play again? yes or no: ");
                    play = sc.next().toLowerCase();
                    break;
                } else if (number > guess && i != k - 1) {
                    System.out.println("The number is greater than " + guess);
                    tries++;
                    score--;
                } else {
                    System.out.println("The number is less than " + guess);
                    tries++;
                    score--;
                }
            }
            if (i == k) {
                System.out.println("You have exhausted 5 tries.");
                System.out.println("The number was " + number);
                totalscore += score;
                totaltries += tries;
                result(tries, score);
                System.out.println();
                System.out.println("Would you like to play again? yes or no :");
                play = sc.next().toLowerCase();
            }
        }
        System.out.println();
        System.out.println("                        SCORECARD                    ");
        System.out.println("_________________________________________________________________");
        System.out.println("|      rounds       |    totalTries     |      totalScore       |");
        System.out.println("_________________________________________________________________");
        System.out.println("|        " + round + "          |      " + totaltries + "          |       " + totalscore
                + "       |");
        System.out.println("_________________________________________________________________");

    }

    static void result(int tries, int score) {
        System.out.println();
        System.out.println("_______________________________________");
        System.out.println("|      tries        |      score      |");
        System.out.println("_______________________________________");
        System.out.println("|        " + tries + "          |      " + score + "            |");
        System.out.println("________________________________________");

    }
}
