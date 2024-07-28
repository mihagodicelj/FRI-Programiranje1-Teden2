import java.util.Scanner;

public class Skoki {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Koliko atletov tekmuje? ");

        int stAtletov = sc.nextInt();
        int najSkok = 0;
        int najSkakalec = 0;
        int i = 0;

        for (i = 1; i <= stAtletov; i++) {
            System.out.print("Vnesi dolžino " + i + ".skoka: ");
            int skok = sc.nextInt();
            

            if (skok > najSkok) {
                najSkok = skok;
                najSkakalec = i;
            }
        }

        i = i - 1;
        System.out.println("Najbolje je skočil " + i + ". skakalec z dolžino: " + najSkok);
    }
}