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
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem fileMenuItem;

    public MainFrame() {
        init();
    }

    public void init() {

        menuBar = new JMenuBar();

        this.setTitle("Main Frame");
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("Exit");
        fileMenuItem = new JMenuItem("File");
        fileMenu.add(exitMenuItem);
        fileMenu.add(fileMenuItem);
        menuBar.add(fileMenu);

        this.setJMenuBar(menuBar);

        fileMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (ae.getSource() == fileMenuItem) {
            DaftarAntrianDialog test = new DaftarAntrianDialog("ANTRIAN PASIEN");
            test.setSize(600, 500);
            test.setVisible(true);
        }
    }
}
