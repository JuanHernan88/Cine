/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.AplicacionCine.main;

import autonoma.AplicacionCine.exceptions.PrecioInvalidoException;
import autonoma.AplicacionCine.models.Boleta;
import autonoma.AplicacionCine.models.Factura;
import autonoma.AplicacionCine.models.Funcion;
import autonoma.AplicacionCine.models.Pelicula;
import autonoma.AplicacionCine.models.TipoFuncion;
import autonoma.AplicacionCine.models.TipoUsuario;
import autonoma.AplicacionCine.models.Usuario;
import autonoma.AplicacionCine.models.Venta;
import java.util.*;


/*
 * 
 * @author Juan Jacobo Cañas Henao
 * @since 20250312
 * @version 1.0.0 
 */
public class AplicacionCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Crear película
            Pelicula peli = new Pelicula("Interstellar", 12000);

            // Crear función
            Funcion funcion = new Funcion(TipoFuncion.PRIMERA, peli);

            // Crear usuario
            Usuario usuario = new Usuario("Ana", TipoUsuario.NIÑO);

            // Crear boletas
            Boleta boleta1 = new Boleta(funcion, usuario);
            Boleta boleta2 = new Boleta(funcion, usuario);

            // Crear lista de boletas
            List<Boleta> boletas = new ArrayList<>();
            boletas.add(boleta1);
            boletas.add(boleta2);

            // Crear venta
            Venta venta = new Venta(boletas, usuario);

            // Crear factura
            Factura factura = new Factura(venta);

            // Imprimir factura
            System.out.println(factura.generarFactura());

        } catch (PrecioInvalidoException e) {
            System.out.println("Error al calcular boleta: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }    
}
