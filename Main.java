import java.util.*;

public class Main {

    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;
        double alan, u;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Üçgenin 1. kearını giriniz: ");
        kenar1 = girdi.nextInt();
        System.out.print("Üçgenin 2. kearını giriniz: ");
        kenar2 = girdi.nextInt();
        System.out.print("Üçgenin 3. kearını giriniz: ");
        kenar3 = girdi.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = u * (u - kenar1) * (u - kenar2) * (u - kenar3);
        alan = Math.sqrt(alan);

        System.out.println("Üçgenin alanı: " + alan);
    }
}
