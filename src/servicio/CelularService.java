/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Celular;

/**
 *
 * @author David
 */
public interface CelularService {
    
    public void crear(Celular celular);

    public List<Celular> listar();
    
}
