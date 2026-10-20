/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        String[] eachHashtags = post.split("#");
        int first = post.indexOf("#");
        int lastExclamation = post.indexOf("!", first);
        int lastComma = post.indexOf(",", first);
        int lastCollen= post.indexOf(":", first);
        int lastSemiCollen = post.indexOf(";", first);
        int lastSpace = post.indexOf(" ", first);
        int lastQuestion = post.indexOf("?", first);
        int last = lastSpace;
        System.out.println("Hashtags:" + post.substring(first,last));
    }

}
