import java.util.Scanner;

/**
 * Created by leon on 7/14/2020.
 */
public class MainApplication {
    public static void main(String[] args) {
        new MainApplication().run();
    }

    /**
     * @param firstName this is representative of a person's first name
     * @param lastName  this is representative of a person's last name
     * @param age  this is representative of a person's age
     * @return a String representative of a person with the specified values
     */
    public String personCreator(String firstName, String lastName, Integer age) {
        // TODO - define this actually...
        return null;
    }



    // TODO - Ensure that this method runs when I do the thingy
    public void run() {
        System.out.println("Welcome to my application!");
        System.out.println("From here, you can select any of the following options:");
        System.out.println("[login, quit]");
        Scanner someScanner = new Scanner(System.in);
        String userInput = someScanner.nextLine();
        if("login".equals(userInput)) {
            if(true) {
                System.out.println("Yep");
            }
            System.out.println("You have logged in!");
            System.out.println("Enter your age:");
            String ageAsString = someScanner.nextLine();
            Integer ageAsInteger = Integer.parseInt(ageAsString);
            System.out.println("5 times your age is = " + 5 * ageAsInteger);
            System.out.println("Your age is = "+ageAsString);
        } else if("quit".equals(userInput)) {
            System.out.println("You have logged out!");
        } else {
            System.out.println("You did not enter any of the given options");
        }
    }



    public void printNumbers() {
        Integer tempNumber = 0;
        float tempFloat = 0f;
        Double tempDouble = 0d;

        System.out.println(tempFloat);
        System.out.println(tempNumber);
        System.out.println(tempDouble);
    }
}
