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

    public static List<Melon> filterByWeight(List<Melon> melons, int peso) {
        if(melons == null){
            throw new IllegalArgumentException("Melons/peso cannot be null");
        }

        if(melons.isEmpty() || peso  <= 0){
            return melons;
        }

        List<Melon> result = new ArrayList<>();
        for (Melon melon: melons) {
            if(melon!=null && peso == melon.getWight())
            {
                result.add(melon);
            }
        }
        return result;
    }

    public static List<Melon> filterByWeightH(List<Melon> melons, int peso) {
        if(melons == null){
            throw new IllegalArgumentException("Melons/peso cannot be null");
        }

        if(melons.isEmpty() || peso  <= 0){
            return melons;
        }

        List<Melon> result = new ArrayList<>();
        for (Melon melon: melons) {
            if(melon!=null && peso < melon.getWight())
            {
                result.add(melon);
            }
        }
        return result;
    }

    /*
    public static List<Melon> filterByWeightMn(List<Melon> melons, int peso) {
        if(melons == null || peso  < 1){
            throw new IllegalArgumentException("Melons/peso cannot be null");
        }

        if(melons.isEmpty()){
            return melons;
        }

        List<Melon> result = new ArrayList<>();
        for (Melon melon: melons) {
            if(melon!=null && peso < melon.getWight())
            {
                result.add(melon);
            }
        }
        return result;
    }
    */

    public static List<Melon> filterMelon(List<Melon> melons, MelonPredicate predicate){
        if(melons==null){
            throw new IllegalArgumentException("Melons/peso cannot be null");
        }

        List<Melon> result = new ArrayList<>();
        for (Melon melon: melons){
            if(melon!=null && predicate.test(melon)){
                result.add(melon);
            }
        }
        return result;
    }


}
