Prithee

Pseudocode:
START
Store the sonnet in an array
Set correct and incorrect to 0

WHILE correct < 3 AND incorrect < 3
Randomly select a line
Randomly select a word from the line
Print the sonnet up to the missing word
Replace the word with underscores
Ask the user for the missing word

IF answer is correct
    Increase correct by 1
ELSE
    Increase incorrect by 1
END IF

END WHILE

-------------

Description:
The program stores each line of the sonnet into a String array.
A random word and line is then selected and stored in a String array.
The sonnet before the word is printed while the word itself is replaced with underscores.
The rest of the sonnet after the chosen word is not printed.
Then the user is prompted to enter the missing word.
The program checks if the answer is correct and tracks the number of correct and incorrect guesses.
The program ends when the user gets 3 correct or 3 incorrect answers.

--------------

How to Run:
1. Open the project in Intellij
2. Open Main.java
3. Run the program
4. Enter the missing word when prompted
5. Repeat step 4 until you get 3 correct or 3 incorrect answers