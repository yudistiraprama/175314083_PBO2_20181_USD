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
        Dokter dok1 = new Dokter("Budiman");
        AntrianPasien antri = new AntrianPasien();

        try {
            
            pas1.setAlamat("Bantul");
            pas1.setTempatLahir("Bali");
            pas1.setTanggalLahir(22);
            pas1.setBulanLahir(4);
            pas1.setTahunLahir(1999);
            pas1.setNoRekamMedis(pas1.BuatNomorRekamMedis());

            dok1.setNomorPegawai("12345");
            dok1.setAlamat("Jogja");
            dok1.setTempatLahir("Solo");
            dok1.setTanggalLahir(14);
            dok1.setBulanLahir(3);
            dok1.setTahunLahir(1975);
            
            antri.Mendaftar(pas1);
            antri.panggilPasien(0);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        System.out.println("--- PASIEN ---");
        System.out.println("Nama            : " + pas1.getNama());
        System.out.println("Alamat          : " + pas1.getAlamat());
        System.out.println("Tempat Lahir    : " + pas1.getTempatLahir());
        System.out.println("Tanggal Lahir   : " + pas1.getTanggalLahir() + "-" + pas1.getBulanLahir() + "-" + pas1.getTahunLahir());
        System.out.println("No Rekam Medis  : " + pas1.getNoRekamMedis());
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
