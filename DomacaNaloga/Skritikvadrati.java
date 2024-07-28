import java.util.Scanner;

public class Skritikvadrati {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int vsota = 0;
        int stevilo = 0;

        if (a > b) {
            stevilo = b;
        } else {
            stevilo = a;
        }

        while (stevilo > 0) {
            a = a - 1;
            b = b - 1;
            vsota = vsota + (a * b);
            stevilo--;
        }

        System.out.println(vsota);
    }
}