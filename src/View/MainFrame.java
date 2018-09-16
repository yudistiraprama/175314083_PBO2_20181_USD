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

    /**
     * konstruktor MAinFrame untuk membuat object
     */
    public MainFrame() {
        //konstruktor memanggil method init()
        init();
    }

    /**
     * method yang berisikan tampilan
     */
    public void init() {
        // membuat object menubar yang bertipe JMenuBar
        menuBar = new JMenuBar();

        //mengset title
        this.setTitle("Main Frame");
        //membuat object pasienmenu yang bertipe JMenu
        pasienMenu = new JMenu("Pasien");
        //membuat object tambahpasienmenuitem yang bertipe JMenuitem
        tambahPasienMenuItem = new JMenuItem("Tambah Pasien");
        //membuat object tambahantrianmenuitem yang bertipe JMenuitem
        tambahAntrianMenuItem = new JMenuItem("Tambah Antrian");
        //membuat object exitmenuitem yang bertipe JMenuitem
        exitMenuItem = new JMenuItem("Exit");

        //menubar menambahkan object pasienmenu
        menuBar.add(pasienMenu);
        //pasien menu menambahkan objec tambahpasienbarumenuitem
        pasienMenu.add(tambahPasienMenuItem);
        //pasien menu menambahkan objec tambahantrianmenuitem
        pasienMenu.add(tambahAntrianMenuItem);
        //pasien menu menambahkan objec exitmenuitem
        pasienMenu.add(exitMenuItem);

        //menambahkan menubar ke mainframe
        this.setJMenuBar(menuBar);

        //tambahpasienbarumenuitem memanggil method addActionListener
        tambahPasienMenuItem.addActionListener(this);
        //tamabhantrianmenuitem memanggil method addActionListener
        tambahAntrianMenuItem.addActionListener(this);
        //exitmenuitem memanggil method addActionListener
        exitMenuItem.addActionListener(this);

    }

    /**
     * method abstrak dari ActionListener untuk pengoperasian tiap object
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        // perbandingan apabila yang di klik adalah tambahpasienmenuitem
        if (ae.getSource() == tambahPasienMenuItem) {
            //membuat object test yang bertipe tambahpasienbarudialog
            TambahPasienBaruDialog test = new TambahPasienBaruDialog("FORM TAMBAH PASIEN");
            // mengatur posisi dan ukuran object
            test.setSize(600, 500);
            // mengatur visible dengan true
            test.setVisible(true);
        }
        // perbandingan apabila yang di klik adalah tambahantrianmenuitem
        if (ae.getSource() == tambahAntrianMenuItem) {
            TambahAntrianDialog test1 = new TambahAntrianDialog("FORM TAMBAH ANTRIAN");
            // mengatur posisi dan ukuran object
            test1.setSize(600, 500);
            // mengatur visible dengan true
            test1.setVisible(true);
        }
        // perbandingan apabila yang di klik adalah exitmenuitem
        if (ae.getSource() == exitMenuItem) {
            //sytem akan langsung berhenti/keluar
            System.exit(0);
        }
    }
}
