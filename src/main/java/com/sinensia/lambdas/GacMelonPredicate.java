package com.sinensia.lambdas;

public class GacMelonPredicate implements MelonPredicate {
    @Override
    public boolean test(Melon melon) {
        //return melon.getType().equalsIgnoreCase("gac");
        return "gac".equalsIgnoreCase(melon.getType());
    }
}
