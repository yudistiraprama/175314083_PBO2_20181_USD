/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class MainTest {
    public static void main(String[] args) {
        
        Pasien pas1 = new Pasien("Prama");
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        String noRekamMedis = ft.format(date) + pas1.getNama().substring(0, 3);

        try {
        pas1.setTanggalLahir(22);
        pas1.setBulanLahir(4);
        pas1.setTahunLahir(1999);
        pas1.setNoRekamMedis(noRekamMedis);
        }
        
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(pas1.getNama());
        System.out.println(pas1.getTanggalLahir()+"-"+pas1.getBulanLahir()+"-"+pas1.getTahunLahir());
        System.out.println(pas1.getNoRekamMedis());
        
    }
}
