/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRMLabel;
    private JLabel alamatLabel;
    private JTextField namaText;
    private JTextField noRMText;
    private JTextField alamatText;
    private JButton antriButton;

    /**
     * konstruktor TambahAntrianDialog untuk membuat object
     */
    public TambahAntrianDialog() {
        //konstruktor memanggil method init()
        init();
    }

    /**
     * konstruktor TambahAntrianDialog untuk membuat object dengan variabel
     * lokal title yang bertipe string
     *
     * @param title
     */
    public TambahAntrianDialog(String title) {
        //mengset title dengan nilai dari variabel lokal title
        this.setTitle(title);
        //konstruktor memanggil method init()
        init();
    }

    public void init() {
        //mengset layout dengan null
        this.setLayout(null);

        // membuat object judul label yang bertipe JLabel
        judulLabel = new JLabel();
        // mengset text untuk objek judulLabel
        judulLabel.setText("FORM DAFTAR ANTRIAN");
        // mengatur font untuk judulLabel
        judulLabel.setFont(new Font(null, Font.BOLD, 16));
        // mengatur posisi dan ukuran object
        judulLabel.setBounds(50, 20, 250, 30);
        //menambah judul label ke TambahAntrianDialog
        this.add(judulLabel);

        // membuat object noRMlabel yang bertipe JLabel
        noRMLabel = new JLabel();
        // mengset text untuk objek noRMLabel
        noRMLabel.setText("No. RM");
        // mengatur posisi dan ukuran object
        noRMLabel.setBounds(50, 70, 80, 20);
        //menambah noRMlabel ke TambahAntrianDialog
        this.add(noRMLabel);

        // membuat object noRMtext yang bertipe JTextField
        noRMText = new JTextField();
        // mengatur posisi dan ukuran object
        noRMText.setBounds(150, 70, 120, 20);
        //menambah noRMtext ke TambahAntrianDialog
        this.add(noRMText);

        // membuat object namalabel yang bertipe JLabel
        namaLabel = new JLabel();
        // mengset text untuk objek namaLabel
        namaLabel.setText("Nama");
        // mengatur posisi dan ukuran object
        namaLabel.setBounds(50, 100, 80, 20);
        //menambah namalabel ke TambahAntrianDialog
        this.add(namaLabel);

        // membuat object namatext yang bertipe JTextField
        namaText = new JTextField();
        // mengatur posisi dan ukuran object
        namaText.setBounds(150, 100, 120, 20);
        //menambah namatext ke TambahAntrianDialog
        this.add(namaText);

        // membuat object alamatlabel yang bertipe JLabel
        alamatLabel = new JLabel();
        // mengset text untuk objek alamatLabel
        alamatLabel.setText("Alamat");
        // mengatur posisi dan ukuran object
        alamatLabel.setBounds(50, 130, 80, 20);
        //menambah alamatlabel ke TambahAntrianDialog
        this.add(alamatLabel);

        // membuat object alamattext yang bertipe JTextField
        alamatText = new JTextField();
        // mengatur posisi dan ukuran object
        alamatText.setBounds(150, 130, 120, 20);
        //menambah alamattext ke TambahAntrianDialog
        this.add(alamatText);

        // membuat object antributton yang bertipe JButton
        antriButton = new JButton();
        // mengset text untuk objek antriButton
        antriButton.setText("Antri");
        // mengatur posisi dan ukuran object
        antriButton.setBounds(150, 180, 80, 30);
        //menambah antributton ke TambahAntrianDialog
        this.add(antriButton);

        //noRMText memanggil method addActionListener
        noRMText.addActionListener(this);
        //antributton memanggil method addActionListener
        antriButton.addActionListener(this);

    }

    /**
     * method abstrak dari ActionListener untuk pengoperasian tiap object
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        // perbandingan apabila yang di klik adalah noRMText
        if (ae.getSource() == noRMText) {
            //mencari object pasien berdasarakan noRM
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            //perbandingan apabila object cari sama dengan null
            if (cari == null) {
                // menampilkan text pada jendela dialog
                JOptionPane.showMessageDialog(null, "Data Pasien " + noRMText.getText() + " Tidak Ada");
            } else {
                //mengset namatext dengan data dari variabel nama dari object cari
                namaText.setText(cari.getNama());
                //mengset alamattext dengan data dari variabel alamat dari object cari
                alamatText.setText(cari.getAlamat());
            }
        }
        // perbandingan apabila yang di klik adalah antriButton
        if (ae.getSource() == antriButton) {
            //mencari object pasien berdasarakan noRM
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            //perulangan sebanyak indeks pada daftarpasien
            for (int i = 0; i < Pasien.daftarPasien.size(); i++) {
                //perbandingan apabila object cari sama dengan object dari daftar pasie indeks ke i
                if (cari == Pasien.daftarPasien.get(i)) {
                    // menampilkan text pada jendela dialog
                    JOptionPane.showMessageDialog(null, "Nomor Antrian Anda : " + (i + 1));
                    //method agar jdialog langsung keluar 
                    this.dispose();
                }
            }
        }
    }
}
