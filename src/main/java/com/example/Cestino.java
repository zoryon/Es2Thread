package com.example;

public class Cestino {
    private int contatore;

    public Cestino(int contatore) {
        this.contatore = contatore;
    }

    public int getContatore() {
        return contatore;
    }

    public synchronized void addMonete() {
        contatore++;
    }
}
