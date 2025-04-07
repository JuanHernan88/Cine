/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.AplicacionCine.models;

import autonoma.AplicacionCine.models.*;
import autonoma.AplicacionCine.exceptions.PrecioInvalidoException;

/*
 * 
 * @author Juan Jacobo Cañas Henao
 * @since 20250312
 * @version 1.0.0 
 */
public class Boleta {
    private Funcion funcion;
    private Usuario usuario;
    private double precioFinal;

    public Boleta(Funcion funcion, Usuario usuario) throws PrecioInvalidoException {
        this.funcion = funcion;
        this.usuario = usuario;
        calcularPrecioFinal();
    }

    private void calcularPrecioFinal() throws PrecioInvalidoException {
        double base = funcion.getPelicula().getCostoBase();
        double descuentoFuncion = base * funcion.getDescuentoFuncion();
        double descuentoUsuario = usuario.getDescuento();
        precioFinal = base - descuentoFuncion - descuentoUsuario;
        if (precioFinal < 0) {
            throw new PrecioInvalidoException("El precio no puede ser negativo");
        }
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
}
