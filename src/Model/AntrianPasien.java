/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class AntrianPasien {
    
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    
    public AntrianPasien() {
        
    }
    
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }
    
    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }
    
    public int getBulanAntrian() {
        return bulanAntrian;
    }
    
    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }
    
    public int getTahunAntrian() {
        return tahunAntrian;
    }
    
    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }
    
    public Klinik getKlinik() {
        return klinik;
    }
    
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
    
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }
    
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    /**
     * Fungsi ini digunakan untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     * @throws Exception
     */
    public void Mendaftar(Pasien pasien) {
        daftarPasien.add(pasien);
    }
    
}
