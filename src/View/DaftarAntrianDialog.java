/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class DaftarAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRMLabel;
    private JLabel alamatLabel;
    private JLabel tanggalalhirLabel;
    private JTextField namaText;
    private JTextField noRMText;
    private JTextField alamatText;
    private JComboBox TanggallahirCombo;
    private JButton saveButton;
    private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel();
        judulLabel.setText("Form Daftar Antrian");
        judulLabel.setFont(new Font(null, Font.BOLD, 16));
        judulLabel.setBounds(50, 20, 250, 30);
        this.add(judulLabel);

        noRMLabel = new JLabel();
        noRMLabel.setText("No. RM");
        noRMLabel.setBounds(50, 70, 80, 20);
        this.add(noRMLabel);

        noRMText = new JTextField();
        noRMText.setBounds(130, 70, 120, 20);
        this.add(noRMText);

        noRMText.addActionListener(this);

        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 100, 80, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(130, 100, 120, 20);
        this.add(namaText);

        namaText.addActionListener(this);
        lakiRadio = new JRadioButton("Laki-laki");
        lakiRadio.setBounds(130, 130, 100, 20);
        this.add(lakiRadio);

        perempuanRadio = new JRadioButton("Perempuan");
        perempuanRadio.setBounds(210, 130, 100, 20);
        this.add(perempuanRadio);

        ButtonGroup KelaminButonGroup = new ButtonGroup();
        KelaminButonGroup.add(lakiRadio);
        KelaminButonGroup.add(perempuanRadio);
        
        tanggalalhirLabel = new JLabel("Tanggal Lahir");
        tanggalalhirLabel.setBounds(50, 150, 80, 20);
        this.add(tanggalalhirLabel);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 180, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(130, 180, 120, 20);
        this.add(alamatText);

        alamatText.addActionListener(this);

        saveButton = new JButton();
        saveButton.setText("Save");
        saveButton.setBounds(130, 200, 80, 30);
        this.add(saveButton);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == noRMText) {
            JOptionPane.showMessageDialog(null, noRMText.getText());
        }
        if (ae.getSource() == namaText) {
            JOptionPane.showMessageDialog(null, namaText.getText());
        }
        if (ae.getSource() == alamatText) {
            JOptionPane.showMessageDialog(null, alamatText.getText());
        }

    }
}
