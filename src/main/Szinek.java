package main;

public enum Szinek {
    PIROS("\u001B[31m"),
    KEK("\u001B[34m"),
    ZOLD("\u001B[32m"),
    SARGA("\u001B[33m");

    private final String ansiKod;

    Szinek(String ansiKod) {
        this.ansiKod = ansiKod;
    }

    public String getAnsiKod() {
        return ansiKod;
    }
}
