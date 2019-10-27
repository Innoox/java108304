import java.io.FileInputStream;

public class AutoQuiz {
    char choose_question;
    char your_answer;
    String fileNameToOpen;
    String[] quizVariants = {"Mathematics", "Informatics", "General"};
    public void main(String[] args){
        System.out.println("Please select the Quiz:");
        for (String i : quizVariants){
            System.out.println(i);
        }
    }
}
