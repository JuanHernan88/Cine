/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.AplicacionCine.models;

import autonoma.AplicacionCine.models.*;

/*
 * 
 * @author Juan Jacobo Cañas Henao
 * @since 20250312
 * @version 1.0.0 
 */
public class Usuario {
    private String nombre;
    private TipoUsuario tipo;

    public Usuario(String nombre, TipoUsuario tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public double getDescuento() {
        return tipo.getDescuento();
    }

    public String getNombre() {
        return nombre;
    }

}
