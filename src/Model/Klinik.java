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
public class Klinik {

    private String idKlinik;
    private String nama;
    public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

    /**
     * constructor untuk mendeklarasikan objek KLinik
     */
    public Klinik() {

    }

    /**
     * constructor untuk mendeklarasikan objek KLinik dengan parameter lokal
     * idKlinik dan nama dengan tipe data String
     *
     * @param nama
     */
    public Klinik(String idKlinik, String nama) {
        // pernyataan bahwa nilain variabel idKlinik sama dengan nilai dari variabel lokal idKlinik
        this.idKlinik = idKlinik;
        // pernyataan bahwa nilain variabel nama sama dengan nilai dari variabel lokal nama
        this.nama = nama;
    }

    /**
     * method untuk mengambil nilai dari variabel idKlinik
     *
     * @return
     */
    public String getIdKlinik() {
        //pengambalian nilai dari variabel idKlinik
        return idKlinik;
    }

    /**
     * method untuk meng-set nilai dari variabel idKLinik dengan variabel lokal
     * idKLinik dengan tipe data String
     *
     * @param nama
     */
    public void setIdKlinik(String idKlinik) {
        // pernyataan bahwa nilai dari variabel idKlinik sama dengan nilai dari variabel lokal idKLinik
        this.idKlinik = idKlinik;
    }

    /**
     * method untuk mengambil nilai dari variabel nama
     *
     * @return
     */
    public String getNama() {
        //pengambalian nilai dari variabel nama
        return nama;
    }

    /**
     * method untuk meng-set nilai dari variabel nama dengan variabel lokal nama
     * dengan tipe data String
     *
     * @param nama
     */
    public void setNama(String nama) {
        // pernyataan bahwa nilai dari variabel nama sama dengan nilai dari variabel lokal nama
        this.nama = nama;
    }

    public static void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public static Klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNama().equalsIgnoreCase(namaKlinik)) {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }
}
