/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class DaftarPasienBaruDialog extends JDialog {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JButton saveButton;

    public DaftarPasienBaruDialog() {
        init();
    }

    public DaftarPasienBaruDialog(String title) {
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

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 120, 80, 20);
        this.add(alamatLabel);

        namaText = new JTextField();
        namaText.setBounds(110, 90, 120, 20);
        this.add(namaText);

        alamatText = new JTextField();
        alamatText.setBounds(110, 120, 120, 20);
        this.add(alamatText);

        saveButton = new JButton();
        saveButton.setText("Save");
        saveButton.setBounds(110, 180, 80, 30);
        this.add(saveButton);

    }
}
