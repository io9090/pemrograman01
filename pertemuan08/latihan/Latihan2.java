package pertemuan08.latihan;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa yang akan didata (b): ");
        int b = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        // --- IMPLEMENTASI DENGAN FOR ---
        System.out.println("\n=== MENGGUNAKAN FOR LOOP ===");
        for (int a = 1; a <= b; a++) {
            prosesInput(input, a);
        }

        // --- IMPLEMENTASI DENGAN WHILE ---
        System.out.println("\n=== MENGGUNAKAN WHILE LOOP ===");
        int i = 1;
        while (i <= b) {
            prosesInput(input, i);
            i++;
        }

        // --- IMPLEMENTASI DENGAN DO-WHILE ---
        System.out.println("\n=== MENGGUNAKAN DO-WHILE LOOP ===");
        int j = 1;
        if (b > 0) {
            do {
                prosesInput(input, j);
                j++;
            } while (j <= b);
        }

        input.close();
    }

    public static void prosesInput(Scanner sc, int nomor) {
        System.out.println("\n--- Data Mahasiswa Ke: " + nomor + " ---");
        
        // S1: Input Nama Mahasiswa
        System.out.print("S1 - Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();

        // S2: Input Kehadiran (0-21 pertemuan)
        System.out.print("S2 - Masukkan Jumlah Kehadiran (0-21): ");
        int hadir = sc.nextInt();

        // S3: Input Nilai Tugas (Ide Tambahan)
        System.out.print("S3 - Masukkan Nilai Tugas (0-100): ");
        double nilaiTugas = sc.nextDouble();
        sc.nextLine(); // Clear buffer

        // S4: Pengecekan Kondisi
        // Menghitung persentase: (hadir / total_pertemuan) * 100
        double persentaseHadir = (hadir / 21.0) * 100;

        if (persentaseHadir < 75) {
            System.out.printf("S4 - PERINGATAN: Kehadiran hanya %.2f%%. Minimal 75%% untuk ikut UAS!\n", persentaseHadir);
        }

        // S5: Cetak Hasil Akhir
        System.out.println("S5 - Hasil Ringkasan:");
        System.out.println("     Nama             : " + nama);
        System.out.println("     Total Kehadiran  : " + hadir + " / 21 pertemuan");
        System.out.printf("     Persentase       : %.2f%%\n", persentaseHadir);
        System.out.println("     Nilai Tugas      : " + nilaiTugas);
        
        // Logika kelulusan sederhana
        if (persentaseHadir >= 75 && nilaiTugas >= 60) {
            System.out.println("     Status           : MEMENUHI SYARAT");
        } else {
            System.out.println("     Status           : TIDAK MEMENUHI SYARAT");
        }
    }
}