import java.util.Scanner;

public class PemilihanBilangan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Angka: ");
        int angka = sc.nextInt();
        if ((angka % 2==0) && (angka >=0))
        {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        }
        else if ((angka % 2 != 0) && (angka >= 0)) {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
        else
        {
            System.out.println("Angka " + angka + " negatif");
        }
        

    }
}