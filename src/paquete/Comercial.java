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
public class Comercial extends Empleado {

    private int ventas;

    public Comercial() {
        super();
    }

    public Comercial(int ventas, String nombre, String apellido, int edad, double sueldo, LocalDate fechaIncorporacion) {
        super(nombre, apellido, edad, sueldo, fechaIncorporacion);
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    //Los empleados que se dedican a la venta. Su sueldo mensual es el 20% de las ventas que han hecho en el mes más 400 euros
    @Override
    public double calcularSueldo() {
        return (20 * getVentas() / 100) + 400;
    }

    @Override
    public String mostrarNombreCompleto() {
        return "El " + this.getClass().getSimpleName() + " : " + this.getNombre() + " " + this.getApellido();
    }

}
