/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.KonservasiController;
import view.KonservasiView;

/**
 * ENTRY POINT program.
 * Menginisialisasi View & Controller, lalu menjalankan loop menu utama.
 *
 * @author riaza
 */
public class Main {
    public static void main(String[] args) {
        KonservasiView view = new KonservasiView();
        KonservasiController controller = new KonservasiController(view);

        int pilihan = 0;
        do {
            view.tampilkanMenu();
            pilihan = view.inputInteger("Pilih menu [1-5]: ");

            switch (pilihan) {
                case 1:
                    controller.tambahData();
                    break;
                case 2:
                    controller.tampilkanData();
                    break;
                case 3:
                    controller.updateData();
                    break;
                case 4:
                    controller.hapusData();
                    break;
                case 5:
                    view.tampilkanPesan("\nProgram selesai. Salam Lestari Konservasi Orangutan!");
                    break;
                default:
                    view.tampilkanError("Pilihan tidak valid. Silakan pilih menu 1-5.");
            }
        } while (pilihan != 5);

        view.closeScanner();
    }
}