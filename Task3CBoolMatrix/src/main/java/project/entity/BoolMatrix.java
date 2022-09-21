package project.entity;

public class BoolMatrix {
    private int n;
    private int m;
    private boolean[][] firstMatrix, secondMatrix;

    public BoolMatrix(int n, int m) {
        this.n = n;
        this.m = m;
        firstMatrix = new boolean[n][m];
        secondMatrix = new boolean[n][m];
    }
}
