
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    private String letter;
    private String hiddenWord;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        this.letter = letter.toUpperCase();
        if (this.guessedLetters.contains(this.letter)) {
            
        } else if (this.word.contains(this.letter)) {
            this.guessedLetters += this.letter;

        } else {
            this.numberOfFaults++;
            this.guessedLetters += this.letter;

        }
    }

    public String hiddenWord() {
        String hidden = "";

        if (this.guessedLetters.length() == 0) {
            for (int i = 0; i < this.word.length(); i++) {
                hidden += "_";
            }
            return hidden;
        } else {
            for (int i = 0; i < this.word.length(); i++) {
                if (this.word.charAt(i) == this.guessedLetters.charAt(this.guessedLetters.length() - 1)) {
                    hidden += this.guessedLetters.charAt(this.guessedLetters.length() - 1);
                } else {
                    hidden += "_";
                }
                // program here the functionality for building the hidden word

                // create the hidden word by interating through this.word letter by letter
                // if the letter in turn is within the guessed words, put it in to the hidden word
                // if the letter is not among guessed, replace it with _ in the hidden word 
                // return the hidden word at the end
            }

            return this.hiddenWord;
        }
    }
}
