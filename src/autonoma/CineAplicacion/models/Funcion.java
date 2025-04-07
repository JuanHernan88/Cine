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
public class Funcion {
    private TipoFuncion tipo;
    private Pelicula pelicula;

    public Funcion(TipoFuncion tipo, Pelicula pelicula) {
        this.tipo = tipo;
        this.pelicula = pelicula;
    }

    public double getDescuentoFuncion() {
        return tipo.getDescuento();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

}
