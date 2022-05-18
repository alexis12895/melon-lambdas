package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 5500, "Europe"),
                new Melon("Bailan", 6000, "China"),
                new Melon("Watermelon", 1200, "Europe"),
                new Melon("Gac", 3400, "US"),
                new Melon("Bailan", 1300, "China")
        );

        System.out.println("Lista completa: ");
        for (int i = 0; i < melons.size(); ++i) {
            System.out.println(melons.get(i).toString());
        }

        List<Melon> bailan = Filtrers.filterByType(melons, "Bailan");
        System.out.println("\nLista filtrada por nombre Bailan: ");
        for (int i = 0; i < bailan.size(); ++i) {
            System.out.println(bailan.get(i).toString());
        }

        List<Melon> found = Filtrers.filterByWeight(melons, 1300);
        System.out.println("\nLista filtrada por peso: ");
        for (Melon m: found) {
            System.out.println(m);
        }

        List<Melon> foundH = Filtrers.filterByWeightH(melons,  5000);
        System.out.println("\nLista filtrada por peso mayor: ");
        for (Melon m: foundH) {
            System.out.println(m);
        }

        /*
        List<Melon> foundMn = Filtrers.filterByWeightMn(melons, 1000);
        System.out.println("\nLista filtrada por peso menor: ");
        for (Melon m: foundMn) {
            System.out.println(m);
        }
         */

    }


}
