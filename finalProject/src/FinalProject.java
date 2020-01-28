import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

import org.apache.commons.lang3.*;

/**
 *      Task for the project
 *      Napisz program, który pobierze od użytkownika napis – domyślnie pewną
 *      liczbę. (PROTIP: czytaj string znak po znaku i wykorzystaj fakt, że za
 *      pomocą kodowania ASCII jest możliwe za pomocą zwykłego rzutowania typu i
 *      odejmowania obliczyć wartość liczbową znaku)
 *
 *      Program pozwoli na wprowadzenie nieskończonej liczby liczb, a po
 *      wprowadzeniu znaku N zakończy wprowadzanie danych. Weź pod uwagę, że
 *      użytkownik nie będzie łaskawy i zamiast liczb poda także znaki. Zadbaj o
 *      odpowiednią obsługę błędów i zaimplementuj mechanizm wyjątków.
 *
 *      Tak przekonwertowane liczby wrzuć do jednej dowolnej kolekcji (może być
 *      jedna z gotowych struktur danych z biblioteki javy), jednak takiej,
 *      która umożliwi na uszeregowanie danych według przepisu:
 *
 *      OPIS LICZBY | WARTOŚĆ,
 *
 *      gdzie opis liczby będzie jedną z 3 możliwych wartości:
 *      liczba ujemna, liczba dodatnia, liczba pierwsza.
 *
 *      Weryfikację co do charakteru liczby wykonaj w wybrany przez siebie
 *      sposób, przy czym jeśli liczba jest dodatnia i pierwsza to zapisz w
 *      opisie liczby, że jest to liczba pierwsza.
 *      np.
 *      liczba ujemna | -10
 *      liczba dodatnia | 7
 *      liczba pierwsza | 80209
 *      liczba pierwsza | 4682927
 *      liczba dodatnia | 768596498
 *
 *      Test string:
 *      | _ A @ B ^ C \ + 1 :  2 | 3 d e f - 4 ) 5 ( 6 a { b } c - 1 ! 2 @ 3 # D $ E % F ^ + & 4 * 5 : 6 ; N
 *      replaceAll("\\s+","")
 *      .replaceAll("[\\p{Blank}]", "").replaceAll("@", "").replaceAll("[\\p{Punct}[^+-]]", "")
 * */

public class FinalProject {
    public static void main(String[] args){
        System.out.println("Please input your string:");
        Scanner myScan = new Scanner(System.in);
        String myTmpInputString = "";
        String tmpReader = "";
        while(!tmpReader.endsWith("N")) {
            tmpReader = myScan.nextLine();
            myTmpInputString = myTmpInputString.concat(tmpReader);
        }
        System.out.println(myTmpInputString);
        myTmpInputString = myTmpInputString.replaceAll("\\p{Space}", "").replaceAll("[\\p{Punct}&&[^-]]+","").replaceAll("N", "");
        System.out.println(myTmpInputString);
        String[] result = myTmpInputString.split("[-]+[^A-z0-9]+|(?<=[A-z])(?=[-0-9])|(?<=[-0-9])(?=[A-z])");
        Vector<Integer> myResult = new Vector<>();
        Integer myResultContainer = 0;
        for (String tmp : result) {
            if (tmp.startsWith("-")){
                tmp = tmp.replaceAll("-", "");
                myResultContainer = -Integer.parseInt(tmp);
                myResult.add(myResultContainer);
                //System.out.println(myResultContainer);
            } else {
                if (StringUtils.isNumeric(tmp)){
                    myResultContainer = Integer.parseInt(tmp);
                    myResult.add(myResultContainer);
                    //System.out.println(myResultContainer);
                } else {
                    for (int i = 0; i < tmp.length(); ++i) {
                        myResultContainer = (int)tmp.charAt(i);
                        myResult.add(myResultContainer);
                        //System.out.println((int)tmp.charAt(i));
                    }
                }
            }
        }
        System.out.println("=========================\n" +
                "Before sort():\n" +
                "=========================");
        printResult(myResult);
        System.out.println("=========================\n" +
                "After sort():\n" +
                "=========================");
        Collections.sort(myResult);
        printResult(myResult);
    }

    private static void printResult(Vector<Integer> myResult) {
        for (Integer i : myResult) {
            if (i < 0) {
                System.out.println("liczba ujemna    |"+i);
            } else {
                if (isPrime(i)) {
                    System.out.println("liczba pierwsza    |"+i);
                } else {
                    System.out.println("liczba dodatnia    |"+i);
                }
            }
            //System.out.println(i);
        }
    }

    public static boolean isPrime(Integer tmpVar) {
        boolean flag = false;
        for(int i = 2; i <= tmpVar/2; ++i)
        {
            if(tmpVar % i == 0)
            {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
