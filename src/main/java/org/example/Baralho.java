package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};

        for (String valor : valores) {
            for (String naipe : naipes) {
                cartas.add(new Carta(valor, naipe));
            }
        }
    }

    public void removerCarta(Carta carta) {
        cartas.removeIf(c -> c.getValor().equals(carta.getValor()) && c.getNaipe().equals(carta.getNaipe()));
    }

    public Carta gerarCartaAleatoria() {
        Random random = new Random();
        return cartas.remove(random.nextInt(cartas.size()));
    }
}
