/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package autonoma.AplicacionCine.models;

import autonoma.AplicacionCine.models.*;

/*
 * 
 * @author Juan Jacobo Cañas Henao
 * @since 20250312
 * @version 1.0.0 
 */
public enum TipoFuncion {
    PRIMERA(0.5), TARDE(0.1), NOCHE(0.0);
    private final double descuento;
    TipoFuncion(double descuento) {
        this.descuento = descuento;
    }
    public double getDescuento() {
        return descuento;
    }
}
