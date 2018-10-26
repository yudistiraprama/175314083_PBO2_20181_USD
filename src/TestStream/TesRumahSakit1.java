/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStream;

import java.io.File;
import Model.Pasien;
import Model.RumahSakit;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class TesRumahSakit1 {
    public static void main(String[] args) throws IOException {
        Pasien pasien1 = new Pasien();
        pasien1.setNoRekamMedis("001");
        pasien1.setNama("Puspa");
        pasien1.setAlamat("klaten");
        
        Pasien pasien2 = new Pasien();
        pasien2.setNoRekamMedis("002");
        pasien2.setNama("Adi");
        pasien2.setAlamat("yogya");
        
        RumahSakit rs = new RumahSakit("Panti Rapih","Yogyakarta");
        
        rs.tambahPasienBaru(pasien1);
        rs.tambahPasienBaru(pasien2);
        
        rs.simpanObjekRumahSakit(new File("rsku.dat"));
        
    }
}
