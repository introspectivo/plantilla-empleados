/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.time.LocalDate;

/**
 * @author introspectivo
 * Entendemos a la clase como operario/empleado de producción
 */
public class Productivo extends Empleado implements Prima {

    private int unidadesProducidas;
    private boolean manipulacionRiesgo;
    
    public Productivo() {
        super();
    }

    public Productivo(int unidadesProducidas, boolean manipulacionRiesgo, String nombre, String apellido, int edad, double sueldo, LocalDate fechaIncorporacion) {
        super(nombre, apellido, edad, sueldo, fechaIncorporacion);
        this.unidadesProducidas = unidadesProducidas;
        this.manipulacionRiesgo = manipulacionRiesgo;
    }

    public int getUnidadesProducidas() {
        return unidadesProducidas;
    }

    public void setUnidadesProducidas(int unidadesProducidas) {
        this.unidadesProducidas = unidadesProducidas;
    }
    
    public boolean isManipulacionRiesgo() {
        return manipulacionRiesgo;
    }

    public void setManipulacionRiesgo(boolean manipulacionRiesgo) {
        this.manipulacionRiesgo = manipulacionRiesgo;
    }

    //Los empleados de producción. Su sueldo mensual es el número de unidades producidas en el mes multiplicado por 5
    @Override
    public double calcularSueldo() {
        if (this.manipulacionRiesgo) {
            return this.getUnidadesProducidas() * 5 + 100;
        } else {
            return this.getUnidadesProducidas() * 5;
        }
    }

    @Override
    public String mostrarNombreCompleto() {
        return "El operario de producción: " + this.getNombre() + " " + this.getApellido();
    }

}
