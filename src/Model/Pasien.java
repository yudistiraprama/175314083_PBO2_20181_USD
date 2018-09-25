/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    private String nik = noRekamMedis;
    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    /**
     * constructor untuk mendeklarasikan objek pasien
     */
    public Pasien() {

    }

    /**
     * constructor untuk mendeklarasikan objek pasien dengan parameter lokal
     * nama dengan tipe data String
     *
     * @param nama
     */
    public Pasien(String nama) {
        // pernyataan bahwa nilai variabel nama sama dengan nilai dari variabel lokal nama
        this.nama = nama;
    }

    public Pasien(String nama, String Alamat, String tempatLahir, int tanggal, int bulan, int tahun, String nik) {
        this.nama = nama;
        this.alamat = Alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggal;
        this.bulanLahir = bulan;
        this.tahunLahir = tahun;
        this.noRekamMedis = nik;
    }

    /**
     * method untuk mengambil nilai dari variabel noRekamMedis
     *
     * @return
     */
    public String getNoRekamMedis() {
        //pengambalian nilai dari variabel noRekamMedis
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    /**
     * method untuk meng-set nilai dari variabel noRekamMedis dengan variabel
     * lokal noRekamMedis dengan tipe data String
     *
     * @param noRekamMedis
     * @throws Exception
     */
//    public void setNoRekamMedis(String noRekamMedis) throws Exception {
//         pengecekan panjang karakter variabel noRekamMedis harus lebih dari 6 
//        if (noRekamMedis.length() > 6) {
//            // pernyataan bahwa nilai variabel noRekamMedis sama dengan nilai dari variabel lokal noRekamMedis
//            this.noRekamMedis = noRekamMedis;
//        } else {
//            // pesan apabila input noRekamMedis salah
//            throw new Exception("Nomor rekam Medis Salah");
//        }
//        
//    }
    /**
     * method untuk mengambil nilai dari variabel nama
     *
     * @return
     */
    public String getNama() {
        // pengambalian nilai dari variabel nama
        return nama;
    }

    /**
     * method untuk mengset nilai dari variabel nema dengan parameter lokal nama
     * yang bertipe String
     *
     * @param nama
     */
    public void setNama(String nama) {
        // pernyataan bahwa nilai dari variabel nama sama dengan nilai dari variabel lokal nama
        this.nama = nama;
    }

    /**
     * method untuk mengambil nilai dari variabel alamat
     *
     * @return
     */
    public String getAlamat() {
        //pengambalian nilai dari variabel alamat
        return alamat;
    }

    /**
     * method untuk mengset nilai dari variabel alamat dengan parameter lokal
     * alamat yang bertipe String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        // pernyataan bahwa nilai dari variabel alamat sama dengan nilai dari variabel lokal alamat
        this.alamat = alamat;
    }

    /**
     * method untuk mengambil nilai dari variabel tempatLahir
     *
     * @return
     */
    public String getTempatLahir() {
        //pengambalian nilai dari variabel tempatLahir
        return tempatLahir;
    }

    /**
     * method untuk mengset nilai dari variabel tempatLahir dengan parameter
     * lokal tempatLahir yang bertipe String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        // pernyataan bahwa nilai dari variabel tempatLahir sama dengan nilai dari variabel lokal tempatLahir
        this.tempatLahir = tempatLahir;
    }

    /**
     * method untuk mengambil nilai dari variabel tanggalLahir
     *
     * @return
     */
    public int getTanggalLahir() {
        //pengambalian nilai dari variabel tanggalLahir
        return tanggalLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel tanggalLahir dengan variabel
     * lokal tanggalLahir dengan tipe data String
     *
     * @param tanggalLahir
     */
    public void setTanggalLahir(int tanggalLahir) {
        //pernyataan bahwa nilai dari variabel tanggalLahir sama dengan nilai dari variabel lokal tanggalLahir
        this.tanggalLahir = tanggalLahir;

    }

    /**
     * method untuk mengambil nilai dari variabel bulanLahir
     *
     * @return
     */
    public int getBulanLahir() {
        // pengambalian nilai dari variabel bulanLahir
        return bulanLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel bulanLahir dengan variabel
     * lokal bulanLahir dengan tipe data String
     *
     * @param bulanLahir
     */
    public void setBulanLahir(int bulanLahir) {
        //pernyataan bahwa nilai dari variabel bulanLahir sama dengan nilai dari variabel lokal bulanLahir
        this.bulanLahir = bulanLahir;
    }

    /**
     * method untuk mengambil nilai dari variabel tahunLahir
     *
     * @return
     */
    public int getTahunLahir() {
        // pengambalian nilai dari variabel tahunLahir
        return tahunLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel tahunLahir dengan variabel
     * lokal tahunLahir dengan tipe data String
     *
     * @param tahunLahir
     */
    public void setTahunLahir(int tahunLahir) {
        //pernyataan bahwa nilai dari variabel tahunLahir sama dengan nilai dari variabel lokal tahunLahir
        this.tahunLahir = tahunLahir;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * method untuk membuat nomor rekam medis yang terdiri dari tanggal pasien
     * mengatri ditambah 3 huruf pertama dari nama
     *
     * @return
     */
    public String BuatNomorRekamMedis() {
        // mendeklarasikan variabel nomorRekamMedis yang bertipe String
        String nomorRekamMEdis;
        // membuat objek baru date dengan tipe data Date
        Date date = new Date();
        // membuat objek ft bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        //mendeklarasikan nilai dari variabel nomorRekamMedis yaitu tanggal ditambah 3 huruf pertama dari nama
        nomorRekamMEdis = ft.format(date) + nama.substring(0, 3);
        //pengembalian nilai variabel nomorRekamMedis
        return nomorRekamMEdis;
    }

    /**
     * method untuk menambahkan objek pasien ke arrayList daftarpasien
     *
     * @param pasien
     */
    public static void tambahPasienBaru(Pasien pasien) {
        //mengisi daftaPasien dengan objek pasien 
        daftarPasien.add(pasien);

    }

    /**
     * method untuk mencari object pasien berdasarkan nomor rekam medis
     *
     * @param NoRM
     * @return
     */
    public static Pasien cariPasien(String NoRM) {
        //perulangan sebanyak indeks pada daftarpasien
        for (int i = 0; i < daftarPasien.size(); i++) {
            //membandingkan data variabel NORM dengan nomor rekam medis dari object pasien indeks ke i
            if (daftarPasien.get(i).noRekamMedis.equalsIgnoreCase(NoRM)) {
                return daftarPasien.get(i);
            }
        }
        //apabila data tidak cocok maka akan mengembalikan nilai null
        return null;
    }
}
