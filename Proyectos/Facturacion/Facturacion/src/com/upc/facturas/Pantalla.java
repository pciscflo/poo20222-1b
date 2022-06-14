package com.upc.facturas;

public class Pantalla {
    public static void main(String[] args) {
        Item item1 = new Item(2,"111","Perno 1/4",1.5);
        Item item2 = new Item(1,"222","Lija 3",2.5);
        Factura factura = new Factura("4512369854","10/02/2022","001-8975","Lima");
        factura.registrar(item1);
        factura.registrar(item2);
        System.out.println(factura.toString());
        for(Item item:factura.getArregloItems()){
            System.out.println(item.getProducto().getCodigo()+ "  " + item.getProducto().getPrecio() + "  " +
                    item.getCantidad());
        }
        System.out.println("---------------");
        System.out.printf("%.2f\n",factura.calcularIGV());
        System.out.println(factura.calcularTotal());



    }
}
