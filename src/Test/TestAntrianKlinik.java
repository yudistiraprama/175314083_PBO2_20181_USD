/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianKlinik;
import Model.Klinik;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jarkom
 */
public class TestAntrianKlinik {

    public static void main(String[] args) {
        AntrianKlinik.buatAntrian(21, 9, 2019, new Klinik("001", "Anak"));
        AntrianKlinik.buatAntrian(21, 9, 2019, new Klinik("001", "Saraf"));
        AntrianKlinik.buatAntrian(21, 9, 2019, new Klinik("001", "Anak"));
        
        for (int i = 0; i < AntrianKlinik.daftarAntrian.size(); i++) {
            System.out.println(AntrianKlinik.daftarAntrian.get(i));
        }
        
//        AntrianKlinik test1 = new AntrianKlinik();
//        try {
//            test1.setTanggalAntrian(21);
//            test1.setBulanAntrian(9);
//            test1.setTahunAntrian(2018);
//            test1.setKlinik(new Klinik("001", "Anak"));
//        } catch (Exception ex) {
//            Logger.getLogger(TestAntrianKlinik.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        AntrianKlinik test2 = new AntrianKlinik();
//        try {
//            test2.setTanggalAntrian(21);
//            test2.setBulanAntrian(9);
//            test2.setTahunAntrian(2018);
//            test2.setKlinik(new Klinik("002", "Saraf"));
//        } catch (Exception ex) {
//            Logger.getLogger(TestAntrianKlinik.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        AntrianKlinik test3 = new AntrianKlinik();
//        try {
//            test3.setTanggalAntrian(21);
//            test3.setBulanAntrian(9);
//            test3.setTahunAntrian(2018);
//            test3.setKlinik(new Klinik("002", "Saraf"));
//        } catch (Exception ex) {
//            Logger.getLogger(TestAntrianPasien.class.getName()).log(Level.SEVERE, null, ex);
//        }
        

    }
}
