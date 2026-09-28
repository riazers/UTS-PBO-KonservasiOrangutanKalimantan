/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Subclass OrangutanBetina.
 * Mewarisi Orangutan + atribut khusus betina (jumlah anak).
 *
 * @author riaza
 */
public class OrangutanBetina extends Orangutan {
    private int jumlahAnak;

    public OrangutanBetina(String idOrangutan, String nama, int umurTahun, int jumlahAnak) {
        super(idOrangutan, nama, umurTahun);
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() { return jumlahAnak; }
    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }

    // Polymorphism: Method Overriding 
    @Override
    public String getJenisKelamin() {
        return "Betina";
    }

    @Override
    public String getKategori() {
        return "Orangutan Betina";
    }

    @Override
    public String getInfoTambahan() {
        return "Jumlah Anak: " + jumlahAnak;
    }
}
