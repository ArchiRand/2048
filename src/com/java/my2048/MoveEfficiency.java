package com.java.my2048;

public class MoveEfficiency implements Move, Comparable<MoveEfficiency> {
    private int numberOfEmptyTiles, score;
    private Move move;

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    @Override
    public void move() {

    }

    @Override
    public int compareTo(MoveEfficiency o) {
        if (this == o)
            return 0;
        int result = this.numberOfEmptyTiles - o.numberOfEmptyTiles;
        if (result == 0) {
            result = this.score - o.score;
        }
        return result < 0 ? -1 : (result == 0) ? 0 : 1;
    }

    public Move getMove() {
        return move;
    }
}
