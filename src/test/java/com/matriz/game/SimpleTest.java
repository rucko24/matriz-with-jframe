package com.matriz.game;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.JFrame;

import java.awt.LayoutManager;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 */
@DisplayName("Basic test")
class SimpleTest {

    @Test
    void showHi() {
        JFrameConMatriz conMatriz = new JFrameConMatriz();

        LayoutManager layout = conMatriz.getLayout();

        assertThat(layout.getClass().getName()).isEqualTo("java.awt.BorderLayout");
    }

}
