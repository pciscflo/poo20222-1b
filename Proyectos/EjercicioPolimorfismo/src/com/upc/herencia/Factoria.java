package com.upc.herencia;

public class Factoria {

    public static Concursante obtenerObjeto(String tipo, String ... varArgs){ // obtenerObjeto("A", "88888888", 12,..
        Concursante concursante = null;
        switch(tipo){
            case "A":
                concursante = new Amateur(varArgs[0], varArgs[1], varArgs[2], Integer.parseInt(varArgs[3]),
                        Integer.parseInt(varArgs[4]),Integer.parseInt(varArgs[5]));
                break;
            case "P":
                concursante = new Profesional(varArgs[0], varArgs[1], varArgs[2], Integer.parseInt(varArgs[3]),
                        Integer.parseInt(varArgs[4]),Integer.parseInt(varArgs[5]), varArgs[6],
                        Boolean.parseBoolean(varArgs[7]));
                break;
            case "D":
                concursante = new DueñoRestaurant(varArgs[0],varArgs[1],varArgs[2],Integer.parseInt(varArgs[3]),
                        Integer.parseInt(varArgs[4]),Integer.parseInt(varArgs[5]));

        }
        return concursante;
    }
}
