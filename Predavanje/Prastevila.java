import java.util.Scanner;

public class Prastevila {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite zgornjo mejo: ");

        int zgornjaMeja = sc.nextInt();


        System.out.println("2");

        for (int i = 3; i <= zgornjaMeja; i += 2) {
            int stDeliteljev = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    stDeliteljev++;
                }
            }
            if (stDeliteljev == 2) {
                System.out.println(i);
            }
        }
    }
}