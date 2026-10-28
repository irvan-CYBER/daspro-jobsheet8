import java.util.Scanner;

public class Tugas317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
            return;
        }

        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 0;
        int maxBarang = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan di Toko " + i + ": ");
            int jumlahPelanggan = sc.nextInt();
            
            while (jumlahPelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif. Ulangi!");
                System.out.print("Masukkan jumlah pelanggan di Toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();
            }

            int totalBarangTokoIni = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Jumlah barang dibeli pelanggan " + j + ": ");
                int barang = sc.nextInt();
                
                while (barang < 0) {
                    System.out.println("  Jumlah barang tidak boleh negatif. Ulangi!");
                    System.out.print("  Jumlah barang dibeli pelanggan " + j + ": ");
                    barang = sc.nextInt();
                }
                totalBarangTokoIni += barang;
            }

            System.out.println("Toko " + i + " pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangTokoIni);
            
            totalBarangSeluruhToko += totalBarangTokoIni;

            if (totalBarangTokoIni > maxBarang) {
                maxBarang = totalBarangTokoIni;
                tokoTerbanyak = i;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        
        sc.close();
    }
}