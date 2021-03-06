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
 * @author jarkom
 */
public class AntrianKlinik {

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();
    public static ArrayList<AntrianKlinik> daftarAntrian = new ArrayList<AntrianKlinik>();

    /**
     * constructor untuk mendeklarasikan objek AntrianPasien
     */
    public AntrianKlinik() {

    }

    /**
     * constructor untuk meneklarasikan objek Antrian Pasien dengan parameter
     * tanggal, bulan, tahun, dan klinik
     *
     * @param tanggal
     * @param bulan
     * @param tahun
     * @param klinik
     */
    public AntrianKlinik(int tanggal, int bulan, int tahun, Klinik klinik) {
        this.tanggalAntrian = tanggal;
        this.bulanAntrian = bulan;
        this.tahunAntrian = tahun;
        this.klinik = klinik;

    }

    /**
     * method untuk mengambil nilai dari atribut tanggalAntrian
     *
     * @return
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**
     * method untuk mengset nilai dari atribut tanggalAntrian
     *
     * @param tanggalAntrian
     */
    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    /**
     * method untuk mengambil nilai dari atribut bulanAntrian
     *
     * @return
     */
    public int getBulanAntrian() {
        return bulanAntrian;
    }

    /**
     * method untuk mengset nilai dari atribut bulanAntrian
     *
     * @param bulanAntrian
     */
    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * method untuk mengambil nilai dari atribut tahunAntrian
     *
     * @return
     */
    public int getTahunAntrian() {
        return tahunAntrian;
    }

    /**
     * method untuk mengset nilai dari atribut tahunAntrian
     *
     * @param tahunAntrian
     */
    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
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
     * @param klinik
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
        return daftarPasienAntri;
    }

    /**
     * method untuk meng-set nilai dari variabel daftarPasien dengan variabel
     * lokal daftar pasien yang bertipe ArrayList pasien
     *
     * @param daftarPasien
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        // pernyataan bahwa nilai dari variabel daftarPasien sama dengan nilai dari variabel lokal daftarPasien
        this.daftarPasienAntri = daftarPasien;
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
     */
    public void Mendaftar(Pasien pasien) {
        daftarPasienAntri.add(pasien);
    }

    /**
     * method untuk daftar pasien
     *
     * @param pasien
     * @param tanggal
     * @param bulan
     * @param tahun
     * @param klinik
     */
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0) {
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);

        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        }
    }

    /**
     * method untuk mencari pasien dalam list daftarpasien yang terdapat di list
     * daftarantrian
     *
     * @param noRM
     * @return
     */
    public static Pasien CariPasien(String noRM) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getDaftarPasien().get(i) != null) {
                for (int j = 0; j < daftarAntrian.get(i).getDaftarPasien().size(); j++) {
                    if (daftarAntrian.get(i).getDaftarPasien().get(j).getNoRekamMedis().equalsIgnoreCase(noRM)) {
                        return daftarAntrian.get(i).getDaftarPasien().get(j);
                    }
                }
            }
        }
        return null;
    }

    /**
     * menthod untuk membuat antrian dan ditambahka ke list daftarAntrian
     *
     * @param tanggal
     * @param bulan
     * @param tahun
     * @param klinik
     */
    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        // cari antrian dalam list daftar antri
        if (cariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            // tambah dalam list antrian
            daftarAntrian.add(antrian);
        } else {
            System.out.println("Antrian " + klinik.getNama() + " Sudah Ada");
            System.out.println("");
        }
    }

    /**
     * method untuk mencari antrian pada list daftar antrian
     *
     * @param tanggal
     * @param bulan
     * @param tahun
     * @param klinik
     * @return
     */
    public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntrian() == tanggal
                    && daftarAntrian.get(i).getBulanAntrian() == bulan
                    && daftarAntrian.get(i).getTahunAntrian() == tahun
                    && daftarAntrian.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * method untuk mengubah tipe data menjadi string
     *
     * @return
     */
    @Override
    public String toString() {
        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + klinik.getIdKlinik() + klinik.getNama();
    }

}
