/***
 * Problem: Write a method that takes a sentence and reverses
 * each word individually without changing their positions.
 * Expected output: avaJ si emosewa
 */

public class E_WordReverser {

    public static void main(String[] args) {
        E_WordReverser e = new E_WordReverser();
    }

    public E_WordReverser() {
        String sentence = "Java is awesome";
        reverseWords(sentence);  // Output: avaJ si emosewa
    }

    public void reverseWords(String sentence) {
        /* TODO: your code goes here */
        String[] eachWord = sentence.split(" "); // splits up each word
        for (int i=0; i<eachWord.length; i++){ // assigns numbers to each letter
            String wordReverse = "";
            for (int j=eachWord[i].length()-1; j>=0; j--){ // j is the reverse of i
                 wordReverse += eachWord[i].charAt(j); // reverses each word
            }
            System.out.print(wordReverse + " ");
        }
    }

}
