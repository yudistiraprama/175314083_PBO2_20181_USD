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
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
    private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;
    private JButton saveButton;

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
        namaText.setBounds(110, 90, 120, 20);
        this.add(namaText);
        
        lakiRadio = new JRadioButton("Laki-laki");
        lakiRadio.setBounds(110, 120, 80, 20);
        this.add(lakiRadio);

        perempuanRadio = new JRadioButton("Perempuan");
        perempuanRadio.setBounds(150, 120, 100, 20);
        this.add(perempuanRadio);

        ButtonGroup KelaminButonGroup = new ButtonGroup();
        KelaminButonGroup.add(lakiRadio);
        KelaminButonGroup.add(perempuanRadio);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 150, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(110, 150, 120, 20);
        this.add(alamatText);

        nikLabel = new JLabel();
        nikLabel.setText("NIK");
        nikLabel.setBounds(50, 180, 80, 20);
        this.add(nikLabel);

        nikText = new JTextField();
        nikText.setBounds(110, 180, 120, 20);
        this.add(nikText);

        saveButton = new JButton();
        saveButton.setText("Save");
        saveButton.setBounds(110, 200, 80, 30);
        this.add(saveButton);

        saveButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            baru.setNik(nikText.getText());
            try {
                baru.setNoRekamMedis(nikText.getText());
            } catch (Exception ex) {
                Logger.getLogger(TambahPasienBaruDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
            Pasien.tambahPasienBaru(baru);

            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");

            this.dispose();
        }
    }
}
