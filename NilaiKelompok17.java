import java.util.Scanner;
    public class NilaiKelompok17{
        public static void main (String[] args){
            Scanner sc= new Scanner (System.in);
            System.out.print("Masukkan jumlah kelompok : ");
            int jumlahKelompok = sc.nextInt();
            System.out.print("Masukkan jumlah penilai  : ");
            int jumlahPenilai = sc.nextInt();
        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1; // penghitung outer loop
            double rataTertinggi = -1; // -1 agar kelompok pertama pasti tercatat
            int kelompokTerbaik = 0;

            // Outer loop: pake WHILE buat iterasi per kelompok
            while (nomorKelompok <= jumlahKelompok){
                System.out.println("kelompok"+ nomorKelompok);
                double totalNilai =0;
                // Inner loop: pake FOR buat masukin nilai dari penilai
                for (int j = 1; j <= jumlahPenilai; j++){
                    int nilai;
                    // DO-WHILE loop: buat validasi nilai wajib 0-100
                    do{
                        System.out.print("nilai dari penilai"+j+":");
                        nilai=sc.nextInt();
                        if (nilai<0||nilai>100){
                            System.out.println(" Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;

                // Menghitung rata-rata
                } 
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);
                
                // Update kelompok terbaik kalau rata-ratanya lebih besar
                if (rataNilai > rataTertinggi){ 
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }
             nomorKelompok++; // Increment biar perulangan while bisa berhenti
            } 
            System.out.println("==============================");
            System.out.println("Kelompok terbaik    : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }
        sc.close();
    }
}