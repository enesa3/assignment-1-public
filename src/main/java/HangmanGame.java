import java.util.Arrays;
import java.util.Scanner;


public class HangmanGame {
    public static void main(String[] args) {

        // Scanner to read the input
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        // Read the secret word and turn it into an array of characters
        System.out.println("Enter the secret word:");
        char[] wordArr = scanner.nextLine().toCharArray();
        String[] strichcode = new String[wordArr.length]; // trackt die -


        for (int j = 0; j < wordArr.length; j++) {
            strichcode[j] ="_";

        }
        int tries = 6;


        while (tries >= 0) {
            if (tries == 0){ System.out.println("Game over!"); return  ;}

            System.out.println("current progress:"+ Arrays.toString(strichcode));
            System.out.println("you have "+tries+" wrong guesses left");
            System.out.println("Player 2, guess the word:");
            char[] guessArr = scanner1.nextLine().toCharArray();
            for (int i = 0; i < wordArr.length; i++) {
            if (guessArr[0] == wordArr[i]) {
                strichcode[i] = String.valueOf(guessArr[0]);
            }



            }


        }


        // TODO: While the game is not over, do the following:
        // 1. Reveal the letters correctly guessed so far.
        // 2. Read the next letter from the standard input.
        // 3. Update according to whether the letter is in the secret word or not.
        // 4. If the player has guessed the word, print "Congratulations! ...".
        // 5. If the player made too many wrong guesses, print "Game Over! ...".

        scanner.close();
    }
}
