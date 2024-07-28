import java.util.Scanner;

public class Delitelji {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Vpiši število: ");

        int vnos = sc.nextInt();

        int stDeliteljev = 0;

        for (int i = 1; i <= vnos / 2; i++) {

            if (vnos % i == 0) {
                System.out.println(i);
                stDeliteljev++;
            }
        }
        System.out.println(stDeliteljev);

    }
}