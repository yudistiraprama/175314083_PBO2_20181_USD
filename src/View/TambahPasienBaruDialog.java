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
    private JLabel tanggalalhirLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
    private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton tambahButton;

    public TambahPasienBaruDialog() {
        init();
    }

    public TambahPasienBaruDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel();
        judulLabel.setText("Form Daftar Pasien Baru");
        judulLabel.setFont(new Font(null, Font.CENTER_BASELINE, 16));
        judulLabel.setBounds(50, 20, 250, 50);
        this.add(judulLabel);

        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 90, 80, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(130, 90, 120, 20);
        this.add(namaText);

        lakiRadio = new JRadioButton("Laki-laki");
        lakiRadio.setBounds(130, 120, 80, 20);
        this.add(lakiRadio);

        perempuanRadio = new JRadioButton("Perempuan");
        perempuanRadio.setBounds(220, 120, 100, 20);
        this.add(perempuanRadio);

        ButtonGroup KelaminButonGroup = new ButtonGroup();
        KelaminButonGroup.add(lakiRadio);
        KelaminButonGroup.add(perempuanRadio);

        tanggalalhirLabel = new JLabel("Tgl Lahir");
        tanggalalhirLabel.setBounds(50, 150, 80, 20);
        this.add(tanggalalhirLabel);

        tanggalCombo = new JComboBox();
        tanggalCombo.setBounds(130, 150, 80, 20);
        this.add(tanggalCombo);

        bulanCombo = new JComboBox();
        bulanCombo.setBounds(230, 150, 80, 20);

        this.add(bulanCombo);

        tahunCombo = new JComboBox();
        tahunCombo.setBounds(330, 150, 80, 20);
        this.add(tahunCombo);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 180, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(130, 180, 120, 20);
        this.add(alamatText);

        nikLabel = new JLabel();
        nikLabel.setText("NIK");
        nikLabel.setBounds(50, 210, 80, 20);
        this.add(nikLabel);

        nikText = new JTextField();
        nikText.setBounds(130, 210, 120, 20);
        this.add(nikText);

        tambahButton = new JButton();
        tambahButton.setText("Tambah");
        tambahButton.setBounds(130, 240, 80, 30);
        this.add(tambahButton);

        tambahButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            baru.setNoRekamMedis(nikText.getText());

            Pasien.tambahPasienBaru(baru);

            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");

            this.dispose();
        }
    }
}
