import java.util.Scanner;

public class userRegistration {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        userRegistration obj = new userRegistration();
        if (obj.checkName()  == true) {
            System.out.println("Entered name is in correct format");
        } else {
            System.out.println("PLEASE Enter  a valid name");
        }
        userRegistration obj1 = new userRegistration();
        if(obj1.checkEmail() == true) {
            System.out.println("Entered email is in correct format");
        } else {
            System.out.println("Enter valid email");
        }

        userRegistration obj2 = new userRegistration();
        if(obj2.checkPhoneNumber() == true) {
            System.out.println("Entered phone number is in correct format");
        } else {
            System.out.println("Enter valid phone number");
        }

        userRegistration obj3 = new userRegistration();
        if(obj3.checkPassword() == true) {
            System.out.println("Entered password is in correct format");
        } else {
            System.out.println("Enter valid phone number");
        }
    }

    public boolean checkName() {
        System.out.println("Enter the  first name");
        String firstName = sc.next();
        System.out.println("Enter the last name");
        String lastName = sc.next();

        if (firstName.matches("[A-Z][a-z]{3,}") && (lastName.matches("[A-Z][a-z]{3,}") == true) == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEmail() {
        System.out.println("Enter the email");
        String email = sc.next();
        if(email.matches( "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})*$" ) == true){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkPhoneNumber() {
        System.out.println("Enter the Phone Number");
        String phoneNumber = sc.next();
        if(phoneNumber.matches( "^[0-9]{1,2}[ ][0-9]{10}$") == true ){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkPassword() {
        System.out.println("Please Enter the Password");
        String phoneNumber = sc.next();
        if(phoneNumber.matches( "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$" ) == true ){
            return true;
        }
        else {
            return false;
        }
    }
}
