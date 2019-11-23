import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AutoQuiz {

    // Quiz intro section
    //static String[] quizVariants = {"Mathematics", "Informatics", "General", "Exit"};
    static String[] quizVariants = new String[100];
    static int amountOfFiles = 0;
    
    public static void readFileNames() {
    	File folderToRead = new File("public");
		File[] fileNamesInTheFolder = folderToRead.listFiles();
		
		for (int i = 0; i < fileNamesInTheFolder.length; ++i) {
			//System.out.println(fileNamesInTheFolder[i].getName());
			quizVariants[i] = fileNamesInTheFolder[i].getName().replaceFirst("[.][^.]+$", "");
		}
		
		amountOfFiles = folderToRead.listFiles().length;
		
		quizVariants[amountOfFiles] = "Exit";
    }
    
    static int simpleQuizIterator = 1;
    public static void quizIntro(){
        simpleQuizIterator = 1;
        System.out.println("Please select the Quiz:");
        System.out.println("|-------------------------------------------------");
        for (String i : quizVariants){
            if (i != null) {
            	System.out.println("|"+simpleQuizIterator+++". "+i);
            }
        }
        System.out.println("|-------------------------------------------------");
    }

    static String[] readedFileHolder = new String[29];
    static int numberOfChosenQuiz = 1;
    static int[] score = new int[4];
    static String your_answer;

    public static void main(String[] args) throws IOException {
    	readFileNames();
        quizIntro();
        Scanner myScan = new Scanner(System.in);
        while(numberOfChosenQuiz < amountOfFiles + 1 && numberOfChosenQuiz > 0){
            numberOfChosenQuiz = myScan.nextInt();
            if(numberOfChosenQuiz < 1 || numberOfChosenQuiz > amountOfFiles + 1){
                System.out.println("Please chose from the variants above.");
            } else if (quizVariants[numberOfChosenQuiz - 1] == "Exit"){
                System.out.println("Chicken! See you later.");
                break;
            } else if (numberOfChosenQuiz > 0 && numberOfChosenQuiz < amountOfFiles + 1){
                //FileInputStream fileStream = new FileInputStream("Test/public/"+quizVariants[numberOfChosenQuiz - 1]+".txt");
            	FileInputStream fileStream = new FileInputStream("C:\\Users\\108304\\git\\java108304\\Test\\public\\"+quizVariants[numberOfChosenQuiz - 1]+".txt");
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