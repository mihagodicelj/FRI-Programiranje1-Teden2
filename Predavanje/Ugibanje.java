import java.util.*;

public class Ugibanje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random ();

        System.out.print("Vnesite zgornjo mejo: ");
        int zgornjaMeja = sc.nextInt();

        int izbranoStevilo = rnd.nextInt(zgornjaMeja) + 1;

        int ugib = sc.nextInt();

        while (ugib != izbranoStevilo) {
            if (ugib < izbranoStevilo) {
                System.out.println("Število je večje.");
            } else if (ugib > izbranoStevilo) {
                System.out.println("Število je manjše.");
            }
            ugib = sc.nextInt();
        }

        if (ugib == izbranoStevilo) {
            System.out.println("Zadeli ste!");
        }
    }
        
}