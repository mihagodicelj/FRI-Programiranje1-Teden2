import java.util.Scanner;

public class Ugib {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ugibaj število: ");

        int odgovor = sc.nextInt();

        while (odgovor != 42) {
            System.out.print("Še enkrat ugibaj: ");
            odgovor = sc.nextInt();
        }

        System.out.println("Bravo!");

    }
}