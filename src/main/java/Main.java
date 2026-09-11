import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] sonnet = {
                "Shall I compare thee to a summer’s day?",
                "Thou art more lovely and more temperate:",
                "Rough winds do shake the darling buds of May,",
                "And summer’s lease hath all too short a date;",
                "Sometime too hot the eye of heaven shines,",
                "And often is his gold complexion dimm’d;",
                "And every fair from fair sometime declines,",
                "By chance or nature’s changing course untrimm'd;",
                "But thy eternal summer shall not fade,",
                "Nor lose possession of that fair thou ow’st;",
                "Nor shall death brag thou wander’st in his shade,",
                "When in eternal lines to time thou grow’st:",
                "   So long as men can breathe or eyes can see,",
                "   So long lives this, and this gives life to thee."
        };

        int correct = 0;
        int incorrect = 0;

        while (correct < 3 && incorrect < 3) {
            // A random line is selected
            int line = random.nextInt(sonnet.length);

            // Line is broken into individual words
            String[] words = sonnet[line].split(" ");

            // Select a random word from the line
            int randomWord = random.nextInt(words.length);

            // Printing the line with the chosen random word replaced with _______
            for (int i = 0; i <= line; i++) {

                if (i < line) {
                    System.out.println(sonnet[i]);
                }
                else {
                    for (int j = 0; j <= randomWord; j++) {

                        if (j == randomWord) {
                            System.out.print("_______");
                        }
                        else {
                            System.out.print(words[j] + " ");
                        }
                    }

                    System.out.println();
                }
            }

            // Asking user for the missing word
            System.out.println("\nWhat is the word that is missing?");
            String answer = input.nextLine().trim();

            String correctWord = words[randomWord];
            // Remove punctuation from the end
            if (correctWord.endsWith("?") ||
                    correctWord.endsWith(":") ||
                    correctWord.endsWith(",") ||
                    correctWord.endsWith(";") ||
                    correctWord.endsWith(".")) {

                correctWord = correctWord.substring(0, correctWord.length() - 1);
            }
            String updatedAnswer = answer.toLowerCase();

            // Check answer
            if (updatedAnswer.equals(correctWord)) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Wrong! The correct answer is: " + correctWord);
                incorrect++;
            }

            System.out.println("Correct: " + correct + " \tIncorrect: " + incorrect);

            if (correct == 3) {
                System.out.println("You got 3 correct!");
            }
            else if (incorrect == 3) {
                System.out.println("You got 3 incorrect!");
            }
        }
        input.close();
    }
}
