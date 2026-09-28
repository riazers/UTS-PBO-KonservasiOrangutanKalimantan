/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Model catatan rehabilitasi.
 * Menghubungkan Orangutan (polymorphic) dengan LokasiHabitat.
 *
 * @author riaza
 */
public class CatatanRehabilitasi {
    private String idCatatan;
    private Orangutan orangutan;   // Polymorphism: bisa Jantan atau Betina
    private LokasiHabitat lokasi;
    private String statusKesehatan;

    public CatatanRehabilitasi(String idCatatan, Orangutan orangutan, LokasiHabitat lokasi, String statusKesehatan) {
        this.idCatatan = idCatatan;
        this.orangutan = orangutan;
        this.lokasi = lokasi;
        this.statusKesehatan = statusKesehatan;
    }

    public String getIdCatatan() { return idCatatan; }
    public void setIdCatatan(String idCatatan) { this.idCatatan = idCatatan; }

    public Orangutan getOrangutan() { return orangutan; }
    public void setOrangutan(Orangutan orangutan) { this.orangutan = orangutan; }

    public LokasiHabitat getLokasi() { return lokasi; }
    public void setLokasi(LokasiHabitat lokasi) { this.lokasi = lokasi; }

    public String getStatusKesehatan() { return statusKesehatan; }
    public void setStatusKesehatan(String statusKesehatan) { this.statusKesehatan = statusKesehatan; }
}
