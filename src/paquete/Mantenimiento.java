/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.time.LocalDate;

/**
 * 
 * @author introspectivo
 */
public class Mantenimiento extends Empleado implements Prima {

    private int horasTrabajadas;
    private boolean manipulacionRiesgo;

    public Mantenimiento() {
        super();
    }

    public Mantenimiento(int horasTrabajadas, boolean manipulacionRiesgo, String nombre, String apellido, int edad, double sueldo, LocalDate fechaIncorporacion) {
        super(nombre, apellido, edad, sueldo, fechaIncorporacion);
        this.horasTrabajadas = horasTrabajadas;
        this.manipulacionRiesgo = manipulacionRiesgo;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public boolean isManipulacionRiesgo() {
        return manipulacionRiesgo;
    }

    public void setManipulacionRiesgo(boolean manipulacionRiesgo) {
        this.manipulacionRiesgo = manipulacionRiesgo;
    }
    
    
    //Los empleados de mantenimiento. Su sueldo mensual es el número de horas trabajadas  en el mes multiplicado por 5
    @Override
    public double calcularSueldo() {
        if (this.manipulacionRiesgo){
            return this.getHorasTrabajadas() * 5 + PRIMA_RIESGO;
        }else{
            return this.getHorasTrabajadas() * 5;
        }
    }

    @Override
    public String mostrarNombreCompleto() {
       return "El operario de mantemiento: " + this.getNombre() + " " + this.getApellido();
    }

}
