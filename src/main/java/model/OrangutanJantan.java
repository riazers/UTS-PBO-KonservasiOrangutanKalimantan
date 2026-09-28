/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Subclass OrangutanJantan.
 * Mewarisi Orangutan + atribut khusus jantan (ukuran cheek pads).
 *
 * @author riaza
 */
public class OrangutanJantan extends Orangutan {
    private double ukuranCheekPads; // karakteristik fisik orangutan jantan dewasa (cm)

    public OrangutanJantan(String idOrangutan, String nama, int umurTahun, double ukuranCheekPads) {
        super(idOrangutan, nama, umurTahun); // memanggil constructor superclass
        this.ukuranCheekPads = ukuranCheekPads;
    }

    public double getUkuranCheekPads() { return ukuranCheekPads; }
    public void setUkuranCheekPads(double ukuranCheekPads) { this.ukuranCheekPads = ukuranCheekPads; }

    // Polymorphism: Method Overriding
    @Override
    public String getJenisKelamin() {
        return "Jantan";
    }

    @Override
    public String getKategori() {
        return "Orangutan Jantan";
    }

    @Override
    public String getInfoTambahan() {
        return String.format("Cheek Pads: %.1f cm", ukuranCheekPads);
    }
}