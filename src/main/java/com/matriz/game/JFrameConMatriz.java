package com.matriz.game;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.BorderLayout;

/**
 * JFrame con Matriz
 */
public class JFrameConMatriz extends JFrame {
    //Esto es el Componente de mayor Orden GridLayout donde le pasamos
    //Este JFrame y el numero de columnas y filas
    private MatrizMaker matrizMaker = new MatrizMaker( 10);
    private final ControlHorizontalJPanel control = new ControlHorizontalJPanel();

    public JFrameConMatriz() {
        super.setTitle("Matriz v1.0");

        super.pack();
        super.setSize(750, 750);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);

        //Add components
        super.add(this.matrizMaker, BorderLayout.NORTH);
        super.add(new JSeparator(), BorderLayout.CENTER);
        super.add(control, BorderLayout.SOUTH);
    }

    public static void main(String ...args) {
        new Thread(JFrameConMatriz::new).start();
    }
}
