import java.io.*;

public class Quiz {
    public static void main(String[] args) {
        String tmpQuiz = null;
        char answer1, answer2, answer3;
        try {
            tmpQuiz = "";
            FileInputStream fStream = new FileInputStream("Test/public/General.txt");
            DataInputStream fileInput = new DataInputStream(fStream);
            BufferedReader fileBufferRead = new BufferedReader(new InputStreamReader(fileInput));
            String strLine;
            while ((strLine = fileBufferRead.readLine()) != null) {
                //System.out.println(strLine);
                tmpQuiz = tmpQuiz + "\n" + strLine;
            }
            fileInput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(tmpQuiz);
        char[] quiz = tmpQuiz.toCharArray();
        for (char i : quiz){
            System.out.print(i);
        }
    }
}
