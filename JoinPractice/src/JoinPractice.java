/**
 * // Wykorzystaj wiedzę na temat metody join() i stwórz następującą funkcjonalność:
 *
 * //1. Stwórz w pętli FOR kolejnych 10 wątków, które drukują na ekran liczby od 1 do 20.
 * //2. Niech odpalenie kolejnego wątku będzie uruchamiane po tym jak poprzedni wątek zakończy pracę.
 * //3. Zastosuj metodę join() aby uzyskać żądany efekt.
 * */

public class JoinPractice extends Thread {
    public synchronized void run() {
        for (int i = 1; i < 21; ++i){
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i < 11; ++i) {
            JoinPractice myThread = new JoinPractice();
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
