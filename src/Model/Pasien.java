/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Pasien {

    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    /**
     * constructor untuk mendeklarasikan objek pasien
     */
    public Pasien() {

    }

    /**
     * constructor untuk mendeklarasikan objek pasien dengan parameter lokal nama dengan tipe data String
     * @param nama 
     */
    public Pasien(String nama) {
        this.nama = nama;
    }

    /**
     * method untuk mengambil nilai dari variabel noRekamMedis
     * @return 
     */
    public String getNoRekamMedis() {
        //pengambalian nilai dari variabel noRekamMedis
        return noRekamMedis;
    }

    /**
     * method untuk meng-set nilai dari variabel noRekamMedis dengan variabel lokal noRekamMedis dengan tipe data String
     * @param noRekamMedis
     * @throws Exception 
     */
    public void setNoRekamMedis(String noRekamMedis) throws Exception {
        // pengecekan panjang karakter variabel noRekamMedis harus lebih dari 6 
        if (noRekamMedis.length() > 6) {
            this.noRekamMedis = noRekamMedis;
        } else {
            // input noRekamMedis salah
            throw new Exception("Nomor rekam Medis Salah");
        }
    }

    /**
     * method untuk mengambil nilai dari variabel nama
     * @return 
     */
    public String getNama() {
        // pengambalian nilai dari variabel nama
        return nama;
    }

    /** 
     * method untuk mengset nilai dari variabel nema dengan parameter lokal nama yang bertipe String
     * @param nama 
     */
    public void setNama(String nama) {
        // pernyataan bahwa nilai dari variabel nama sama dengan nilai dari variabel lokal nama
        this.nama = nama;
    }

    /**
     * 
     * @return 
     */
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("Input Tanggal Lebih Dari 31");
            }
        } else {
            throw new Exception("Input Tanggal Kurang Dari 0");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Input Bulan Lebih Dari 12");
            }
        } else {
            throw new Exception("input Bulan Kurang Dari 0");
        }

    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Salah Input Tahun");
        }
    }

    /**
     * 
     * @return 
     */
    public String BuatNomorRekamMedis() {
        String nomorRekamMEdis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        nomorRekamMEdis = ft.format(date) + nama.substring(0, 3);
        return nomorRekamMEdis;
    }
    
    /**
     * 
     */

}
