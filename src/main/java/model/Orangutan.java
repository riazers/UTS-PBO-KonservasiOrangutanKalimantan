/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package model;

public class Orangutan {
    private String idOrangutan;
    private String nama;
    private int umurTahun;

    public Orangutan(String idOrangutan, String nama, int umurTahun) {
        this.idOrangutan = idOrangutan;
        this.nama = nama;
        this.umurTahun = umurTahun;
    }

    public String getIdOrangutan() { return idOrangutan; }
    public void setIdOrangutan(String idOrangutan) { this.idOrangutan = idOrangutan; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getUmurTahun() { return umurTahun; }
    public void setUmurTahun(int umurTahun) { this.umurTahun = umurTahun; }

    public String getJenisKelamin() { return "Tidak Diketahui"; }
    public String getKategori() { return "Orangutan"; }
    public String getInfoTambahan() { return "-"; }

    // =============================================================
    //  >>> UTS - POLYMORPHISM: METHOD OVERLOADING (1/2) <<<
    //  Nama method sama, parameter berbeda.
    // =============================================================

    /** Versi ringkas (tanpa parameter) */
    public String getDeskripsiSingkat() {
        return nama + " (" + getJenisKelamin() + ")";
    }

    /** Versi lengkap (dengan parameter boolean) */
    public String getDeskripsiSingkat(boolean lengkap) {
        // CONDITION (if-else) untuk memilih format output
        if (lengkap) {
            return getKategori() + " - " + nama + ", " + umurTahun + " thn, "
                    + getJenisKelamin() + ", " + getInfoTambahan();
        } else {
            return getDeskripsiSingkat(); // memanggil versi overload di atas
        }
    }
}