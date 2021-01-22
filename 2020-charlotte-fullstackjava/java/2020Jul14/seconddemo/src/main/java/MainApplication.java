/**
 * Created by leon on 7/14/2020.
 */
public class MainApplication {
    public static void main(String[] args) {
        new MainApplication().slideExercise16();
    }

    public void slideExercise16() {
        int counter = 100;
        while(counter > 0) {
            System.out.println(counter);
            counter-=10;
        }
    }

    public void slideExercise12() {
        for (int i = 0; i < 100; i += 5) {
            System.out.println(i);
        }
    }

    public void run() {
        switchCaseDemonstration();
    }

    public void switchCaseDemonstration() {
        String someVariableStringValue = "First-Case";
        switch(someVariableStringValue) {
            case "First-Case":
                // TODO - define some procedure here
                break;

            case "Second-Case":
                // TODO - define some procedure here
                break;

            default:
                // TODO - define some procedure here
        }
    }

    public void debugDemonstration() {
        System.out.println("Welcome to my application!");
        System.out.println("From here, you can select any of the following options:");
        System.out.println("[login, quit]");
        String userInput = "login";
        if ("login".equals(userInput)) {
            subProcedure();
        } else if ("quit".equals(userInput)) {
            System.out.println("You have logged out!");
        } else {
            System.out.println("You did not enter any of the given options");
        }
    }

    private static void subProcedure() {
        if (true) {
            System.out.println("Yep");
        }
        System.out.println("You have logged in!");
        System.out.println("Enter your age:");
        String ageAsString = "98";
        Integer ageAsInteger = Integer.parseInt(ageAsString);
        System.out.println("5 times your age is = " + 5 * ageAsInteger);
        System.out.println("Your age is = " + ageAsString);
    }
}
