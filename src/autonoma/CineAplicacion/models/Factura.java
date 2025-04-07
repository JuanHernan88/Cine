/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.CineAplicacion.models;

/*
 * 
 * @author Juan Jacobo Cañas Henao
 * @since 20250312
 * @version 1.0.0 
 */
import autonoma.AplicacionCine.interfaces.IFacturable;
import java.util.Date;

public class Factura implements IFacturable {
    private Venta venta;
    private Date fecha;

    public Factura(Venta venta) {
        this.venta = venta;
        this.fecha = new Date();
    }

    @Override
    public String generarFactura() {
        StringBuilder sb = new StringBuilder("Factura:\n");
        for (Boleta b : venta.getBoletas()) {
            sb.append("Boleta: ").append(b.getPrecioFinal()).append("\n");
        }
        sb.append("Total: ").append(venta.calcularTotal()).append("\n");
        sb.append("Fecha: ").append(fecha.toString()).append("\n");
        return sb.toString();
    }
}

