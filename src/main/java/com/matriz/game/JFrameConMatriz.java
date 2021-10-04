package com.matriz.game;

import lombok.extern.slf4j.Slf4j;

import javax.swing.JFrame;

/**
 * JFrame con Matriz
 */
public class JFrameConMatriz extends JFrame {
    //Esto es el Componente de mayor Orden GridLayout donde le pasamos
    //Este JFrame y el numero de columnas y filas
    private MatrizMaker matrizMaker = new MatrizMaker(this, 10, 10);

    public JFrameConMatriz() {
        super.setTitle("Matriz v1.0");

        super.pack();
        super.setSize(650, 420);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setLayout(this.matrizMaker);
    }

    public static void main(String ...args) {
        new Thread(JFrameConMatriz::new).start();
    }
}
