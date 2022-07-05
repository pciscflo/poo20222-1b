package com.upc.fiesta;

public class Factoria {
    public static  Evento obtenerEvento(String tipo, String ...varArg){
        switch (tipo){
            case "INF" :
                return new EventoInfantil(Integer.parseInt(varArg[0]), Boolean.parseBoolean(varArg[1]),
                        varArg[2], Boolean.parseBoolean(varArg[3]));
            case "CUM":
                return new EventoCumpleaños(Integer.parseInt(varArg[0]), Boolean.parseBoolean(varArg[1]),
                        Boolean.parseBoolean(varArg[2]), Boolean.parseBoolean(varArg[3]));

            case "INT":
                return new EventoIntegracion(Integer.parseInt(varArg[0]),  Boolean.parseBoolean(varArg[1]),
                        varArg[2]);

        }
        return null;
    }
}
