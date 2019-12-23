package exceptions.task_6_2;

import java.io.IOException;

public class Main {

    static void myMethod(char[] tmp){
        int tmpL = tmp.length + 1;
        System.out.println(tmp[tmpL]);
    }

    public static void main(String[] args) throws IOException {
        char[] myArr = {'H', 'l', 'l', 'o'};
        try {
            myMethod(myArr);
            throw new IOException();
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
}
