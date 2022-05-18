package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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

        List<Melon> bailan = filterByType(melons, "Bailan");


        System.out.println("\nLista filtrada por nombre Bailan: ");
        for (int i = 0; i < bailan.size(); ++i) {
            System.out.println(bailan.get(i).toString());
        }

    }

    private static List<Melon> filterByType(List<Melon> melons, String bailan) {
        List<Melon> x = new ArrayList<>();

        for (int i = 0; i < melons.size(); ++i) {
            if(bailan.equals(melons.get(i).getType()))
            {
                x.add(melons.get(i));
            }
        }
        return x;
    }

}
