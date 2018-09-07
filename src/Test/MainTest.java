/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class MainTest {

    public static void main(String[] args) {

        Pasien pas1 = new Pasien("Prama");
        Pasien pas2 = new Pasien("Chaca");
        Dokter dok1 = new Dokter("Budiman");
        AntrianPasien antri = new AntrianPasien();
        Klinik klinik = new Klinik("KTF.Far001", "KLINIK TONG FANG");

        try {

            pas1.setAlamat("Bantul");
            pas1.setTempatLahir("Bali");
            pas1.setTanggalLahir(22);
            pas1.setBulanLahir(4);
            pas1.setTahunLahir(1999);
            pas1.setNoRekamMedis(pas1.BuatNomorRekamMedis());

            pas2.setAlamat("Gejayan");
            pas2.setTempatLahir("Kalimantan");
            pas2.setTanggalLahir(12);
            pas2.setBulanLahir(8);
            pas2.setTahunLahir(1999);
            pas2.setNoRekamMedis(pas2.BuatNomorRekamMedis());

            dok1.setNomorPegawai("12345");
            dok1.setAlamat("Jogja");
            dok1.setTempatLahir("Solo");
            dok1.setTanggalLahir(14);
            dok1.setBulanLahir(3);
            dok1.setTahunLahir(1975);

            antri.setKlinik(klinik);
            antri.Mendaftar(pas1);
            antri.Mendaftar(pas2);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(antri.getKlinik().getNama());
        System.out.println("ID Klinik : " + antri.getKlinik().getIdKlinik());
        System.out.println("");

        for (int i = 0; i < antri.getDaftarPasien().size(); i++) {
            antri.TanggalAntrian();
            System.out.println("Antrian " + (i + 1) + ". " + antri.getDaftarPasien().get(i).getNama());
            System.out.println("");

            System.out.println("--- DATA PASIEN ---");
            System.out.println("Alamat          : " + antri.getDaftarPasien().get(i).getAlamat());
            System.out.println("TTL             : " + antri.getDaftarPasien().get(i).getTempatLahir() + ","
                    + antri.getDaftarPasien().get(i).getTanggalLahir() + "-"
                    + antri.getDaftarPasien().get(i).getBulanLahir() + "-"
                    + antri.getDaftarPasien().get(i).getTahunLahir());
            System.out.println("No Rekam Medis  : " + antri.getDaftarPasien().get(i).getNoRekamMedis());
            System.out.println("");

            System.out.println("--- DATA DOKTER ---");
            System.out.println("Nama            : " + dok1.getNama());
            System.out.println("No Pegawai      : " + dok1.getNomorPegawai());
            System.out.println("Alamat          : " + dok1.getAlamat());
            System.out.println("TTL             : " + dok1.getTempatLahir() + ","
                    + dok1.getTanggalLahir() + "-" + dok1.getBulanLahir() + "-" + dok1.getTahunLahir());
            System.out.println("");

            System.out.println("");
        }

    }
}
