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
public class MainTest {

    public static void main(String[] args) {

        Pasien pas1 = new Pasien("Prama");
        Pasien pas2 = new Pasien("Chaca");
        Dokter dok1 = new Dokter("Budiman");
        AntrianPasien antri = new AntrianPasien();
        Klinik klinik = new Klinik();

        try {

            klinik.setNama("KLINIK TONG FANG");
            klinik.setIdKlinik("KTF.Far001");

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

            antri.Mendaftar(pas1);
            antri.Mendaftar(pas2);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(klinik.getNama());
        System.out.println("ID Klinik : " + klinik.getIdKlinik());
        System.out.println("");

        for (int i = 0; i < antri.getDaftarpasien().size(); i++) {
            System.out.println("Antrian "+(i+1)+". "+ antri.getDaftarpasien().get(i).getNama());
            System.out.println("");
            
            System.out.println("--- PASIEN ---");
        System.out.println("Alamat          : " + antri.getDaftarpasien().get(i).getAlamat());
        System.out.println("Tempat Lahir    : " + antri.getDaftarpasien().get(i).getTempatLahir());
        System.out.println("Tanggal Lahir   : " + antri.getDaftarpasien().get(i).getTanggalLahir() + "-" 
                + antri.getDaftarpasien().get(i).getBulanLahir() + "-" 
                + antri.getDaftarpasien().get(i).getTahunLahir());
        System.out.println("No Rekam Medis  : " + antri.getDaftarpasien().get(i).getNoRekamMedis());
        System.out.println("");

        System.out.println("--- DOKTER ---");
        System.out.println("Nama            : " + dok1.getNama());
        System.out.println("No Pegawai      : " + dok1.getNomorPegawai());
        System.out.println("Alamat          : " + dok1.getAlamat());
        System.out.println("Tempet Lahir    : " + dok1.getTempatLahir());
        System.out.println("Tanggal Lahir   : " + dok1.getTanggalLahir() + "-" + dok1.getBulanLahir() + "-" + dok1.getTahunLahir());
        System.out.println("");

        System.out.println("");
        }

        

    }
}
