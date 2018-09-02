/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jarkom
 */
public class AntrianPasien {

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private int nomorAntrian = 0;
    private final int JUMLAH_MAKSIMAL_PASIEN = 50;
    private Klinik klinik;
    private Pasien[] daftarPasien = new Pasien[JUMLAH_MAKSIMAL_PASIEN];

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

    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    /**
     * Fungsi ini digunakan untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     * @throws Exception
     */
    public void Mendaftar(Pasien pasien) throws Exception {
        // nomor antrian dicek dengan jumlah maksimal pasien yang dilayani
        if (nomorAntrian < JUMLAH_MAKSIMAL_PASIEN) {
            daftarPasien[nomorAntrian] = pasien;
            nomorAntrian++;
        } else {
            // antrian sudah penuh
            throw new Exception("Antrian Penuh Bos");
        }
    }

    /**
     * fungsi ini digunakan untuk memanggil nomor antrian pasien oeh dokter
     *
     * @param nomorAntrian
     * @return
     */
    public Pasien panggilPasien(int nomorAntrian) {
        return daftarPasien[nomorAntrian];

    }

}
