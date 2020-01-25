import com.sun.org.apache.xpath.internal.operations.Div;

/**
 * Utwórz klasę dziedziczšcš po Thread, której zadaniem jest wypisanie wszystkich liczb
 * podzielnych przez 3 z zakresu liczb od X do Y.
 * Utwórz kod, który wystartuje równolegle 5 wštków,
 * gdzie każdy z wštków wypisze owe liczby na ekran w zakresach liczb odpowiednio 0-100,  101-200, 201-300 .
 * */
public class Divisibility extends Thread {

    int beg = 0;
    int end = 0;
    String name = "";

    Divisibility(int tmpBeg, int tmpEnd, String tmpName) {
        this.beg = tmpBeg;
        this.end = tmpEnd;
        this.name = tmpName;
    }

    public synchronized void run() {
        int tmpBeg = this.beg;
        int tmpEnd = this.end;
        for (;tmpBeg < tmpEnd; ++tmpBeg) {
            if (tmpBeg % 3 == 0) {
                System.out.println(this.name+": "+tmpBeg);
            }
        }
    }

    public static void main(String[] args) {
        Divisibility myT1 = new Divisibility(0, 100, "First Thread");
        myT1.start();
        Divisibility myT2 = new Divisibility(101, 200, "Second Thread");
        myT2.start();
        Divisibility myT3 = new Divisibility(201, 300, "Third Thread");
        myT3.start();
        Divisibility myT4 = new Divisibility(301, 400, "Fourth Thread");
        myT4.start();
        Divisibility myT5 = new Divisibility(401, 500, "Fifth Thread");
        myT5.start();
    }
}