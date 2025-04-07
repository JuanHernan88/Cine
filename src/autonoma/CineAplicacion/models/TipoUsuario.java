/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package autonoma.CineAplicacion.models;

/*
 * 
 * @author Juan Jacobo Cañas Henao
 * @since 20250312
 * @version 1.0.0 
 */
public enum TipoUsuario {
    NIÑO(500), ADULTO(0), MAYOR(1000);
    private final double descuento;
    TipoUsuario(double descuento) {
        this.descuento = descuento;
    }
    public double getDescuento() {
        return descuento;
    }
}
