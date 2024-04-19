package com.Floristeria_txt.nivel1_floristeria;

public class Flor implements IArticulo{
    private String color;
    private double precio;

    public Flor(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void mostrarPrecio() {
        System.out.println("Ele precio de la flor es : "+precio);
    }
}
