/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jarkom
 */
public class Klinik {
    
    private String idKlinik;
    private String nama;
    
    public Klinik(){
        
    }
    
    public Klinik (String idKlinik, String nama){
        this.idKlinik = idKlinik;
        this.nama = nama;
    }

    public String getIdKlinik() {
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
