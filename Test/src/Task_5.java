import java.util.*;

/**
 * Utwórz program wczytujący z klawiatury liczbę całkowitą
 * reprezentującą numer miesiąca, a następnie na postawie tej wartości
 * wyświetli na ekranie nazwę tego miesiąca
 * lub informacje że podana wartość nie odpowiada żadnemu miesiącowi.
 * */

public class Task_5 {

    public static void main(String[] args){
        // making map
        HashMap<Integer, String> checkMonth = new HashMap<Integer, String>();
        checkMonth.put(1, "January");
        checkMonth.put(2, "February");
        checkMonth.put(3, "March");
        checkMonth.put(4, "April");
        checkMonth.put(5, "May");
        checkMonth.put(6, "June");
        checkMonth.put(7, "July");
        checkMonth.put(8, "August");
        checkMonth.put(9, "September");
        checkMonth.put(10, "October");
        checkMonth.put(11, "November");
        checkMonth.put(12, "December");

        Scanner myMonthScan = new Scanner(System.in);
        int monthNumber = 1;
        while (monthNumber > 0 && monthNumber < 13) {
            System.out.println("Please give month number:");
            monthNumber = myMonthScan.nextInt();
            System.out.println("The chosen month is: "+checkMonth.get(monthNumber));
        }
    }
}
