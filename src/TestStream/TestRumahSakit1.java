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

/**
 *
 * @author Asus
 */
public class TestRumahSakit1 {

    public static void main(String[] args) throws IOException {
    Pasien.bacaDaftarPasien(new File("rs1.txt"));
        for (int i = 0; i < Pasien.getDaftarPasien().size(); i++) {
            System.out.println(Pasien.getDaftarPasien().get(i).toString());
        }
    
    }
}
