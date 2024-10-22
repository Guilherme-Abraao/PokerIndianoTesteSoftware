package org.example;

import java.util.Objects;

public class Carta {
    private String valor;
    private String naipe;

    public Carta(String valor, String naipe) {
        this.valor = valor.toUpperCase().trim();
        this.naipe = formatarNaipe(naipe);
    }

    public String getValor() {
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return valor.equals(carta.valor) && naipe.equals(carta.naipe);
    }

    // Implementando hashCode para garantir que o Set funcione corretamente
    @Override
    public int hashCode() {
        return Objects.hash(valor, naipe);
    }

    public static boolean isPar(Carta carta1, Carta carta2) {
        return carta1.getValor().equals(carta2.getValor());
    }

    public static boolean isMesmoNaipe(Carta carta1, Carta carta2) {
        return carta1.getNaipe().equals(carta2.getNaipe());
    }

    private String formatarNaipe(String naipe) {
        naipe = naipe.trim().toLowerCase(); // Remove espaços e converte para minúsculas
        switch (naipe) {
            case "copa":
                return "Copas";
            case "ouro":
                return "Ouros";
            case "paus": // Já está no plural correto
                return "Paus";
            case "espada":
                return "Espadas";
            default:
                return naipe.substring(0, 1).toUpperCase() + naipe.substring(1).toLowerCase();
        }
    }
}
