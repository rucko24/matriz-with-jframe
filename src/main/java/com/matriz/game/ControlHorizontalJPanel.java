package com.matriz.game;


import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Control horizontal JPanel in the footer of JFrame
 */
public class ControlHorizontalJPanel extends JPanel {

    private JButton jButton = new JButton("Click me!");
    private JButton jButton2 = new JButton("Click me two!");

    public ControlHorizontalJPanel() {

        super.add(this.jButton);
        super.add(this.jButton2);

    }

}