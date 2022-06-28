package com.upc.herencia;

public class Pantalla {
    public static void main(String[] args) {
        Amateur amateur1 = new Amateur("88888888","Pepe","Carapulcra",89,
                80,90);
        DueñoRestaurant dueñoRestaurant1 = new DueñoRestaurant("99999999","Carlos","Ceviche",
                90,90,90);
        Profesional profesional1 = new Profesional("77777777","Ana","Frijoles",98,
                99,80,"SISE",true);
        Feria feria = new Feria();
        feria.registrar(amateur1);
        feria.registrar(dueñoRestaurant1);
        feria.registrar(profesional1);
        for(Concursante concursante:feria.getArregloConcursantes()){
            System.out.println(concursante.toString()+ "Puntaje Final:" + concursante.calcularPuntajeFinal());
        }

    }

}
