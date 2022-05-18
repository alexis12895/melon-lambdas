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

        //Con un metodo anonimo, new GacMelonPre...
        List<Melon> gac = Filtrers.filterMelon(melons,  new GacMelonPredicate());
        System.out.println("\nLista filtrada por nombre gac: ");
        for (Melon m: gac) {
            System.out.println(m);
        }

        List<Melon> heavy = Filtrers.filterMelon(melons,  new HeavyMelonPredicate());
        System.out.println("\nLista melones pesados: ");
        for (Melon m: heavy) {
            System.out.println(m);
        }


        //Directamente hemos creado la clase anonima que implementa MelonPredicate y asi podemos implementarla aqui mismo
        /*
        List<Melon> superheavy = Filtrers.filterMelon(melons, new MelonPredicate() {
            @Override
            public boolean test(Melon melon) {
                return melon!=null && melon.getWight() >= 6000;
            }
        });
        System.out.println("\nLista melones super-pesados: ");
        for (Melon m: superheavy) {
            System.out.println(m);
        }
         */

        //lo mismo pero con lamdas
        /*
        List<Melon> superheavy = Filtrers.filterMelon(melons, melon -> melon!=null && melon.getWight() >= 6000);
        System.out.println("\nLista melones super-pesados: ");
        for (Melon m: superheavy) {
            System.out.println(m);
        }
        */

        //Incorporandolo en el mismo for
        System.out.println("Lista melones europeos: ");
        for(Melon m:  Filtrers.filterMelon(melons, melon -> melon!=null && melon.getOrigin().equalsIgnoreCase("Europe"))) {
            System.out.println(m);
        }

        //Con un metodo de filtrado generico y usar las lambdas
        System.out.println("Lista sandias: ");
        List<Melon> watermelons = Filtrers.filter(melons, (Melon m)->m.getType().equalsIgnoreCase("watermelon"));
        for(Melon m: watermelons) {
            System.out.println(m);
        }


    }


}
