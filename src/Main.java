import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kilo (kg) / Boy(m) * Boy(m)

        Scanner data = new Scanner(System.in);
        double boy;
        int kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = data.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = data.nextInt();

        double vki = (kilo)/(boy*boy);

        System.out.println("Vücut kitle endeksiniz : " + vki);
    }
}