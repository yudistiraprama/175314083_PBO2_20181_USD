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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel nikLabel;
    private JLabel tanggallahirLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
    private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;
    private JLabel tanggalLabel;
    private JLabel bulanLabel;
    private JLabel tahunLabel;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton tambahButton;
    private int tanggal[] = {1,2,3,4,5,6,7,8,9,10};
    private String tanggalArray[] = {"Hari", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    private String bulanArray[] = {"Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12"};
    private String tahunArray[] = {"Tahun", "1970", "1971", "1972", "1973", "1974", "1975",
        "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
        "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002"};

    /**
     * konstruktor TambahPasienBariDialog untuk membuat object
     */
    public TambahPasienBaruDialog() {
        //konstruktor memanggil method init()
        init();
    }

    /**
     * konstruktor TambahPasienBariDialog untuk membuat object dengan parameter
     * lokal title yang bertipe string
     */
    public TambahPasienBaruDialog(String title) {
        //mengset title dengan data dari variabel title
        this.setTitle(title);
        //konstruktor memanggil method init()
        init();
    }

    /**
     * method yang berisikan tampilan
     */
    public void init() {
        //mengset layout dengan null
        this.setLayout(null);

        // membuat object judul label yang bertipe JLabel
        judulLabel = new JLabel();
        // mengset text untuk objek judulLabel
        judulLabel.setText("FORM DAFTAR PASIEN BARU");
        // mengatur font untuk judulLabel
        judulLabel.setFont(new Font(null, Font.CENTER_BASELINE, 16));
        // mengatur posisi dan ukuran object
        judulLabel.setBounds(50, 20, 250, 50);
        //menambah judul label ke TambahPasienBaruDialog
        this.add(judulLabel);

        // membuat object namalabel yang bertipe JLabel
        namaLabel = new JLabel();
        // mengset text untuk objek namaLabel
        namaLabel.setText("Nama");
        // mengatur posisi dan ukuran object
        namaLabel.setBounds(50, 90, 80, 20);
        //menambah namalabel ke TambahPasienBaruDialog
        this.add(namaLabel);

        //membuat objek namatext yang bertipe JTextField
        namaText = new JTextField();
        // mengatur posisi dan ukuran object
        namaText.setBounds(150, 90, 120, 20);
        //menambah namatext ke TambahPasienBaruDialog
        this.add(namaText);

        //membuat objek lakiradio yang bertipe JRadioButton
        lakiRadio = new JRadioButton("Laki-laki");
        // mengatur posisi dan ukuran object
        lakiRadio.setBounds(150, 120, 80, 20);
        //menambah lakiradio ke TambahPasienBaruDialog
        this.add(lakiRadio);

        //membuat objek perempuanradio yang bertipe JRadioButton
        perempuanRadio = new JRadioButton("Perempuan");
        // mengatur posisi dan ukuran object
        perempuanRadio.setBounds(240, 120, 100, 20);
        //menambah perempuanradio ke TambahPasienBaruDialog
        this.add(perempuanRadio);

        //membuat objek kelaminradiogroup yang bertipe ButtonGroup
        ButtonGroup KelaminButonGroup = new ButtonGroup();
        //menambahkan lakiradio ke kelaminbuttongroup
        KelaminButonGroup.add(lakiRadio);
        //menambahkan perempuanradio ke kelaminbuttongroup
        KelaminButonGroup.add(perempuanRadio);

        // membuat object tanggallahirlabel yang bertipe JLabel
        tanggallahirLabel = new JLabel("Tanggal Lahir");
        // mengatur posisi dan ukuran object
        tanggallahirLabel.setBounds(50, 180, 80, 20);
        //menambah tanggallahirlabel ke TambahPasienBaruDialog
        this.add(tanggallahirLabel);

        // membuat object tanggallabel yang bertipe JLabel
        tanggalLabel = new JLabel("Tanggal");
        // mengatur posisi dan ukuran object
        tanggalLabel.setBounds(150, 150, 80, 20);
        //menambah tanggallabel ke TambahPasienBaruDialog
        this.add(tanggalLabel);

        tanggalCombo = new JComboBox(tanggalArray);
        // mengatur posisi dan ukuran object
        tanggalCombo.setBounds(150, 180, 80, 20);
        //menambah tanggalcombo ke TambahPasienBaruDialog
        this.add(tanggalCombo);

        // membuat object bulanlabel yang bertipe JLabel
        bulanLabel = new JLabel("Bulan");
        // mengatur posisi dan ukuran object
        bulanLabel.setBounds(250, 150, 80, 20);
        //menambah bulanlabel ke TambahPasienBaruDialog
        this.add(bulanLabel);

        bulanCombo = new JComboBox(bulanArray);
        // mengatur posisi dan ukuran object
        bulanCombo.setBounds(250, 180, 80, 20);
        //menambah bulancombo ke TambahPasienBaruDialog
        this.add(bulanCombo);

        // membuat object tahunlabel yang bertipe JLabel
        tahunLabel = new JLabel("Tahun");
        // mengatur posisi dan ukuran object
        tahunLabel.setBounds(350, 150, 80, 20);
        //menambah tahunlabel ke TambahPasienBaruDialog
        this.add(tahunLabel);

        tahunCombo = new JComboBox(tahunArray);
        // mengatur posisi dan ukuran object
        tahunCombo.setBounds(350, 180, 80, 20);
        //menambah tahuncombo ke TambahPasienBaruDialog
        this.add(tahunCombo);

        // membuat object alamatlabel yang bertipe JLabel
        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        // mengatur posisi dan ukuran object
        alamatLabel.setBounds(50, 210, 80, 20);
        //menambah alamatlabel ke TambahPasienBaruDialog
        this.add(alamatLabel);

        //membuat objek alamattext yang bertipe JTextField
        alamatText = new JTextField();
        // mengatur posisi dan ukuran object
        alamatText.setBounds(150, 210, 120, 20);
        //menambah alamattext ke TambahPasienBaruDialog
        this.add(alamatText);

        // membuat object niklabel yang bertipe JLabel
        nikLabel = new JLabel();
        //mengset text untuk niklabel
        nikLabel.setText("NIK");
        // mengatur posisi dan ukuran object
        nikLabel.setBounds(50, 250, 80, 20);
        //menambah niklabel ke TambahPasienBaruDialog
        this.add(nikLabel);

        //membuat objek niktext yang bertipe JTextField
        nikText = new JTextField();
        // mengatur posisi dan ukuran object
        nikText.setBounds(150, 250, 120, 20);
        //menambah niktext ke TambahPasienBaruDialog
        this.add(nikText);

        //membuat object tambahbtton yang bertipe JButton
        tambahButton = new JButton();
        //mengset text untuk tambahbutton
        tambahButton.setText("Tambah");
        // mengatur posisi dan ukuran object
        tambahButton.setBounds(150, 280, 80, 30);
        //menambah tambahbutton ke TambahPasienBaruDialog
        this.add(tambahButton);

        //tambahbutton memanggil method addActionListener
        tambahButton.addActionListener(this);

    }

    /**
     * method abstrak dari ActionListener untuk pengoperasian tiap object
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // perbandingan apabila yang di klik adalah tambahButton
        if (e.getSource() == tambahButton) {
            //membuat object baru yang bertipe pasien
            Pasien baru = new Pasien();
            //mengset variabel nama untuk object baru
            baru.setNama(namaText.getText());
            //mengset variabel alamat untuk object baru
            baru.setAlamat(alamatText.getText());
            //mengset variabel nik untuk object baru
            baru.setNoRekamMedis(nikText.getText());
            //menambahkan object baru ke daftarpasien melalui method tambahpasienbaru
            int tanggal = Integer.valueOf(tanggalCombo.getSelectedItem().toString());
            int bulan = Integer.valueOf(bulanCombo.getSelectedObjects().toString());
            int tahun = Integer.valueOf(tahunCombo.getSelectedObjects().toString());
            try {
                baru.setTahunLahir(tanggal);
                baru.setBulanLahir(bulan);
                baru.setTahunLahir(tahun);
            } catch (Exception ex) {
                Logger.getLogger(TambahPasienBaruDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
            Pasien.tambahPasienBaru(baru);
            //menampilkan pesan 
            JOptionPane.showMessageDialog(null, "Data Anda Telah Ditambahkan");
            //method agar jdialog langsung keluar  
            this.dispose();
        }
    }
}
