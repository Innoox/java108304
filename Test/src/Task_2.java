import java.util.Scanner;

/**
 * Dane są następujące zbiory:
 * • A = (−15, −10] ∪ (−5, 0) ∪ (5, 10)
 * • B = (−∞, −13] ∪ (−8, −3]
 * • C = [−4,∞)
 * Napisz program weryfikujący, czy zmienna int wrt należy do części wspólnej tych
 * zbiorów.
 * */

public class Task_2 {
    private static double userNumberInput;

    public static void checkA(double checkedVariable){
        System.out.println(
                (checkedVariable > -15 && checkedVariable < -9) || (checkedVariable > -5 && checkedVariable < 1) || (checkedVariable > 5 && checkedVariable < 10) ?
                        "Prompted variable is in A set." :
                        "Prompted variable isn't in A set."
        );
    }
    public static void checkB(double checkedVariable){
        System.out.println(
                (checkedVariable < -12) || (checkedVariable > -8 && checkedVariable < -2) ?
                        "Prompted variable is in B set." :
                        "Prompted variable isn't in B set."
        );
    }
    public static void checkC(double checkedVariable){
        System.out.println(
                (checkedVariable > -5) ?
                        "Prompted variable is in C set." :
                        "Prompted variable isn't in C set."
        );
    }

    public static void main(String[] args){
        System.out.println("Please prompt a number:");
        Scanner userInputScanner = new Scanner(System.in);
        userNumberInput = userInputScanner.nextDouble();
        checkA(userNumberInput);
        checkB(userNumberInput);
        checkC(userNumberInput);
    }
}
