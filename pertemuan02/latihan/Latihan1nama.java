package pertemuan02.latihan;

import java.util.Scanner;

public class Latihan1nama{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama; int usia;
        System.out.print("Input Nama:");
        nama = input.nextLine();
        System.out.print("Input Usia:");
        usia = input.nextInt();
        System.out.println("============");
        System.out.println("Nama:"+nama);
        System.out.println("Usia:"+usia);
        System.out.println("============");
    }
}
