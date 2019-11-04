import java.util.Scanner;

/**
 * Wykorzystując poniższy fragment kodu, można wprowadzić do zmiennej wartość liczbową z klawiatury:
 * 1 java . util . Scanner dataIn = new java . util . Scanner ( System . in ) ;
 * 2 int val = dataIn . nextInt ( ) ;
 * Utwórz program, który wczyta informacje o ilości punktów (wyrażoną w procentach)
 * i dokona klasyfikacji jaką ocenę otrzyma student. Wykorzystaj dokument ”zasady
 * zaliczenia”.
 * */

public class Task_4 {
    private static int userVariable = 0;
    private static int[] grades = {0, 35, 50, 75, 90};

    public static void main(String[] args){
        Scanner userAsk = new Scanner(System.in);
        System.out.println("Please provide your exam result in %:");
        userVariable = userAsk.nextInt();
        System.out.println(userVariable < grades[1] ? "Your score is 1" :
                (userVariable > grades[1] - 1  && userVariable < grades[2] ? "Your score is 2" :
                        (userVariable > grades[2] - 1  && userVariable < grades[3] ? "Your score is 3" :
                                (userVariable > grades[3] - 1  && userVariable < grades[4] ? "Your score is 4" :
                                        (userVariable > grades[4] - 1  ? "Your score is 5" : "Wrong input")))));
    }
}
