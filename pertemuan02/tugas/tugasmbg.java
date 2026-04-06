package pertemuan02.tugas;

import java.util.Scanner;
public class tugasmbg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahHari;
        double biayaPerHari, totalPengeluaran;

        System.out.println("=== PROGRAM HITUNG PENGELUARAN MBG ===");

        // Input data
        System.out.print("Masukkan jumlah hari aktif makan dalam 1 bulan: ");
        jumlahHari = input.nextInt();

        System.out.print("Masukkan biaya makan per hari (Rp): ");
        biayaPerHari = input.nextDouble();

        // Proses hitung
        totalPengeluaran = jumlahHari * biayaPerHari;

        // Output hasil
        System.out.println("=======================================");
        System.out.println("Total Hari        : " + jumlahHari + " hari");
        System.out.println("Biaya per Hari    : Rp " + biayaPerHari);
        System.out.println("TOTAL PENGELUARAN : Rp " + totalPengeluaran);
        System.out.println("=======================================");
        
        input.close();
    }
}

