package com.example.checkersapp;

import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class BoardLocation {
    Rectangle boardTile;
    Boolean allowedMove;
    Piece myPiece;
    static ArrayList<BoardLocation> allBoardLocations = new ArrayList<>();

    public BoardLocation(Rectangle boardTile, Boolean allowedMove, Piece myPiece) {
        this.boardTile = boardTile;
        this.allowedMove = allowedMove;
        this.myPiece = myPiece;
        allBoardLocations.add(this);
    }

    public Rectangle getBoardTile() {
        return boardTile;
    }

    public void setBoardTile(Rectangle boardTile) {
        this.boardTile = boardTile;
    }

    public Boolean getAllowedMove() {
        return allowedMove;
    }

    public void setAllowedMove(Boolean allowedMove) {
        this.allowedMove = allowedMove;
    }

    public Piece getMyPiece() {
        return myPiece;
    }

    public void setMyPiece(Piece myPiece) {
        this.myPiece = myPiece;
    }
}
