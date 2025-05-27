package com.example.checkersapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class PlayController {


    //misc
    public ArrayList<Circle> allCircles = new ArrayList<>();
    public Pane Pain;

    //all grid pieces
public Circle PieceClicked = null;

    public Rectangle a8;
    public Rectangle a7;
    public Rectangle a6;
    public Rectangle a5;
    public Rectangle a4;
    public Rectangle a3;
    public Rectangle a2;
    public Rectangle a1;
    public Rectangle b7;
    public Rectangle b8;
    public Rectangle b5;
    public Rectangle b6;
    public Rectangle b3;
    public Rectangle b4;
    public Rectangle b1;
    public Rectangle b2;
    public Rectangle c8;
    public Rectangle c7;
    public Rectangle c6;
    public Rectangle c5;
    public Rectangle c4;
    public Rectangle c3;
    public Rectangle c2;
    public Rectangle c1;
    public Rectangle d7;
    public Rectangle d8;
    public Rectangle d5;
    public Rectangle d6;
    public Rectangle d3;
    public Rectangle d4;
    public Rectangle d1;
    public Rectangle d2;
    public Rectangle e8;
    public Rectangle e7;
    public Rectangle e6;
    public Rectangle e5;
    public Rectangle e4;
    public Rectangle e3;
    public Rectangle e2;
    public Rectangle e1;
    public Rectangle f7;
    public Rectangle f8;
    public Rectangle f5;
    public Rectangle f6;
    public Rectangle f3;
    public Rectangle f4;
    public Rectangle f1;
    public Rectangle f2;
    public Rectangle g8;
    public Rectangle g7;
    public Rectangle g6;
    public Rectangle g5;
    public Rectangle g4;
    public Rectangle g3;
    public Rectangle g2;
    public Rectangle g1;
    public Rectangle h7;
    public Rectangle h8;
    public Rectangle h5;
    public Rectangle h6;
    public Rectangle h3;
    public Rectangle h4;
    public Rectangle h1;
    public Rectangle h2;

    //all checkers pieces


    //L = Light Blue Pieces

    public Circle l1;
    public Circle l5;
    public Circle l9;
    public Circle l6;
    public Circle l10;
    public Circle l2;
    public Circle l7;
    public Circle l3;
    public Circle l11;
    public Circle l8;
    public Circle l4;
    public Circle l12;
    public Circle z9;
    public Circle z1;
    public Circle z5;
    public Circle z10;
    public Circle z2;
    public Circle z6;
    public Circle z11;
    public Circle z3;
    public Circle z7;
    public Circle z12;
    public Circle z4;
    public Circle z8;

//all labels
public Label Label8;
    public Label Label7;
    public Label Label6;
    public Label Label5;
    public Label Label4;
    public Label Label3;
    public Label Label2;
    public Label Label1;
    public Label Labela;
    public Label Labelb;
    public Label Labelc;
    public Label Labeld;
    public Label Labele;
    public Label Labelf;
    public Label Labelg;
    public Label Labelh;

    public void initialize() {
        Piece piece1 = new Piece(true, l1, false, null);
        Piece piece2 = new Piece(true, l2, false, null);
        Piece piece3 = new Piece(true, l3, false, null);
        Piece piece4 = new Piece(true, l4, false, null);
        Piece piece5 = new Piece(true, l5, false, null);
        Piece piece6 = new Piece(true, l6, false, null);
        Piece piece7 = new Piece(true, l7, false, null);
        Piece piece8 = new Piece(true, l8, false, null);
        Piece piece9 = new Piece(true, l9, false, null);
        Piece piece10 = new Piece(true, l10, false, null);
        Piece piece11 = new Piece(true, l11, false, null);
        Piece piece12 = new Piece(true, l12, false, null);

        Piece piece13 = new Piece(true, z1, false, null);
        Piece piece14 = new Piece(true, z2, false, null);
        Piece piece15 = new Piece(true, z3, false, null);
        Piece piece16 = new Piece(true, z4, false, null);
        Piece piece17 = new Piece(true, z5, false, null);
        Piece piece18 = new Piece(true, z6, false, null);
        Piece piece19 = new Piece(true, z7, false, null);
        Piece piece20 = new Piece(true, z8, false, null);
        Piece piece21 = new Piece(true, z9, false, null);
        Piece piece22 = new Piece(true, z10, false, null);
        Piece piece23 = new Piece(true, z11, false, null);
        Piece piece24 = new Piece(true, z12, false, null);

        BoardLocation location1 = new BoardLocation(a1,false,null);
        BoardLocation location2 = new BoardLocation(a3,false,null);
        BoardLocation location3 = new BoardLocation(a5,false,null);
        BoardLocation location4 = new BoardLocation(a7,false,null);
        BoardLocation location5 = new BoardLocation(b2,false,null);
        BoardLocation location6 = new BoardLocation(b4,false,null);
        BoardLocation location7 = new BoardLocation(b6,false,null);
        BoardLocation location8 = new BoardLocation(b8,false,null);
        BoardLocation location9 = new BoardLocation(c1,false,null);
        BoardLocation location10 = new BoardLocation(c3,false,null);
        BoardLocation location11 = new BoardLocation(c5,false,null);
        BoardLocation location12 = new BoardLocation(c7,false,null);
        BoardLocation location13 = new BoardLocation(d2,false,null);
        BoardLocation location14 = new BoardLocation(d4,false,null);
        BoardLocation location15 = new BoardLocation(d6,false,null);
        BoardLocation location16 = new BoardLocation(d8,false,null);
        BoardLocation location17 = new BoardLocation(e1,false,null);
        BoardLocation location18 = new BoardLocation(e3,false,null);
        BoardLocation location19 = new BoardLocation(e5,false,null);
        BoardLocation location20 = new BoardLocation(e7,false,null);
        BoardLocation location21 = new BoardLocation(f2,false,null);
        BoardLocation location22 = new BoardLocation(f4,false,null);
        BoardLocation location23 = new BoardLocation(f6,false,null);
        BoardLocation location24 = new BoardLocation(f8,false,null);
        BoardLocation location25 = new BoardLocation(g1,false,null);
        BoardLocation location26 = new BoardLocation(g3,false,null);
        BoardLocation location27 = new BoardLocation(g5,false,null);
        BoardLocation location28 = new BoardLocation(g7,false,null);
        BoardLocation location29 = new BoardLocation(h2,false,null);
        BoardLocation location30 = new BoardLocation(h4,false,null);
        BoardLocation location31 = new BoardLocation(h6,false,null);
        BoardLocation location32 = new BoardLocation(h8,false,null);
    }

    public void l1movement() {
//show clicked code
        
        l1.setStrokeWidth(3);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l2movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(3);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l3movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(3);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l4movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(3);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l5movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(3);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l6movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(3);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l7movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(3);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l8movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(3);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l9movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(3);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l10movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(3);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l11movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(3);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void l12movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(3);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z1movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(3);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z2movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(3);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z3movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(3);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z4movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(3);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z5movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(3);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z6movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(3);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z7movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(3);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z8movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(3);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z9movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(3);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z10movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(3);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(1);
    }

    public void z11movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(3);
        z12.setStrokeWidth(1);
    }

    public void z12movement() {
//show clicked code
        l1.setStrokeWidth(1);
        l2.setStrokeWidth(1);
        l3.setStrokeWidth(1);
        l4.setStrokeWidth(1);
        l5.setStrokeWidth(1);
        l6.setStrokeWidth(1);
        l7.setStrokeWidth(1);
        l8.setStrokeWidth(1);
        l9.setStrokeWidth(1);
        l10.setStrokeWidth(1);
        l11.setStrokeWidth(1);
        l12.setStrokeWidth(1);
        z1.setStrokeWidth(1);
        z2.setStrokeWidth(1);
        z3.setStrokeWidth(1);
        z4.setStrokeWidth(1);
        z5.setStrokeWidth(1);
        z6.setStrokeWidth(1);
        z7.setStrokeWidth(1);
        z8.setStrokeWidth(1);
        z9.setStrokeWidth(1);
        z10.setStrokeWidth(1);
        z11.setStrokeWidth(1);
        z12.setStrokeWidth(3);
    }


    public void b8Clicked() {


    }

    public void checkAvailableMove() {

    }


    //array list for piece movement
    //public static void main(String[] args) {
       // ArrayList<String> Movement = new ArrayList<>();

       // Movement.add();


   // }
}


//for security check;
//check if other piece is close enough to jump
// only allow pieces to go up 98 and right or left by 192;
//only allow movement to green pieces
//check if piece being moved is correct color
//display counter to check if pieces are equal to zero

