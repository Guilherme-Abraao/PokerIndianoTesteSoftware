package org.example;

public class Jogador {
    private Carta carta1;
    private Carta carta2;

    public Jogador(Carta carta1, Carta carta2) {
        this.carta1 = carta1;
        this.carta2 = carta2;
    }

    public Carta getCarta1() {
        return carta1;
    }

    public Carta getCarta2() {
        return carta2;
    }

    public boolean temPar() {
        return Carta.isPar(carta1, carta2);
    }

    public boolean temMesmoNaipe() {
        return Carta.isMesmoNaipe(carta1, carta2);
    }

    public Carta getCartaDeMaiorValor() {
        return valorNumerico(carta1) > valorNumerico(carta2) ? carta1 : carta2;
    }

    public Carta getCartaDeMenorValor() {
        return valorNumerico(carta1) < valorNumerico(carta2) ? carta1 : carta2;
    }

    private int valorNumerico(Carta carta) {
        switch (carta.getValor()) {
            case "A": return 1;
            case "K": return 13;
            case "Q": return 12;
            case "J": return 11;
            default: return Integer.parseInt(carta.getValor());
        }
    }
}
