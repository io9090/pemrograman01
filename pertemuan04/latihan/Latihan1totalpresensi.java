package pertemuan04.latihan;

import java.util.Scanner;

public class Latihan1totalpresensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input presensi
        System.out.print("Masukkan jumlah hadir: ");
        float hadir = input.nextFloat();

        System.out.print("Masukkan total pertemuan: ");
        float total = input.nextFloat();

        // Input nilai lain
        System.out.print("Masukkan nilai tugas: ");
        float tugas = input.nextFloat();

        System.out.print("Masukkan nilai UTS: ");
        float uts = input.nextFloat();

        System.out.print("Masukkan nilai UAS: ");
        float uas = input.nextFloat();

        // Hitung presensi (langsung jadi bobot 10%)
        float nilaiPresensi = 0;
        if (total > 0) {
            nilaiPresensi = (hadir / total) * 10;
        }

        // Hitung nilai akhir (SEMUA DIGABUNG)
        float nilaiAkhir = nilaiPresensi 
                         + (tugas * 0.2f)
                         + (uts * 0.3f)
                         + (uas * 0.4f);

        // Output
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        input.close();
    }
}