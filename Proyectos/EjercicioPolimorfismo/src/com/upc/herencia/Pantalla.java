package com.upc.herencia;

public class Pantalla {
    public static void main(String[] args) {
        Concursante concursante1 = Factoria.obtenerObjeto("A","88888888","Pepe","Carapulcra","89",
                "80","90");
        Concursante concursante2 = Factoria.obtenerObjeto("D", "99999999","Carlos","Ceviche",
                "90","90","90");
        Concursante concursante3 = Factoria.obtenerObjeto("P","77777777","Ana","Frijoles","98",
               "99","80","SISE","true");
        Feria feria = Feria.obtenerInstancia();
        feria.registrar(concursante1);
        feria.registrar(concursante2);
        feria.registrar(concursante3);
        for(Concursante concursante:feria.getArregloConcursantes()){
            System.out.println(concursante.toString()+ "Puntaje Final:" + concursante.calcularPuntajeFinal());
        }

    }

}
