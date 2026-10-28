import java.util.Scanner;

public class Tugas117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        // Validasi n minimal 1
        if (n < 1) {
            System.out.println("Nilai n minimal 1.");
            return;
        }

        int totalAngka = 0;
        
        // Nested loop untuk mencetak pola
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++;
            }
            System.out.println();
        }
        
        // Menampilkan total angka yang dicetak
        System.out.println("Total angka tercetak: " + totalAngka);
        sc.close();
    }
}