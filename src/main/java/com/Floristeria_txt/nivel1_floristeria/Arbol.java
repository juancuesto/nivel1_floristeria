package com.Floristeria_txt.nivel1_floristeria;

public class Arbol implements IArticulo {

    private double altura;
    private double precio;

    public Arbol(double altura, double precio) {
        this.altura = altura;
        this.precio = precio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "altura=" + altura +
                ", precio=" + precio +
                '}';
    }

    public void mostrarPrecio() {
        System.out.println("Ele precio del arbol es : "+precio);
    }
}
