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
        String[] eachHashtag = post.split(" "); //splits up each word
        for (String hashtag : eachHashtag){ //each hashtag is its own separate hashtag
            if (hashtag.startsWith("#")){
                hashtag = hashtag.replaceAll("[!?.;:,]", " ");//replaces all punctuation with a space
                System.out.print("Hashtag: "+hashtag + " ");
            }
        }
    }

}
