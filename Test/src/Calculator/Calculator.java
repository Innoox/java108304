package Calculator;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Calculator {

//    static double arrEqResult(String myTmpString){
//        ArrayList<Double> tmpResult = new ArrayList<Double>();
//
//        if (StringUtils.countMatches(myTmpString, "*") != 0)
//        return result;
//    }

    static ArrayList<String> equationBracketSplitter(String myTmp){
        int cnt = StringUtils.countMatches(myTmp, "(");
        ArrayList<String> myResult = new ArrayList<String>();
        while (StringUtils.countMatches(myTmp, "(") != 0){
            myResult.add(StringUtils.substringBefore(myTmp, "("));
            myResult.add(StringUtils.substringBetween(myTmp, "(", ")"));
            myTmp = StringUtils.substringAfter(myTmp, ")");
        }
        myResult.add(myTmp);
        return myResult;
    }
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please start input your equation:");

        String userEq = myScan.nextLine();
        String[] splitUserEq = StringUtils.splitByCharacterType(userEq);
        for (String tmp : splitUserEq){
            System.out.println(tmp);
        }
//        equationBracketSplitter(userEq);
//
//        ArrayList<String> result = equationBracketSplitter(userEq);
//        for (String tmp : result)
//        {
//            System.out.println(tmp);
//        }
    }
}
