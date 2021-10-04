package com.matriz.game;

import lombok.extern.slf4j.Slf4j;

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
    private final int filas;
    private final int columnas;

    public MatrizMaker(final JFrame jFrame, final int filas, final int columnas) {
        super(filas, columnas);
        this.filas = filas;
        this.columnas = columnas;
        this.jFrame = jFrame;

        this.matriz();
    }

    private void matriz() {
        fillMatriz();
    }

    private void fillMatriz() {
        int count = 1;
        for(int f=0; f<filas; f++) {
            for(int c=0; c<columnas; c++) {
                JPanel panel = centerJLabel(new JLabel(String.valueOf(count++)));
                if(f % 2 == 0) {
                    //Add example background color
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
