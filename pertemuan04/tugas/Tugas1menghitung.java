package pertemuan04.tugas;

import java.util.Scanner;

public class Tugas1menghitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celcius;

        System.out.print("Masukkan suhu Celcius: ");
        celcius = input.nextDouble();

        double reamur = (4.0/5.0) * celcius;
        double fahrenheit = (9.0/5.0) * celcius + 32;
        double kelvin = celcius + 273.15;

        System.out.println("Reamur: " + reamur);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        input.close();
    }
}