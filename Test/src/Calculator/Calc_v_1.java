package Calculator;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Calc_v_1 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter \":\" to exit.");
        String statement = myScan.nextLine();
        String[] splitStatement = StringUtils.splitByCharacterType(statement);
        double result = 0;
        for (int i = 0; i < splitStatement.length; ++i){
            if (splitStatement[i].equals("+")){
                if (result == 0)
                {
                    result = Double.parseDouble(splitStatement[i - 1]) + Double.parseDouble(splitStatement[i + 1]);
                }
                else{
                    result += Double.parseDouble(splitStatement[i + 1]);
                }
            }else if (splitStatement[i].equals("-")){
                if (result == 0){
                    result = Double.parseDouble(splitStatement[i - 1]) - Double.parseDouble(splitStatement[i + 1]);
                }else{
                    result -= Double.parseDouble(splitStatement[i + 1]);
                }
            }else if (splitStatement[i].equals("*")){
                if (result == 0){
                    result = Double.parseDouble(splitStatement[i - 1]) * Double.parseDouble(splitStatement[i + 1]);
                }else{
                    result *= Double.parseDouble(splitStatement[i + 1]);
                }
            }else if (splitStatement[i].equals("/")){
                if (Double.parseDouble(splitStatement[i + 1]) == 0){
                    System.out.println("Can't divide by 0!");
                    break;
                }else if (result == 0){
                    result = Double.parseDouble(splitStatement[i - 1]) / Double.parseDouble(splitStatement[i + 1]);
                }else{
                    result /= Double.parseDouble(splitStatement[i + 1]);
                }
            }
        }
        System.out.println(result);
    }
}
