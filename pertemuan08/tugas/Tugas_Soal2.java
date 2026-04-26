package pertemuan08.tugas;
import java.util.Scanner;

public class Tugas_Soal2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalNilaiKumulatif = 0;
        String jawaban;

        do {
            System.out.println("\n--- Perhitungan Nilai Mahasiswa ---");
            System.out.print("Pilih Jenis SKS (2/3): ");
            int sks = input.nextInt();
            int realisasi = (sks == 3) ? 21 : 14; 

            System.out.print("Input jumlah kehadiran: ");
            int hadir = input.nextInt();
            System.out.print("Input nilai Tugas: ");
            double tugas = input.nextDouble();
            System.out.print("Input nilai UTS: ");
            double uts = input.nextDouble();
            System.out.print("Input nilai UAS: ");
            double uas = input.nextDouble();

            double skorHadir = ((double) hadir / realisasi) * 10;
            double skorTugas = tugas * 0.20;
            double skorUTS = uts * 0.30;
            double skorUAS = uas * 0.40;

            double totalNilai = skorHadir + skorTugas + skorUTS + skorUAS;
            totalNilaiKumulatif += totalNilai;

            System.out.println("Jumlah nilai mahasiswa ini: " + Math.round(totalNilai)); 

            System.out.print("Tambah data mahasiswa lain? (y/t): ");
            jawaban = input.next();

        } while (jawaban.equalsIgnoreCase("y")); 

        System.out.println("\nTotal Seluruh Nilai di Akhir: " + totalNilaiKumulatif); 
        input.close();
    }
}