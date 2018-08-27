/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

/**
 *
 * @author Asus
 */
public class MainTest {
    public static void main(String[] args) {
        
        Pasien pas1 = new Pasien("Prama");

        try {
        pas1.setTanggalLahir(22);
        pas1.setBulanLahir(4);
        pas1.setTahunLahir(1999);  
        }
        
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(pas1.getNama());
        System.out.println(pas1.getTanggalLahir()+"-"+pas1.getBulanLahir()+"-"+pas1.getTahunLahir());     
    }
}
