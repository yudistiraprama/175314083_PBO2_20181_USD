/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
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
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRMLabel;
    private JLabel alamatLabel;
    private JLabel tanggalalhirLabel;
    private JTextField namaText;
    private JTextField noRMText;
    private JTextField alamatText;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton tambahButton;
    private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;

    public TambahAntrianDialog() {
        init();
    }

    public TambahAntrianDialog(String title) {
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
        noRMText.setBounds(150, 70, 120, 20);
        this.add(noRMText);

        noRMText.addActionListener(this);

        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 100, 80, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(150, 100, 120, 20);
        this.add(namaText);

        namaText.addActionListener(this);
        lakiRadio = new JRadioButton("Laki-laki");
        lakiRadio.setBounds(150, 130, 80, 20);
        this.add(lakiRadio);

        perempuanRadio = new JRadioButton("Perempuan");
        perempuanRadio.setBounds(230, 130, 100, 20);
        this.add(perempuanRadio);

        ButtonGroup KelaminButonGroup = new ButtonGroup();
        KelaminButonGroup.add(lakiRadio);
        KelaminButonGroup.add(perempuanRadio);

        tanggalalhirLabel = new JLabel("Tanggal Lahir");
        tanggalalhirLabel.setBounds(50, 150, 80, 20);
        this.add(tanggalalhirLabel);

        tanggalCombo = new JComboBox();
        tanggalCombo.setBounds(150, 160, 80, 20);
        tanggalCombo.setEnabled(true);
        tanggalCombo.addItem(makeObj("1"));
        tanggalCombo.addItem(makeObj("2"));
        tanggalCombo.addItem(makeObj("3"));
        tanggalCombo.addItem(makeObj("4"));
        tanggalCombo.addItem(makeObj("5"));
        tanggalCombo.addItem(makeObj("6"));
        tanggalCombo.addItem(makeObj("7"));
        tanggalCombo.addItem(makeObj("8"));
        tanggalCombo.addItem(makeObj("9"));
        tanggalCombo.addItem(makeObj("10"));
        tanggalCombo.addItem(makeObj("11"));
        tanggalCombo.addItem(makeObj("12"));
        tanggalCombo.addItem(makeObj("13"));
        tanggalCombo.addItem(makeObj("14"));
        tanggalCombo.addItem(makeObj("15"));
        tanggalCombo.addItem(makeObj("16"));
        tanggalCombo.addItem(makeObj("17"));
        tanggalCombo.addItem(makeObj("18"));
        tanggalCombo.addItem(makeObj("19"));
        tanggalCombo.addItem(makeObj("20"));
        tanggalCombo.addItem(makeObj("21"));
        tanggalCombo.addItem(makeObj("22"));
        tanggalCombo.addItem(makeObj("23"));
        tanggalCombo.addItem(makeObj("24"));
        tanggalCombo.addItem(makeObj("25"));
        tanggalCombo.addItem(makeObj("26"));
        tanggalCombo.addItem(makeObj("27"));
        tanggalCombo.addItem(makeObj("28"));
        tanggalCombo.addItem(makeObj("29"));
        tanggalCombo.addItem(makeObj("30"));
        tanggalCombo.addItem(makeObj("31"));

        this.add(tanggalCombo);

        bulanCombo = new JComboBox();
        bulanCombo.setBounds(250, 160, 80, 20);
        bulanCombo.addItem(makeObj("1"));
        bulanCombo.addItem(makeObj("2"));
        bulanCombo.addItem(makeObj("3"));
        bulanCombo.addItem(makeObj("4"));
        bulanCombo.addItem(makeObj("5"));
        bulanCombo.addItem(makeObj("6"));
        bulanCombo.addItem(makeObj("7"));
        bulanCombo.addItem(makeObj("8"));
        bulanCombo.addItem(makeObj("9"));
        bulanCombo.addItem(makeObj("10"));
        bulanCombo.addItem(makeObj("11"));
        bulanCombo.addItem(makeObj("12"));
        this.add(bulanCombo);

        tahunCombo = new JComboBox();
        tahunCombo.setBounds(350, 160, 80, 20);
        this.add(tahunCombo);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 190, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(150, 190, 120, 20);
        this.add(alamatText);

        alamatText.addActionListener(this);

        tambahButton = new JButton();
        tambahButton.setText("Tambah");
        tambahButton.setBounds(150, 220, 80, 30);
        this.add(tambahButton);
        
        tambahButton.addActionListener(this);

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
        }if (ae.getSource() == tambahButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            
            Pasien.tambahPasienBaru(baru);
            
            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");
        }
    }

    private Object makeObj(final String item) {
        return new Object() {
            public String toString() {
                return item;
            }
        };
    }

}
