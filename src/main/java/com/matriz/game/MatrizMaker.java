package com.matriz.game;

import lombok.extern.slf4j.Slf4j;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

/**
 * Make a GridLayout
 */
@Slf4j
public class MatrizMaker extends JPanel {
    private final int filas;
    private final int columnas;
    private GridLayout gridLayout;

    public MatrizMaker(final int columnas) {
        this.filas = columnas; // mismo numero de las columnas
        this.columnas = columnas;
        this.gridLayout = new GridLayout(filas, columnas);
        //Set de GridLayout to JPanel
        super.setLayout(gridLayout);

        this.fillMatriz();
    }

    private void fillMatriz() {
        int count = 1;
        for(int f=0; f<filas; f++) {
            for(int c=0; c<columnas; c++) {
                final JPanel panel = centerJLabel(new JLabel(String.valueOf(count++)));
                if(f % 2 == 0) {
                    //Add example background color
                    panel.setBackground(Color.blue);
                }
                super.add(panel);
            }
        }
    }

    public static JPanel centerJLabel(final JLabel jLabel) {
        final JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        //Para centrar el JLabel dentro del JPanel
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(jLabel, BorderLayout.CENTER);
        panel.setPreferredSize(new Dimension(45, 60));
        return panel;
    }

}
