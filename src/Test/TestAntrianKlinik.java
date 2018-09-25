/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianKlinik;
import Model.Klinik;
import Model.Pasien;

/**
 *
 * @author jarkom
 */
public class TestAntrianKlinik {

    public static void main(String[] args) {
        AntrianKlinik.buatAntrian(21, 9, 2018, new Klinik("001", "Anak"));
        AntrianKlinik.buatAntrian(21, 9, 2018, new Klinik("002", "Saraf"));
        AntrianKlinik.buatAntrian(21, 9, 2018, new Klinik("001", "Anak"));

        for (int i = 0; i < AntrianKlinik.daftarAntrian.size(); i++) {
            System.out.println(AntrianKlinik.daftarAntrian.get(i));
        }
        System.out.println("\n");

        Pasien pas1 = new Pasien();
        pas1.setNama("Puspa");
        pas1.setAlamat("Klaten");

        Pasien pas2 = new Pasien();
        pas2.setNama("Adi");
        pas2.setAlamat("Klaten");
        
        Pasien pas3 = new Pasien();
        pas3.setNama("Budi");
        pas3.setAlamat("Klaten");

        int indeksAntrian = AntrianKlinik.cariAntrian(21, 9, 2018, new Klinik("001", "Anak"));
        if (indeksAntrian >= 0) {
            AntrianKlinik.daftarAntrian.get(indeksAntrian).Mendaftar(pas1);
            AntrianKlinik.daftarAntrian.get(indeksAntrian).Mendaftar(pas2);
        }

        System.out.println(AntrianKlinik.daftarAntrian.get(indeksAntrian).getKlinik().getIdKlinik()+", "+AntrianKlinik.daftarAntrian.get(indeksAntrian).getKlinik().getNama());
        for (int i = 0; i < AntrianKlinik.daftarAntrian.get(indeksAntrian).getDaftarPasien().size(); i++) {
            System.out.println(AntrianKlinik.daftarAntrian.get(indeksAntrian).getDaftarPasien().get(i).getNama());
        }
        System.out.println("");
        
    }
}
