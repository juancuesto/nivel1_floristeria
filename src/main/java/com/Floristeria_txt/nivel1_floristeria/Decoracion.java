package com.Floristeria_txt.nivel1_floristeria;

public class Decoracion implements IArticulo {
    private Material material;
    private double precio;

    public Decoracion(Material material, double precio) {
        this.material = material;
        this.precio = precio;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Decoracion{" +
                "material=" + material +
                ", precio=" + precio +
                '}';
    }
    public void mostrarPrecio() {
        System.out.println("Ele precio de la decoracion es : "+precio);
    }

}
