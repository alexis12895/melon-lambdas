package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.List;

public final class Filtrers {

    //Evitamos que alguien intente refactorizar la clase, no se podra construir el objeto
    public Filtrers(){
        throw new AssertionError("Utitily class not be instanciaded");
    }
    public static List<Melon> filterByType(List<Melon> melons, String bailan) {
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
