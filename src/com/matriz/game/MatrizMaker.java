package com.matriz.game;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

/**
 * Make a GridLayout
 */
public class MatrizMaker extends GridLayout {
    private final JFrame jFrame;
    private int row;
    private int cols;

    public MatrizMaker(final JFrame jFrame, final int row, final int cols) {
        super(row, cols);
        this.row = row;
        this.cols = cols;
        this.jFrame = jFrame;

        this.matriz();
    }

    private void matriz() {
        fillMatriz();
    }

    private void fillMatriz() {
        int count = 1;
        for(int filas=0; filas<row; filas++) {
            for(int columnas=0; columnas<cols; columnas++) {
                JPanel panel = centerJLabel(new JLabel(String.valueOf(count++)));
                if(filas % 2 == 0) {
                    //Add background color
                    panel.setBackground(Color.blue);
                }
                this.jFrame.add(panel);
            }
        }
    }

    private JPanel centerJLabel(final JLabel jLabel) {
        final JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        //Para centrar el JLabel dentro del JPanel
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(jLabel, BorderLayout.CENTER);
        return panel;
    }

}
