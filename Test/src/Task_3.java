import java.util.Scanner;

/**
 * Dane są następujące zbiory:
 * • A = (−15, −10)
 * • B = (−∞, −13)
 * Napisz program sprawdzający czy zmienna int wrt należy tylko do jednego z tych
 * zbiorów.
 * */

public class Task_3 {
    private static int[] setA = {-15, -10};
    private static int[] setB = {-13};

    public static void checkPrompt(double tmpVar){
        System.out.println(tmpVar > setA[0] && tmpVar < setA[1] ? "Given variable is in A set" : (tmpVar < setB[0] ? "Given variable is in B set" : "Variable doesn't in the any given sets"));
    }

    public static void main(String[] args){
        Scanner userDataInput = new Scanner(System.in);
        System.out.println("Please give a number to check:");
        double userVariable = userDataInput.nextDouble();
        checkPrompt(userVariable);
    }
}