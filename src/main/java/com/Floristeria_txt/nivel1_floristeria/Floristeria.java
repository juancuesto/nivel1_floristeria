package com.Floristeria_txt.nivel1_floristeria;

import javax.swing.*;
import java.util.*;

public class Floristeria {

    private String nombre;
    private List<IArticulo> stockTienda;
    private double valorTotal;
    private List<Ticket> historicoVentas;

    public Floristeria() {
        stockTienda=new ArrayList<>();
        historicoVentas=new ArrayList<>();
    }

    public Floristeria(String nombre) {
        this.nombre = nombre;
        stockTienda=new ArrayList<>();
        historicoVentas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getStockTiendaConCantidades() {
        int cantidadArboles=0;
        double valorArboles=0;
        int cantidadFlores=0;
        double valorFlores=0;
        int cantidadDecoraciones=0;
        double valorDecoraciones=0;
        for (IArticulo ele:stockTienda) {
         if(ele instanceof Arbol){
             cantidadArboles++;
             valorArboles=valorArboles+ele.getPrecio();
         } else if (ele instanceof Flor) {
             cantidadFlores++;
             valorFlores=valorFlores+ ele.getPrecio();
         } else if (ele instanceof Decoracion) {
             cantidadDecoraciones++;
             valorDecoraciones=valorDecoraciones+ ele.getPrecio();
         }
        }
        System.out.println("********** STOCK EN TIENDA *********************");
        System.out.println("              CANTIDAD         VALOR");
        System.out.println("arboles:          "+cantidadArboles+"             "+valorArboles);
        System.out.println("Flores:           "+cantidadFlores+"             "+valorFlores);
        System.out.println("Decoraciones:     "+cantidadDecoraciones+"             "+valorDecoraciones);
    }

    public void getStockTienda() {
        int cantidadArboles=0;
        double valorArboles=0;
        int cantidadFlores=0;
        double valorFlores=0;
        int cantidadDecoraciones=0;
        double valorDecoraciones=0;
        for (IArticulo ele:stockTienda) {
            if(ele instanceof Arbol){
                cantidadArboles++;
                valorArboles=valorArboles+ele.getPrecio();
            } else if (ele instanceof Flor) {
                cantidadFlores++;
                valorFlores=valorFlores+ ele.getPrecio();
            } else if (ele instanceof Decoracion) {
                cantidadDecoraciones++;
                valorDecoraciones=valorDecoraciones+ ele.getPrecio();
            }
        }
        System.out.println("********** STOCK EN TIENDA *********************");
        System.out.println("              CANTIDAD");
        System.out.println("arboles:          "+cantidadArboles);
        System.out.println("Flores:           "+cantidadFlores);
        System.out.println("Decoraciones:     "+cantidadDecoraciones);
    }

    public void afegirArticuloStockTienda(IArticulo articulo) {
        this.stockTienda.add(articulo);
    }

    public void getValorTotal() {
        for (IArticulo ele:stockTienda) {
            valorTotal=valorTotal+ele.getPrecio();
        }
        System.out.println("El volor total de la tienda es de: "+valorTotal+" Euros");
    }

    public void EliminarArbol(){
        ListIterator<IArticulo> it1=stockTienda.listIterator();
        int contador=0;
        boolean c=true;
        while (it1.hasNext()&&c){
            if(it1.next() instanceof Arbol){
                contador++;
                it1.remove();
                System.out.println("Arbol eliminado correctamente");
                c=false;
            }
        }
        if(contador==0){
            System.out.println("No hay ningun arbol que eliminar");
        }
    }
    public void EliminarFlor(){
        ListIterator<IArticulo> it1=stockTienda.listIterator();
        int contador=0;
        boolean c=true;
        while (it1.hasNext()&&c){
            if(it1.next() instanceof Flor){
                contador++;
                it1.remove();
                c=false;
            }
        }
        if(contador==0){
            System.out.println("No hay ninguna flor que eliminar");
        }
    }
    public void EliminarDecoracion(){
        ListIterator<IArticulo> it1=stockTienda.listIterator();
        int contador=0;
        boolean c=true;
        while (it1.hasNext()&&c){
            if(it1.next() instanceof Decoracion){
                contador++;
                it1.remove();
                c=false;
            }
        }
        if(contador==0){
            System.out.println("No hay ninguna Decoracion que eliminar");
        }
    }
    public Ticket seleccionarArticulos(Ticket ticket){
        int cantidad;
        System.out.println("Introduce cuantos articulos vas a seleccionar");
        Scanner sc4 = new Scanner(System.in);
        cantidad = sc4.nextInt();
        for(int i=0;i<cantidad;i++){
            int opcion;
            List<IArticulo> copiaStockTienda=new ArrayList<>(stockTienda);
            ListIterator<IArticulo>it= copiaStockTienda.listIterator();
            Scanner sc=new Scanner(System.in);
            System.out.println("Elige el articulo a seleccionar\n" +
                    "1.Arbol\n" +
                    "2.Flor\n" +
                    "3.Decoracion");
            opcion=sc.nextInt();
            if(opcion==1){
                while (it.hasNext()){
                    IArticulo aux= it.next();
                    if(aux instanceof Arbol){
                        it.remove();
                        ticket.afegirArticulo(aux);
                        System.out.println("Articulo seleccionado correctamente"+aux);
                    }else {
                        System.out.println("No se ha podido seleccionar el articulo");
                    }

                }
            }
        }
       return ticket;
    }

   public void actualizarStockTienda(List<IArticulo> listaTicket){
       // List<IArticulo> copiaStockTienda=new ArrayList<IArticulo>(stockTienda);
        ListIterator<IArticulo> it1= stockTienda.listIterator();
        ListIterator<IArticulo> it2=listaTicket.listIterator();
        while(it2.hasNext()){
            IArticulo aux1=it1.next();
            IArticulo aux2= it2.next();
            if(aux1.getClass()==aux2.getClass()){
                System.out.println(aux1.getClass());
                it1.remove();
            }
        }
   }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public List<Ticket> getHistoricoVentas() {
        return historicoVentas;
    }
    public void afegirTicketAHistoricoVentas(Ticket ticket){
        historicoVentas.add(ticket);
    }
}
