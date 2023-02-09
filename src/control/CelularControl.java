/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import modelo.Celular;
import servicio.CelularServiceImpl;

/**
 *
 * @author JuanFer
 */
public class CelularControl {

    private CelularServiceImpl celularServiceImpl = new CelularServiceImpl();

    public void crear(String[] data) {
        var retorno = "No se puede crear Celular";
        /*private int codigo;
    private double precio;
    private String marca;
    private String modelo;*/
        var codigo = Integer.valueOf(data[0]).intValue();
        var precio = Double.valueOf(data[1]).doubleValue();;
        var marca = data[2];
        var modelo = data[3];

        if (precio < 0) {
            retorno += (" Precio no valido ");
        } else {
            var celular = new Celular(codigo, precio, marca, modelo);
            this.celularServiceImpl.crear(celular);
        }

    }

    public List<Celular> listar() {
        return this.celularServiceImpl.listar();
    }

}
