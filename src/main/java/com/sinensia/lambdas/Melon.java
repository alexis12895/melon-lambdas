package com.sinensia.lambdas;

public class Melon {

    //Con final nos dice que no cambiara luego
    private final String type;
    private final int wight;
    private final String origin;

    public Melon(String type, int wight, String origin) {

        this.type = type;
        this.wight = wight;
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public int getWight() {
        return wight;
    }

    public String getOrigin() {
        return origin;
    }

    //Me devuelve sus propiedades en lugar de los numeros al imprimir la lista de melones
    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", wight=" + wight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
