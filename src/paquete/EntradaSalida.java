/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author introspectivo
 * 
 * Controla el flujo de entrada/salida de datos con el usuario.
 * Se modulariza así del método principal.
 */
public class EntradaSalida {

    static Scanner sc = new Scanner(System.in);

    static int mostrarMenu() {

        sc.useDelimiter("\n");
        int opcion = 0;
        try {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("INTRODUZCA UNA ÓPCION:  ");
            System.out.println("0- SALIR");
            System.out.println("1- AÑADIR UN COMERCIAL");
            System.out.println("2- AÑADIR UN REPRESENTANTE");
            System.out.println("3- AÑADIR OPERARIO DE PRODUCCIÓN");
            System.out.println("4- AÑADIR OPERARIO DE MANTENIMIENTO");
            System.out.println("5- ORDENAR POR FECHA DE INCORPORACIÓN");
            System.out.println("7- MOSTRAR EMPLEADOS");
            opcion = sc.nextInt();
        } catch (InputMismatchException ex) {

            return -1;
        }

        return opcion;
    }

    public static LocalDate pedirFecha() {
        sc.useDelimiter("\n");
        System.out.println("Introduzca su fecha de incorporación (d/M/yyyy):");
        String entrada = sc.next();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fecha = LocalDate.parse(entrada, dateFormat);

        return fecha;
    }

    static Comercial pedirComercial() {
        sc.useDelimiter("\n");
        System.out.println("Introduzca sus ventas del mes:");
        int ventas = sc.nextInt();
        System.out.println("Introduzca su nombre:");
        String nombre = sc.next();
        System.out.println("Introduzca su apellido:");
        String apellido = sc.next();
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();
        System.out.println("Introduzca su sueldo base:");
        double sueldo = sc.nextDouble();
        LocalDate fechaIncorporacion = pedirFecha();
        Comercial c = new Comercial(ventas, nombre, apellido, edad, sueldo, fechaIncorporacion);
        return c;
    }

    static Representante pedirRepresentante() {
        sc.useDelimiter("\n");
        System.out.println("Introduzca sus ventas del mes:");
        int ventas = sc.nextInt();
        System.out.println("Introduzca su nombre:");
        String nombre = sc.next();
        System.out.println("Introduzca su apellido:");
        String apellido = sc.next();
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();
        System.out.println("Introduzca su sueldo base:");
        double sueldo = sc.nextDouble();
        LocalDate fechaIncorporacion = pedirFecha();
        Representante r = new Representante(ventas, nombre, apellido, edad, sueldo, fechaIncorporacion);
        return r;
    }

    static Productivo pedirProductivo() {
        sc.useDelimiter("\n");
        System.out.println("Introduzca el número de unidades producidas:");
        int unidadesProducidas = sc.nextInt();
        System.out.println("Indique si manipula productos de riesgo (true/false):");
        boolean manipulacionRiesgo = sc.nextBoolean();
        System.out.println("Introduzca su nombre:");
        String nombre = sc.next();
        System.out.println("Introduzca su apellido:");
        String apellido = sc.next();
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();
        System.out.println("Introduzca su sueldo base:");
        double sueldo = sc.nextDouble();
        LocalDate fechaIncorporacion = pedirFecha();
        Productivo p = new Productivo(unidadesProducidas, manipulacionRiesgo, nombre, apellido, edad, sueldo, fechaIncorporacion);
        return p;
    }

    static Mantenimiento pedirMantenimiento() {
        sc.useDelimiter("\n");
        System.out.println("Introduzca el horas trabajadas:");
        int unidadesProducidas = sc.nextInt();
        System.out.println("Indique si manipula productos de riesgo (true/false):");
        boolean manipulacionRiesgo = sc.nextBoolean();
        System.out.println("Introduzca su nombre:");
        String nombre = sc.next();
        System.out.println("Introduzca su apellido:");
        String apellido = sc.next();
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();
        System.out.println("Introduzca su sueldo base:");
        double sueldo = sc.nextDouble();
        LocalDate fechaIncorporacion = pedirFecha();
        Mantenimiento m = new Mantenimiento(unidadesProducidas, manipulacionRiesgo, nombre, apellido, edad, sueldo, fechaIncorporacion);
        return m;
    }

}
