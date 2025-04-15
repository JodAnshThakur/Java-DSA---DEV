
//                              Control Statements
public class Day4 {
    public static void main(String args[]) {

        // if-else
        int age = 19;
        if (age >= 18) {
            System.out.println("Can Vote");
        } else if (age >= 90) {
            System.out.println("Stay Home");
        } else {
            System.out.println("Cannot vote");
        }

        // nested - if
        int dng = 12;
        if (dng == 12) {
            if (dng == 11) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        // switch -case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;

        }
    }
}
