package Neiza;
import java.util.*;
import java.io.*;

public class Hangman{
    // The dictionary of the word lists
    private static final String DICTIONARY_FILE = "words.txt";

    // Minimum length of a word to consider
    private static final int MIN_WORD_LENGTH = 2;

    // Largest number of misses allowed to be set
    private static final int MAX_MISSES = 5;

    public static void main(String[] args){
        Scanner PlayerName = new Scanner(System.in);
        String name;

        // Enter your name
        System.out.print("Hi!! What is your name?");
        name = PlayerName.nextLine();

        System.out.print("Welcome to hangman " + name + "!!!");

        // Check for debug mode
        boolean debug = args.length > 1 && args[0].equals("debug");

        // Reading in the data from the dictionary arraylist
        ArrayList<String> words = new ArrayList<String>();

        // First, open the file and create a Scanner to read in it
        Scanner wordScan = null;
        try{
            wordScan = new Scanner(new File(DICTIONARY_FILE));
        }catch(FileNotFoundException e){
            System.err.println(e);
            System.exit(1);
        }

        // Reads the contents of the file one word at a time, skipping over words that are too short to use by hangman
        while (wordScan.hasNext()){
            String nextWord = wordScan.next();
            if (nextWord.length() >= MIN_WORD_LENGTH){
                words.add(nextWord);
            }
        }
        if (debug){
            System.out.println("Dictionary contains " + words.size() + " words");
        }

        // Creating a random number generator to pick a word
        // this is how I can get a random generator without objectDraw RandomIntGenerator
        Random r = new Random();

        // Creating another Scanner
        Scanner keyboard = new Scanner(System.in);

        // Finding the number of guesses allowed before a hangman
        int missesAllowed = 0;
        while ((missesAllowed < 1) || missesAllowed > MAX_MISSES){
            System.out.print("How many guesses before a hangman?");
            missesAllowed = keyboard.nextInt();
        }

        boolean gameOver = false;
        while (!gameOver){
            // Pick the next word
            // NB: r.nextInt(r) returns an int between 0 and n-1
            String theWord = words.get(r.nextInt(words.size()));

            if (debug){
                System.out.println("The word is ........" + theWord);
            }

            boolean wordOver = false;
            int missesLeft = missesAllowed;
            ArrayList<Character>guessed = new ArrayList<Character>();

            // Keep looping until the word has been guessed or too many incorrect guesses have been made.
            while (!wordOver){
                showGuessed(theWord, guessed);
                System.out.println("\nYou have " + missesLeft + " incorrect guesses remaining " + name);
                System.out.println(maskWord(theWord, guessed));
                boolean guessOK = false;
                String guess = null;
                while(!guessOK){
                    System.out.print("Your Guess? ");
                    guess = keyboard.next().toLowerCase();
                    // Add this to our list of guessed letters

                    if (guessed.contains(guess.charAt(0))){
                        System.out.println("You have already guessed that " + name + "!!!");
                    }
                    else{
                        // Insert the guess into the list of guessed alphabets
                        // Letters in alphabetical order
                        int pos = 0;
                        while (pos < guessed.size() && guessed.get(pos) < guess.charAt(0)){
                            pos++;
                        }
                        guessed.add(pos, guess.charAt(0));
                        guessOK = true;
                    }
                }
                // Is the first letter of the response in the word?
                if (theWord.indexOf(guess.substring(0, 1)) == -1){
                    // not in the word
                    System.out.println("The letter " + guess.charAt(0) + " is not in the word " + name);
                    missesLeft --;
                    if(missesLeft == 0){
                        System.out.println("Too bad HANGMAN!! The word was: " + theWord + ", " + name);
                    }
                }
                else{
                    // It is in the word
                    System.out.println("Good- You have a match " + ", " + name);
                    if (theWord.equals(maskWord(theWord, guessed))){
                        System.out.println("You got it " + name + ". The word was: " + theWord);
                    }
                }
            }
            System.out.print("Do you want to play again " + name + "?!");
            String response = keyboard.next();
            gameOver = response.equalsIgnoreCase("no");
        }
        System.out.println("Thanks for playing " + name + "!!");
    }
    /**
    * Return a String with the characters not in the list of characters replaced with '_' characters
     *
     * @param word the word to be masked
     * @param letters the ArrayList of characters to be revealed
     * @return the word with all characters not in the letters represented by '_'s
    * */
    private static String maskWord(String word, ArrayList<Character> letters){
        String answer = "";
        for (int i = 0; i < word.length(); i++){
            if (letters.contains(word.charAt(i))){
                answer = answer + word.charAt(i);
            }
            else{
                answer = answer + "_";
            }
        }
        return answer;
    }
    /**
     * Show the list of guessed letters that were not found in the word
     *
     * @param theWord the word being guessed
     * @param letters the ArrayList of characters guessed so far
     * @return the word
    * */
    private static void showGuessed(String theWord, ArrayList<Character> letters){
        System.out.print("Guessed: ");

        //for (int = 0; i < letters.size(); i++){
           // if (theWord.indexOf(letters.get(i)) == -1){
            //    System.out.print(letters.get(i) + " ");
         //   }
       // }

        //System.out.println();
        //return;
    }
}