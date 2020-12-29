/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author introspectivo
 *
 * Clase Principal, aloja el método main del programa. Que será el
 * desencadenante de la ejecución del mismo. El flujo de este esta controlado
 * por un sentencia 'switch' permitiendo así elegir al usuario entre las
 * distintas opciones del menu.
 *
 * El programa tiene como función controlar el sueldo de una plantilla de
 * empleados, y sus posibles incentivos.
 *
 * @version 1.0
 */
public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        int opcion;
        
        opcion = EntradaSalida.mostrarMenu();
        
        System.out.println("Hola de muveas");

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    Comercial c = EntradaSalida.pedirComercial();
                    listaEmpleados.add(c);
                    break;
                case 2:
                    Representante r = EntradaSalida.pedirRepresentante();
                    listaEmpleados.add(r);
                    break;
                case 3:
                    Productivo p = EntradaSalida.pedirProductivo();
                    listaEmpleados.add(p);
                    break;
                case 4:
                    Mantenimiento m = EntradaSalida.pedirMantenimiento();
                    listaEmpleados.add(m);
                    break;
                case 5:
                    Collections.sort(listaEmpleados);
                    break;
                case 6:
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    listaEmpleados.forEach(e -> {
                        System.out.println(" ~~ " + e);
                    });
                    break;
                default:
                    System.out.println("¡OPCIÓN INCORRECTA!");
                    break;

            }

            opcion = EntradaSalida.mostrarMenu();
        }

    }

}
