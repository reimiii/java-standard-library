package franxx.code.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Umur: ");
        Integer umur = scanner.nextInt();

        System.out.println("Nama: " + name + ", Umur: " + umur);
    }
}
