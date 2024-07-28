import java.util.Scanner;

public class Postevanka {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();

        for (int i = 1; i <= stevilo; i++) {

            for (int j = 1; j <= stevilo; j++) {
                int zmnozek = i * j;
                System.out.print(zmnozek + "  ");
            }
            System.out.println();
        }
    }
}