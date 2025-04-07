/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.AplicacionCine.models;

import autonoma.AplicacionCine.models.*;
import java.util.List;

/*
 * 
 * @author Juan Jacobo Cañas Henao
 * @since 20250312
 * @version 1.0.0 
 */
public class Venta {
    private List<Boleta> boletas;
    private Usuario usuario;

    public Venta(List<Boleta> boletas, Usuario usuario) {
        this.boletas = boletas;
        this.usuario = usuario;
    }

    public double calcularTotal() {
        return boletas.stream().mapToDouble(Boleta::getPrecioFinal).sum();
    }

    public List<Boleta> getBoletas() {
        return boletas;
    }
}
