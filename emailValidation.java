import java.util.Scanner;

public class emailValidation {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        emailValidation obj = new emailValidation();
        if(obj.checkEmail() == true) {
            System.out.println("Entered email is in correct format");
        } else {
            System.out.println("Enter valid email");
        }
    }

    public boolean checkEmail() {
        System.out.println("Enter the email");
        String email = sc.next();
        if(email.matches( "^[a-zA-Z]+([._+-][a-zA-Z]+)*[@][A-Za-z]+[.][a-zA-Z]+([.][a-zA-Z]{2})*$" ) == true){
            return true;
        }
        else {
            return false;
        }
    }
}
