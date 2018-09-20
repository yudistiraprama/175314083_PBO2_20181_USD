/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static ArrayList<AntrianPasien> daftarAntrian = new ArrayList<AntrianPasien>();

    /**
     * constructor untuk mendeklarasikan objek AntrianPasien
     */
    public AntrianPasien() {

    }

    /**
     * method untuk mengambil nilai dari variabel tanggalLahir
     *
     * @return
     */
    public int getTanggalAntrian() {
        //pengambalian nilai dari variabel tanggalLahir
        return tahunAntrian;
    }

    /**
     * method untuk meng-set nilai dari variabel tanggalLahir dengan variabel
     * lokal tanggalLahir dengan tipe data String
     *
     * @param tanggalAntrian
     * @throws Exception
     */
    public void setTanggalAntrian(int tanggalAntrian) throws Exception {
        //pengecekan nilai variabel lokal tanggalLahir harus lebih dari 0
        if (tanggalAntrian > 0) {
            //pengecekan nilai variabel lokal tanggalLahir harus kurang dari atau sama dengan 31
            if (tanggalAntrian <= 31) {
                //pernyataan bahwa nilai dari variabel tanggalLahir sama dengan nilai dari variabel lokal tanggalLahir
                this.tanggalAntrian = tanggalAntrian;
            } else {
                // pesan apabila input tanggalLahir lebih dari 31 
                throw new Exception("Input Tanggal Lebih Dari 31");
            }
        } else {
            // pesan apabila input tanggalLahir kurang dari 0 
            throw new Exception("Input Tanggal Kurang Dari 0");
        }
    }

    /**
     * method untuk mengambil nilai dari variabel bulanLahir
     *
     * @return
     */
    public int getBulanAntrian() {
        // pengambalian nilai dari variabel bulanLahir
        return bulanAntrian;
    }

    /**
     * method untuk meng-set nilai dari variabel bulanLahir dengan variabel
     * lokal bulanLahir dengan tipe data String
     *
     * @param bulanAntrian
     * @throws Exception
     */
    public void setBulanAntrian(int bulanAntrian) throws Exception {
        //pengecekan nilai variabel lokal bulanLahir harus lebih dari 0
        if (bulanAntrian > 0) {
            //pengecekan nilai variabel lokal bulanLahir harus kurang dari atau sama dengan 12
            if (bulanAntrian <= 12) {
                //pernyataan bahwa nilai dari variabel bulanLahir sama dengan nilai dari variabel lokal bulanLahir
                this.bulanAntrian = bulanAntrian;
            } else {
                // pesan apabila input bulanLahir lebih dari 12
                throw new Exception("Input Bulan Lebih Dari 12");
            }
        } else {
            // pesan apabila input bulanLahir kurang dari 0 
            throw new Exception("input Bulan Kurang Dari 0");
        }

    }

    /**
     * method untuk mengambil nilai dari variabel tahunLahir
     *
     * @return
     */
    public int getTahunAntrian() {
        // pengambalian nilai dari variabel tahunLahir
        return tahunAntrian;
    }

    /**
     * method untuk meng-set nilai dari variabel tahunLahir dengan variabel
     * lokal tahunLahir dengan tipe data String
     *
     * @param tahunAntrian
     * @throws Exception
     */
    public void setTahunAntrian(int tahunAntrian) throws Exception {
        //pengecekan nilai variabel lokal tahunLahir harus lebih dari 0
        if (tahunAntrian > 0) {
            //pernyataan bahwa nilai dari variabel tahunLahir sama dengan nilai dari variabel lokal tahunLahir
            this.tahunAntrian = tahunAntrian;
        } else {
            // pesan apabila input tahunLahir
            throw new Exception("Salah Input Tahun");
        }
    }

    /**
     * method untuk mengambil nilai dari variabel klinik
     *
     * @return
     */
    public Klinik getKlinik() {
        //pengambalian nilai dari variabel klnik
        return klinik;
    }

    /**
     * method untuk meng-set nilai dari variabel klinik dengan variabel lokal
     * klinik yang bertipe Klinik
     *
     * @param nama
     */
    public void setKlinik(Klinik klinik) {
        // pernyataan bahwa nilai dari variabel klinik sama dengan nilai dari variabel lokal klinik
        this.klinik = klinik;
    }

    /**
     * method untuk mengambil nilai dari variabel daftarPasien
     *
     * @return
     */
    public ArrayList<Pasien> getDaftarPasien() {
        //pengambalian nilai dari variabel daftarPasien
        return daftarPasien;
    }

    /**
     * method untuk meng-set nilai dari variabel daftarPasien dengan variabel
     * lokal daftar pasien yang bertipe ArrayList pasien
     *
     * @param nama
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        // pernyataan bahwa nilai dari variabel daftarPasien sama dengan nilai dari variabel lokal daftarPasien
        this.daftarPasien = daftarPasien;
    }

    /**
     * Method untuk menampilkan tanggal dan waktu antrian
     */
    public void TanggalAntrian() {
        // membuat objek baru date dengan tipe data Date
        Date date = new Date();
        // membuat objek ft bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat ft = new SimpleDateFormat("E dd/MM/yyy 'at' hh:mm:ss");
        // menampilkan data dari objek ft dengan format date
        System.out.println(ft.format(date));
    }

    /**
     * Method untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     * @param tanggal
     * @param bulan
     * @param tahun
     */
    public void Mendaftar(Pasien pasien, int tanggal, int bulan, int tahun) {
        try {
            pasien.setTanggalLahir(tanggal);
            pasien.setBulanLahir(bulan);
            pasien.setTahunLahir(tahun);
        } catch (Exception ex) {
            Logger.getLogger(AntrianPasien.class.getName()).log(Level.SEVERE, null, ex);
        }

        daftarPasien.add(pasien);
    }

    public static AntrianPasien cariPasien(String noRM) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).daftarPasien.get(i).getNoRekamMedis().equalsIgnoreCase(noRM)) {
                return daftarAntrian.get(i);
            }
        }
        return null;
    }

    public static Pasien CariPasien(String noRM, int tanggal, int bulan, int tahun) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).daftarPasien.get(i).getNoRekamMedis().equalsIgnoreCase(noRM)) {
                return daftarAntrian.get(i).daftarPasien.get(i);
            }
        }
        return null;
    }

    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).daftarPasien.get(i).getTanggalLahir() == tanggal
                    && daftarAntrian.get(i).daftarPasien.get(i).getBulanLahir() == bulan
                    && daftarAntrian.get(i).daftarPasien.get(i).getTahunLahir() == tahun) {

                System.out.println("Nomor Antrian Anda  : " + (i + 1));
            } else {
                System.out.println("Data Tidak Ditemukan");

            }
        }
    }

}
