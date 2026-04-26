package pertemuan08.tugas;
import java.util.Scanner;

public class Tugas_Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSeluruhNilai = 0;
        int jumlahMahasiswa = 0;
        String jawaban;

        do {
            System.out.print("\nMasukkan Nilai Akhir Mahasiswa ke-" + (jumlahMahasiswa + 1) + ": ");
            double nilai = input.nextDouble();

            totalSeluruhNilai += nilai;
            jumlahMahasiswa++;

            System.out.print("Input nilai mahasiswa lagi? (y/t): ");
            jawaban = input.next();

        } while (jawaban.equalsIgnoreCase("y")); 

        // Menghitung dan menampilkan rata-rata 
        if (jumlahMahasiswa > 0) {
            double rataRata = totalSeluruhNilai / jumlahMahasiswa; 
            System.out.println("\n--- Hasil Akhir ---");
            System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
            System.out.println("Rata-rata Nilai : " + Math.round(rataRata)); 
        }

        System.out.println("Program Selesai.");
        input.close();
    }
}

