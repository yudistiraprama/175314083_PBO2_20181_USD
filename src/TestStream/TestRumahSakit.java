/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStream;

import Model.Pasien;
import Model.RumahSakit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class TestRumahSakit {
    
    public static void main(String[] args) {
        Pasien rs = new Pasien();
        rs.setNoRekamMedis("009");
        rs.setNama("adi");
        rs.setAlamat("aad");
        
        Pasien.tambahPasienBaru(rs);
        
        System.out.println(rs.toString());
        
        rs.simpanDaftarPasien(new File("rs1.txt"));
    }
}
