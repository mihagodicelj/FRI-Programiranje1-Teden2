import java.util.Scanner;

public class Romanje {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int p = sc.nextInt();
        int z = sc.nextInt();

        int konec = d - p;
        int zacetek = d;

            
        
        if (d > p) {
            for (int i = 1; p > 0 && konec > 0; i++) {

                konec = zacetek - p;

                if (konec < 0) {
                    konec = 0;
                }

                System.out.println(i + ": " + zacetek + " -> " + konec);

                zacetek = konec;
                p = p - z;

            }
        }
    }
}