/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

public class KonservasiView {
    private Scanner scanner;

    public KonservasiView() {
        this.scanner = new Scanner(System.in);
    }

    public void tampilkanMenu() {
        System.out.println("\n=======================================================");
        System.out.println("  SISTEM KONSERVASI & REHABILITASI ORANGUTAN KALIMANTAN ");
        System.out.println("=======================================================");
        System.out.println("1. Tambah Data Observasi / Rehabilitasi (Create)");
        System.out.println("2. Tampilkan Semua Data Orangutan (Read)");
        System.out.println("3. Update Data Rehabilitasi (Update)");
        System.out.println("4. Hapus Data Catatan Konservasi (Delete)");
        System.out.println("5. Keluar Program");
        System.out.println("-------------------------------------------------------");
    }

    // =============================================================
    //  >>> UTS - POLYMORPHISM: METHOD OVERLOADING (2/2) <<<
    // =============================================================

    /** Versi 1: cetak sekali */
    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }

    /** Versi 2: cetak berulang sebanyak n kali */
    public void tampilkanPesan(String pesan, int ulang) {
        // LOOPING untuk mencetak pesan berulang
        for (int i = 0; i < ulang; i++) {
            System.out.println(pesan);
        }
    }

    public void tampilkanError(String pesan) {
        System.out.println("[Error] " + pesan);
    }

    public int inputInteger(String pesan) {
        while (true) { // LOOPING validasi
            System.out.print(pesan);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                tampilkanError("Masukkan angka yang valid!");
            }
        }
    }

    public double inputDouble(String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                tampilkanError("Masukkan angka desimal yang valid!");
            }
        }
    }

    public String inputString(String pesan) {
        while (true) {
            System.out.print(pesan);
            String val = scanner.nextLine().trim();
            if (!val.isEmpty()) {
                return val;
            }
            tampilkanError("Teks tidak boleh kosong!");
        }
    }

    public void tampilkanHeaderTabel() {
        System.out.println("\n=================================================================================================================================================");
        System.out.printf("| %-8s | %-16s | %-12s | %-6s | %-8s | %-20s | %-18s | %-15s | %-20s |\n",
                "ID", "Kategori", "Nama", "Umur", "Gender", "Wilayah Habitat", "Provinsi", "Status", "Info Tambahan");
        System.out.println("=================================================================================================================================================");
    }

    public void tampilkanBarisData(CatatanRehabilitasiWrapper w) {
        System.out.printf("| %-8s | %-16s | %-12s | %-6s | %-8s | %-20s | %-18s | %-15s | %-20s |\n",
                w.idCatatan, w.kategori, w.nama, w.umur, w.gender,
                w.wilayah, w.provinsi, w.status, w.infoTambahan);
    }

    public void tampilkanFooterTabel() {
        System.out.println("=================================================================================================================================================");
    }

    public void closeScanner() {
        if (scanner != null) scanner.close();
    }

    public static class CatatanRehabilitasiWrapper {
        public String idCatatan, kategori, nama, umur, gender, wilayah, provinsi, status, infoTambahan;
    }
}