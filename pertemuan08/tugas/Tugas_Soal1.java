package pertemuan08.tugas;
import java.util.Scanner;

public class Tugas_Soal1 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;

        do {
            
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble(); 

            System.out.println("Nilai yang dimasukkan: " + nilai); 

            input.nextLine(); 

            System.out.print("Apakah ingin input nilai lagi? (y/t): ");
            pilihan = input.next().charAt(0); 

        } while (pilihan == 'y' || pilihan == 'Y'); 

        System.out.println("Program Soal 1 Selesai.");
        input.close();
    }
}