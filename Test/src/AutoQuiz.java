import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AutoQuiz {

    // Quiz intro section
    static String[] quizVariants = {"Mathematics", "Informatics", "General", "Exit"};
    static int simpleQuizIterator = 1;
    public static void quizIntro(){
        simpleQuizIterator = 1;
        System.out.println("Please select the Quiz:");
        System.out.println("|-------------------------------------------------");
        for (String i : quizVariants){
            System.out.println("|"+simpleQuizIterator+++". "+i);
        }
        System.out.println("|-------------------------------------------------");
    }

    static String[] readedFileHolder = new String[29];
    static int numberOfChosenQuiz = 1;
    static int[] score = new int[4];
    static String your_answer;

    public static void main(String[] args) throws IOException {
        quizIntro();
        Scanner myScan = new Scanner(System.in);
        while(numberOfChosenQuiz < quizVariants.length && numberOfChosenQuiz > 0){
            numberOfChosenQuiz = myScan.nextInt();
            if(numberOfChosenQuiz < 1 || numberOfChosenQuiz > 4){
                System.out.println("Please chose from the variants above.");
            } else if (quizVariants[numberOfChosenQuiz - 1] == "Exit"){
                System.out.println("Chicken! See you later.");
                break;
            } else if (numberOfChosenQuiz > 0 && numberOfChosenQuiz < 4){
                FileInputStream fileStream = new FileInputStream("Test/public/"+quizVariants[numberOfChosenQuiz - 1]+".txt");
                DataInputStream fileInput = new DataInputStream(fileStream);
                BufferedReader fileBufferedInput = new BufferedReader(new InputStreamReader(fileInput));
                String tmpStrLine;
                for(int i = 0;(tmpStrLine = fileBufferedInput.readLine()) != null; ++i){
                    //System.out.println(tmpStrLine);
                    readedFileHolder[i] = tmpStrLine;
                }
                for (int i = 0; i < readedFileHolder.length; i++){
                    if (i % 7 == 0 && i != 0){
                        Scanner newScan = new Scanner(System.in);
                        your_answer = newScan.nextLine();
                        if (your_answer.equals(readedFileHolder[i])){
                            System.out.println("Correct");
                            score[i / 7 - 1] = 1;
                        }else{
                            System.out.println("Wrong");
                            score[i / 7 - 1] = 0;
                        }
                    } else{
                        System.out.println(readedFileHolder[i]);
                    }
                }
                System.out.println("Your result is:");
                double totalScore = ((double) IntStream.of(score).sum() / score.length) * 100;
                System.out.println(totalScore+"%");
                quizIntro();
            }
        }
//        numberOfChosenQuiz = myScan.nextInt();
//        FileInputStream fileStream = new FileInputStream("Test/public/"+quizVariants[numberOfChosenQuiz - 1]+".txt");
//        DataInputStream fileInput = new DataInputStream(fileStream);
//        BufferedReader fileBufferedInput = new BufferedReader(new InputStreamReader(fileInput));
//        String tmpStrLine;
//        while((tmpStrLine = fileBufferedInput.readLine()) != null){
//            System.out.println(tmpStrLine);
//        }
    }
}