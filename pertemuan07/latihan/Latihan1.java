package pertemuan07.latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalPertemuan = 21;

        System.out.print("Masukkan Jumlah Kehadiran (0-21): ");
        int jmlHadir = input.nextInt();

        System.out.print("Masukkan Nilai Akhir: ");
        double nilaiAkhir = input.nextDouble();

        // RUMUS: (jmlHadir / totalPertemuan) * 100
        double persentaseHadir = ((double) jmlHadir / totalPertemuan) * 100;

        String grade;
        String status;

        System.out.println("\n--- HASIL EVALUASI ---");
        System.out.println("Persentase Kehadiran Anda: " + (int)persentaseHadir + "%");

        // NESTED IF: Kehadiran dan Nilai saling berhubungan
        if (persentaseHadir >= 75) {
            // JIKA ABSEN CUKUP, grade ditentukan oleh Nilai Akhir secara normal
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
            // JIKA ABSEN TIDAK CUKUP (< 75%)
            // Walaupun nilai 80 atau 100, langsung jatuh ke Grade D/E
            if (nilaiAkhir >= 50) {
                grade = "D";
                status = "TIDAK LULUS (Kehadiran Kurang)";
            } else {
                grade = "E";
                status = "TIDAK LULUS (Kehadiran & Nilai Kurang)";
            }
        }

        System.out.println("Nilai Akhir          : " + nilaiAkhir);
        System.out.println("Grade                : " + grade);
        System.out.println("Status               : " + status);

        input.close();
    }
}