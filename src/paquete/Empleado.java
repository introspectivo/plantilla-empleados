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
 *
 * Clase que pertenece al parentesco de la jerarquía de clases. Clase abstracta
 * por lo que no se podrán generar instancias de la misma.
 *
 * Sirve para reutilizar código (estado/funcionalidad) en sus clases hijas:
 * (Comercial/Representante/Operario productivo/Operario mantenimiento)
 *
 * Incluye 2 métodos abstractos que tendrán que implementar sus clases hijas
 * obligatoriamente.
 */
public abstract class Empleado implements Comparable<Empleado> {

    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;
    private LocalDate fechaIncorporacion;

    public Empleado() {

    }

    public Empleado(String nombre, String apellido, int edad, double sueldo, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return this.mostrarNombreCompleto() + " de " + this.getEdad() + " años. Se incorporó a la empresa el " + this.getFechaIncorporacion() + ". Su sueldo es de " + this.calcularSueldo();
    }

    /**
     * @return Devuelve el sueldo del empleado, según su tipo. Es decir las
     * clases hijas lo implementar a su manera. Ya que sueldo es distinto según
     * la función que desempeñen.
     */
    public abstract double calcularSueldo();

    /**
     * @return Devuelve un String mostrando el tipo de empleado y su nombre completo.
     */
    public abstract String mostrarNombreCompleto();

    /**
     * Método no esta estático, se llama a traves de objeto. Compara la
     * veteranía en la empresa este con el del párametro Implementación del
     * método de la interfaz Comparable. Para ordenar según cúanto
     * tiempo se lleve en la empresa.
     *
     * @param otro Recibe un objeto empleado (Se puede aplicar polimorfismo)
     * @return Devuelve 0: Si ambos empleados llevan el mismo tiempo en la
     * empresa. 
     * Devuelve 1: Si el empleado que llama al método es más veterano
     * que el del párametro 
     * Devuelve -1: Si el el empleado que llama al método
     * es más novel que el del párametro.
     */
    @Override
    public int compareTo(Empleado otro) {
        if (((Empleado) this).getFechaIncorporacion().isBefore(((Empleado) otro).getFechaIncorporacion())) {
            return -1;
        } else if (((Empleado) this).getFechaIncorporacion().isAfter(((Empleado) otro).getFechaIncorporacion())) {
            return 1;
        } else {
            return 0;
        }
    }

}
