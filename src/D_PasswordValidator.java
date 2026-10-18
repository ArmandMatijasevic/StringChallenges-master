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
        boolean hasNumber = false;
        boolean hasUpperCase = false;
        String lowercase = password.toLowerCase(); // sets the entire this to lower case to help identify the word "password"
        if (password.contains("A")){
            hasUpperCase = true;
        }
        if (password.contains("B")){
            hasUpperCase = true;
        }
        if (password.contains("C")){
            hasUpperCase = true;
        }
        if (password.contains("D")){
            hasUpperCase = true;
        }
        if (password.contains("E")){
            hasUpperCase = true;
        }
        if (password.contains("F")){
            hasUpperCase = true;
        }
        if (password.contains("G")){
            hasUpperCase = true;
        }
        if (password.contains("H")){
            hasUpperCase = true;
        }
        if (password.contains("I")){
            hasUpperCase = true;
        }
        if (password.contains("J")){
            hasUpperCase = true;
        }
        if (password.contains("K")){
            hasUpperCase = true;
        }
        if (password.contains("L")){
            hasUpperCase = true;
        }
        if (password.contains("M")){
            hasUpperCase = true;
        }
        if (password.contains("N")){
            hasUpperCase = true;
        }
        if (password.contains("O")){
            hasUpperCase = true;
        }
        if (password.contains("P")){
            hasUpperCase = true;
        }
        if (password.contains("Q")){
            hasUpperCase = true;
        }
        if (password.contains("R")){
            hasUpperCase = true;
        }
        if (password.contains("S")){
            hasUpperCase = true;
        }
        if (password.contains("T")){
            hasUpperCase = true;
        }
        if (password.contains("U")){
            hasUpperCase = true;
        }
        if (password.contains("V")){
            hasUpperCase = true;
        }
        if (password.contains("W")){
            hasUpperCase = true;
        }
        if (password.contains("X")){
            hasUpperCase = true;
        }
        if (password.contains("Y")){
            hasUpperCase = true;
        }
        if (password.contains("Z")){
            hasUpperCase = true;
        } // checks for uppercase letters
        if (password.contains("1")){
            hasNumber = true;
        }
        if (password.contains("2")){
            hasNumber = true;
        }
        if (password.contains("3")){
            hasNumber = true;
        }
        if (password.contains("4")){
            hasNumber = true;
        }
        if (password.contains("5")){
            hasNumber = true;
        }
        if (password.contains("6")){
            hasNumber = true;
        }
        if (password.contains("7")){
            hasNumber = true;
        }
        if (password.contains("8")){
            hasNumber = true;
        }
        if (password.contains("9")){
            hasNumber = true;
        }
        if (password.contains("0")){
            hasNumber = true;
        } // checks for numbers
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
