package com.Floristeria_txt.nivel1_floristeria;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    List<IArticulo> listaCompra;


    public Ticket() {
        listaCompra=new ArrayList<IArticulo>();
    }
    public void afegirArticulo(IArticulo articulo){
        if(articulo==null){
            System.out.println("No se ha podido añadir el articulo");
        }
        listaCompra.add(articulo);
    }

    public List<IArticulo> getListaCompra() {
        return listaCompra;
    }
    public void mostrarListaCompra(){
        for (IArticulo ele:listaCompra) {
            System.out.println(ele+"  es aqui");
        }
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "listaCompra=" + listaCompra +
                '}';
    }
}
