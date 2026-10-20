/***
 * Problem: You are creating a password validation system.
 * A valid password must meet the following requirements:
 * It must contain at least one uppercase letter,
 * It must contain at least one number,
 * It must not contain the word "password" (case insensitive).
 * Write a function that checks if a password is valid and prints "Valid password"
 * or "Invalid password" based on the rules.
 * Expected output: Valid password: false
 */

public class D_PasswordValidator {

    public static void main(String[] args) {
        D_PasswordValidator d = new D_PasswordValidator();
    }

    public D_PasswordValidator() {
        String password = "MyPassw0rd";
        System.out.println("Valid password: " + isValidPassword(password));  // Output: Invalid password (false)
    }

    public boolean isValidPassword(String password) {
        /* TODO: your code goes here */ // check for common variations of password, replacing o with 0, s with 5, a with 4
        boolean valid = false;
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasUpperCase = true;
        String lowercase = password.toLowerCase(); // sets the entire this to lower case to help identify the word "password"
        if (lowercase == password){
            hasUpperCase = false;
        }
        if (hasNumber == true && hasUpperCase == true){
            valid = true;
        }
        if (lowercase.contains("password")){
            valid = false;
        }
        if (lowercase.contains("passw0rd")){
            valid = false;
        }
        if (lowercase.contains("pa5sword")){
            valid = false;
        }
        if (lowercase.contains("pas5word")){
            valid = false;
        }
        if (lowercase.contains("p4ssword")){
            valid = false;
        }
        if (lowercase.contains("p4ssw0rd")){
            valid = false;
        }if (lowercase.contains("pa5sw0rd")){
            valid = false;
        }
        if (lowercase.contains("pas5w0rd")){
            valid = false;
        }
        if (lowercase.contains("p45sw0rd")){
            valid = false;
        }
        if (lowercase.contains("pa55w0rd")){
            valid = false;
        }
        if (lowercase.contains("p4s5w0rd")){
            valid = false;
        }
        if (lowercase.contains("p455w0rd")){
            valid = false;
        }
        if (lowercase.contains("p45sword")){
            valid = false;
        }
        if (lowercase.contains("p4s5word")){
            valid = false;
        }
        if (lowercase.contains("p455word")){
            valid = false;
        }
        if (lowercase.contains("pa55word")){
            valid = false;
        } // checks for all variations of password
        return valid; // valid is true or false
    }

}
