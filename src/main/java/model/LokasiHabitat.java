/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Model lokasi habitat orangutan.
 *
 * @author riaza
 */
public class LokasiHabitat {
    private String idLokasi;
    private String namaWilayah;
    private String provinsi;
    private String statusZona;

    public LokasiHabitat(String idLokasi, String namaWilayah, String provinsi, String statusZona) {
        this.idLokasi = idLokasi;
        this.namaWilayah = namaWilayah;
        this.provinsi = provinsi;
        this.statusZona = statusZona;
    }

    public String getIdLokasi() { return idLokasi; }
    public void setIdLokasi(String idLokasi) { this.idLokasi = idLokasi; }

    public String getNamaWilayah() { return namaWilayah; }
    public void setNamaWilayah(String namaWilayah) { this.namaWilayah = namaWilayah; }

    public String getProvinsi() { return provinsi; }
    public void setProvinsi(String provinsi) { this.provinsi = provinsi; }

    public String getStatusZona() { return statusZona; }
    public void setStatusZona(String statusZona) { this.statusZona = statusZona; }
}