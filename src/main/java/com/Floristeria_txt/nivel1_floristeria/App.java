package com.Floristeria_txt.nivel1_floristeria;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static boolean cond;

    public static void main(String[] args) {

        Floristeria floristeria = new Floristeria("Majo");

        IArticulo arbol = new Arbol(2.4, 50);
        IArticulo flor = new Flor("rojo", 20);
        IArticulo decoracion = new Decoracion(Material.MADERA, 10);

        floristeria.afegirArticuloStockTienda(arbol);
        floristeria.afegirArticuloStockTienda(flor);
        floristeria.afegirArticuloStockTienda(decoracion);

        floristeria.getStockTienda();
        floristeria.getValorTotal();

        Floristeria floristeria1 = new Floristeria();
        Integer opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU DE OPCIONES\n" +
                        "1.Crear Floristeria\n" +
                        "2.Añadir Arbol\n" +
                        "3.Añadir Flor\n" +
                        "4.Añadir Decoración\n" +
                        "5.Imprimir stock por pantalla\n" +
                        "6.Elinimar Arbol\n" +
                        "7.Eliminar Flor\n" +
                        "8.Eliminar Decoración\n" +
                        "9.Imprimir pantalla stock con cantidades\n" +
                        "10Imprimir por pantalla valor total de la floristeria\n" +
                        "11.Crear tickets de compra con multiples objetos\n" +
                        "12.Mostrar historico de compras\n" +
                        "13Crear archivo txt\n" +
                        "14.Salir"));

            } catch (Exception e) {
                opcion = 0;
                System.out.println("el valor introducido es incorrecto, vuelve a intentarlo");
            }
            switch (opcion) {
                case 1:
                    try {
                        String nombre;
                        Scanner scn = new Scanner(System.in);
                        System.out.println("Introduce el nombre de la floristeria que vas a crear");
                        nombre = scn.next();
                        floristeria1.setNombre(nombre);
                    } catch (Exception e) {
                        System.out.println("el valor introducido es incorrecto, vuelve a introducir una opcion");
                    }
                    break;
                case 2:
                    try {
                        double altura;
                        double pvpArbol;
                        Scanner sc = new Scanner(System.in);
                        System.out.println("introduce arbol en stock");
                        System.out.println("introduce altura arbol");
                        altura = sc.nextDouble();
                        System.out.println("introduce precio");
                        pvpArbol = sc.nextDouble();
                        IArticulo a1 = new Arbol(altura, pvpArbol);
                        floristeria1.afegirArticuloStockTienda(a1);
                    } catch (Exception e) {
                        System.out.println("dato introducido incorrecto, vuelva a intentarlo");
                    }
                    break;
                case 3:
                    try {
                        String color;
                        double precioFlor;
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("introduce una flor en stock");
                        System.out.println("introduce el color de la flor");
                        color = sc1.nextLine();
                        System.out.println("introduce precio");
                        precioFlor = sc1.nextDouble();
                        IArticulo a2 = new Flor(color, precioFlor);
                        floristeria1.afegirArticuloStockTienda(a2);
                    } catch (Exception e) {
                        System.out.println("el valor introducido es incorrecto, vuelve a introducir una opcion");
                    }
                    break;
                case 4:
                    try {
                        Material material=null;
                        Integer mat;
                        boolean cond = true;
                        double precioDecoracion;
                        Scanner sc3 = new Scanner(System.in);
                        while (cond){
                            System.out.println("introduce una decoracion en stock");
                            System.out.println("Selecciona el tipo de material\n" +
                                    " 1. MADERA\n" +
                                    " 2.PLASTICO");
                            mat = sc3.nextInt();
                            switch (mat){
                                case 1:
                                    material = Material.MADERA;
                                    cond = false;
                                    break;
                                case 2:
                                    material = Material.PLASTICO;
                                    cond = false;
                                    break;
                                default:
                                    System.out.println("el valor introducido es incorrecto, vuelve a intentarlo");
                                    break;
                            }
                        }
                        System.out.println("intoduce el precio");
                        precioDecoracion = sc3.nextDouble();
                        IArticulo a3 = new Decoracion(material, precioDecoracion);
                        floristeria1.afegirArticuloStockTienda(a3);
                    } catch (Exception e) {
                        System.out.println("el valor introducido es incorrecto, vuelve a introducir una opcion");
                    }
                    break;
                case 5:
                    floristeria1.getStockTienda();
                    break;
                case 6:
                    floristeria1.EliminarArbol();
                    break;
                case 7:
                    floristeria1.EliminarFlor();
                    break;
                case 8:
                    floristeria1.EliminarDecoracion();
                    break;
                case 9:
                    floristeria1.getStockTiendaConCantidades();
                    break;
                case 10:
                    floristeria1.getValorTotal();
                    break;
                case 11:
                    Ticket t1 = new Ticket();
                    t1=floristeria1.seleccionarArticulos(t1);
                    try{
                        floristeria1.
                                actualizarStockTienda(t1.getListaCompra());
                        t1.mostrarListaCompra();
                    }catch (NullPointerException e){
                        System.out.println("No quedan mas arboles");
                    }
                    break;
                case 12:
                    //historica de ventas
                case 13:
                    //crear archivo txt
                case 14:
                    break;
            }
        } while (opcion != 14);
    }
}

