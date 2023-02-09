/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author David
 */
public class Celular {
    private int codigo;
    private double precio;
    private String marca;
    private String modelo;

    public Celular(int codigo, double precio, String marca, String modelo) {
        this.codigo = codigo;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Celular{" + "codigo=" + codigo + ", precio=" + precio + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    
    
}
