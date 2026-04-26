package pertemuan07.tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ==========================================
        // BAGIAN 1: EVALUASI AKADEMIK (NESTED IF)
        // ==========================================
        System.out.println("=== FORM EVALUASI MAHASISWA ===");
        
        System.out.print("1. Masukkan Total Pertemuan Semester : ");
        int totalPertemuan = input.nextInt();
        System.out.print("2. Masukkan Jumlah Kehadiran Anda    : ");
        int jmlHadir = input.nextInt();
        System.out.print("3. Masukkan Nilai Akhir (0-100)      : ");
        double nilaiAkhir = input.nextDouble();

        String grade = "";
        String status = "";

        // Tahap 1: Cek Persentase Kehadiran
        double persenAbsen = ((double) jmlHadir / totalPertemuan) * 100;

        if (persenAbsen >= 75) {
            // NESTED: Jika absen cukup, baru cek Grade berdasarkan Nilai
            if (nilaiAkhir >= 85) {
                grade = "A";
                status = "LULUS";
            } else if (nilaiAkhir >= 75) {
                grade = "B";
                status = "LULUS";
            } else if (nilaiAkhir >= 65) {
                grade = "C";
                status = "LULUS";
            } else if (nilaiAkhir >= 50) {
                grade = "D";
                status = "TIDAK LULUS";
            } else {
                grade = "E";
                status = "TIDAK LULUS";
            }
        } else {
            // NESTED: Jika absen di bawah 75%, Grade otomatis dibatasi
            if (nilaiAkhir >= 50) {
                grade = "D (Pinalti Absen)";
                status = "TIDAK LULUS";
            } else {
                grade = "E";
                status = "TIDAK LULUS";
            }
        }

        // Tampilkan Hasil Akademik
        System.out.println("\n--- RINGKASAN DATA MAHASISWA ---");
        System.out.println("Persentase Hadir : " + (int)persenAbsen + "%");
        System.out.println("Nilai Akhir      : " + nilaiAkhir);
        System.out.println("Grade Diperoleh  : " + grade);
        System.out.println("Status Kelulusan : " + status);

        System.out.println("\n" + "=".repeat(40) + "\n");

        // ==========================================
        // BAGIAN 2: ANALISIS SUHU (NESTED IF)
        // ==========================================
        System.out.println("=== ANALISIS SUHU LINGKUNGAN (RISET GLOBAL) ===");
        System.out.print("Masukkan Suhu Celcius: ");
        double celcius = input.nextDouble();

        String kategori;

        // Struktur Nested If yang logis untuk pemula:
        // Cek dulu apakah suhu masuk kategori Ekstrim atau Normal
        if (celcius > 30) {
            // NESTED: Pembagian wilayah panas
            if (celcius > 40) {
                kategori = "Sangat Panas (Bahaya/Heatwave)";
            } else {
                kategori = "Panas (Tropis)";
            }
        } else {
            // NESTED: Cek wilayah di bawah 30 derajat
            if (celcius >= 18) {
                kategori = "Normal / Sejuk (Ideal)";
            } else {
                // NESTED LAGI: Pembagian wilayah dingin
                if (celcius <= 0) {
                    kategori = "Sangat Dingin (Beku)";
                } else {
                    kategori = "Dingin (Sub-Tropis)";
                }
            }
        }

        // Hitung Konversi
        double reamur = (4.0/5.0) * celcius;
        double fahrenheit = (9.0/5.0) * celcius + 32;
        double kelvin = celcius + 273.15;

        // Tampilkan Hasil Suhu
        System.out.println("\n--- LAPORAN KONDISI CUACA ---");
        System.out.println("Suhu Input : " + celcius + "°C");
        System.out.println("Kategori   : " + kategori);
        System.out.printf("Konversi   : %.1f R | %.1f F | %.1f K\n", reamur, fahrenheit, kelvin);

        input.close();
    }
}