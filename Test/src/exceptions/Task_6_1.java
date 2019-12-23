package exceptions;

import java.io.IOException;

public class Task_6_1 {

    void myMethod() throws IOException {
        System.out.println("Some error.");
    }

}

class SubClass extends Task_6_1 {
    void myMethod() throws IOException
    {
        System.out.println("Some error.");
    }

    public static void main(String args[]){
        Task_6_1 myObj = new Task_6_1();
        try {
            myObj.myMethod();
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
}
