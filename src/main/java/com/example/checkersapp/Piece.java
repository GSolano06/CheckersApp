package com.example.checkersapp;

import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class Piece {
    boolean player1;
    static ArrayList <Piece> allPieces = new ArrayList<>();
    Circle myCircle;
    boolean king;
    BoardLocation myLocation; //Create location class

    public Piece(boolean player1, Circle myCircle, boolean king, BoardLocation myLocation) {
        this.player1 = player1;
        this.myCircle = myCircle;
        this.king = king;
        this.myLocation = myLocation;
        allPieces.add(this);
    }

    public boolean isPlayer1() {
        return player1;
    }

    public void setPlayer1(boolean player1) {
        this.player1 = player1;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public Circle getMyCircle() {
        return myCircle;
    }

    public void setMyCircle(Circle myCircle) {
        this.myCircle = myCircle;
    }

    public BoardLocation getMyLocation() {
        return myLocation;
    }

    public void setMyLocation(BoardLocation myLocation) {
        this.myLocation = myLocation;
    }
}






