/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chesspieces;

import java.awt.Image;
import java.io.IOException;

/**
 *
 * @author mauri
 */
public class Bishop extends Piece {

    public Bishop() throws IOException {
        super.setPieceName("Alfil");
    }

    @Override
    public Image FiguraFBlanc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image FiguraFNegre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
