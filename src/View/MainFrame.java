/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author jarkom
 */
public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu pasienMenu;
    private JMenuItem tambahPasienMenuItem;
    private JMenuItem tambahAntrianMenuItem;
    private JMenuItem exitMenuItem;

    public MainFrame() {
        init();
    }

    public void init() {

        menuBar = new JMenuBar();

        this.setTitle("Main Frame");
        pasienMenu = new JMenu("Pasien");
        tambahPasienMenuItem = new JMenuItem("Tambah Pasien");
        tambahAntrianMenuItem = new JMenuItem("Tambah Antrian");
        exitMenuItem = new JMenuItem("Exit");

        menuBar.add(pasienMenu);
        pasienMenu.add(tambahPasienMenuItem);
        pasienMenu.add(tambahAntrianMenuItem);
        pasienMenu.add(exitMenuItem);

        this.setJMenuBar(menuBar);

        tambahPasienMenuItem.addActionListener(this);
        tambahAntrianMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == tambahPasienMenuItem) {
            TambahPasienBaruDialog test = new TambahPasienBaruDialog("FORM TAMBAH PASIEN");
            test.setSize(600, 500);
            test.setVisible(true);
        }
        if (ae.getSource() == tambahAntrianMenuItem) {
            TambahAntrianDialog test1 = new TambahAntrianDialog("FORM TAMBAH ANTRIAN");
            test1.setSize(600, 500);
            test1.setVisible(true);
        }
        if (ae.getSource() == exitMenuItem) {
            System.exit(0);
        }
    }
}
