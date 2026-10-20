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
        //find where every space is and separate each word with that, then assign
        //number to each letter and reverse number order, keeping it all case sensitive.
        String[] eachWord = sentence.split(" ");
        for (int i=0; i<eachWord.length; i++){
            //eachWord.[i] = new String(i);

        }
    }

}
