import java.util.Scanner;

/**
 * Zadeklaruj i zainicjuj zmienną typu boolean o nazwie czyPada.
 * Następnie na podstawie tej zmiennej, użyj operatora ternarnego,
 * aby wypisać informację "Weź parasolłub
 * Ńie musisz brać parasola".
 * */

public class Task_1 {
    public static void main(String[] args){
        System.out.println("Is it raining outside?");
        Scanner answerScan = new Scanner(System.in);
        String userAnswer = answerScan.nextLine();
        System.out.println((userAnswer.equalsIgnoreCase("tak")) ||
                (userAnswer.equalsIgnoreCase("yes")) ||
                (userAnswer.equalsIgnoreCase("nie")) ||
                (userAnswer.equalsIgnoreCase("no")) ?
                ((userAnswer.equalsIgnoreCase("tak")) || (userAnswer.equalsIgnoreCase("yes")) ? "Take umbrella" :
                        "Don't take umbrella") : "Wrong input");
    }
}
