package com.example.checkersapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;

import java.awt.event.MouseListener;


public class PlayController {


    //misc

    public Pane Pain;

    //all grid pieces
public String PieceClicked = null;

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

