/*4. Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
        la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
        tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
        información debe gestionar esta aplicación:
        • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
        identificación y su estado civil.
        • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
        incorporación a la facultad y qué número de despacho tienen asignado.
        • En cuanto a los estudiantes, se requiere almacenar el curso en el que están
        matriculados.
        • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
        pertenecen (lenguajes, matemáticas, arquitectura, ...).
        • Sobre el personal de servicio, hay que conocer a qué sección están asignados
        (biblioteca, decanato, secretaría, ...).
        El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
        continuación, debe programar las clases definidas en las que, además de los constructores,
        hay que desarrollar los métodos correspondientes a las siguientes operaciones:
        • Cambio del estado civil de una persona.
        • Reasignación de despacho a un empleado.
        • Matriculación de un estudiante en un nuevo curso.
        • Cambio de departamento de un profesor.
        • Traslado de sección de un empleado del personal de servicio.
        • Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
        que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.*/

import Entity.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        HashMap<Integer, Persona> mapa = new HashMap<>();
        Estudiante est1 = new Estudiante("martin", "aponte", 1, "soltero", "física");
        Estudiante est2 = new Estudiante("ana", "casas", 5, "soltera", "física");
        Empleado empl1 = new Empleado("Juan", "Perez", 2, "soltero", 2018, 23);
        Profesor prof1 = new Profesor("Ruben", "Mora", 3, "casado", "ciencias");
        PersonalServicio per1 = new PersonalServicio("Pedro", "Aleman", 4, "viudo", "Ingenieria");

        mapa.put(est1.getDni(), est1);
        mapa.put(est2.getDni(), est2);
        mapa.put(empl1.getDni(), empl1);
        mapa.put(prof1.getDni(), prof1);
        mapa.put(per1.getDni(), per1);


        int opcion;

        do {
            System.out.println(" ");
            System.out.println("Ingrese el numeral de la acción a realizar: ");
            System.out.println("1. Cambio del estado civil de una persona.");
            System.out.println("2. Reasignación de despacho a un empleado.");
            System.out.println("3. Cambio de departamento de un profesor.");
            System.out.println("4. Matriculación de un estudiante en un nuevo curso.");
            System.out.println("5. Imprimir toda la información de cada tipo de individuo.");
            System.out.println("6. Salir.");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el DNI de la persona que cambiara estado civil:");
                    int cam = leer.nextInt();
                    leer.nextLine();
                    for (Map.Entry<Integer, Persona> entry : mapa.entrySet()) {
                        if (cam == entry.getKey()) {
                            System.out.println("Ingrese el nuevo estado civil:");
                            String newState = leer.nextLine();
                            // Cambia un atributo específico del objeto asociado a una clave
                            Persona perActualizar = mapa.get(cam);
                            if (perActualizar != null) {
                                perActualizar.setEstadoCivil(newState); // Modifica el atributo valor
                                System.out.println("OK");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el DNI del empleado que cambiara de despacho:");
                    cam = leer.nextInt();
                    leer.nextLine();
                    Persona em1 = mapa.get(cam);
                    if (em1 instanceof Empleado) {
                        if (cam == em1.getDni()) {
                            System.out.println("Ingrese el nuevo numero de despacho del empleado: ");
                            int newState = leer.nextInt();
                            leer.nextLine();
                            // Cambia un atributo específico del objeto asociado a una clave
                            Empleado proActualizar = (Empleado) mapa.get(cam);
                            if (proActualizar != null) {
                                proActualizar.setNumeroDespacho(newState); // Modifica el atributo valor
                                System.out.println("OK");
                            }
                        }
                    } else {
                        System.out.println("El dni ingresado no corresponde a un empleado.");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el DNI del profesor que cambiara de departamento:");
                    cam = leer.nextInt();
                    leer.nextLine();
                    em1 = mapa.get(cam);
                    if (em1 instanceof Empleado) {
                        if (em1 instanceof Empleado) {
                            if (cam == em1.getDni()) {
                                System.out.println("Ingrese el nuevo numero departamento del profesor:\"");
                                String newState = leer.nextLine();
                                leer.nextLine();
                                // Cambia un atributo específico del objeto asociado a una clave
                                Profesor propActualizar = (Profesor) mapa.get(cam);
                                if (propActualizar != null) {
                                    propActualizar.setDepartamentoPerteneciente(newState); // Modifica el atributo valor
                                    System.out.println("OK");
                                }
                            }
                        } else {
                            System.out.println("El dni ingresado no corresponde a un profesor.");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el DNI del Estudiante que ingresara al curso:");
                    cam = leer.nextInt();
                    leer.nextLine();
                    em1 = mapa.get(cam);
                    if (em1 instanceof Estudiante) {
                        if (cam == em1.getDni()) {
                            System.out.println("Ingrese el nuevo curso que ingresara el estudiante:");
                            String newState = leer.nextLine();
                            // Cambia un atributo específico del objeto asociado a una clave
                            Estudiante estActualizar = (Estudiante) mapa.get(cam);
                            if (estActualizar != null) {
                                String cursosActualizados = estActualizar.getCursoMatriculado() + "," + newState;
                                estActualizar.setCursoMatriculado(cursosActualizados); // Modifica el atributo valor
                                System.out.println("OK");
                            }
                        }
                    } else {
                        System.out.println("El dni ingresado no corresponde a un estudiante.");
                        break;
                    }
                    break;
                case 5:
                    for (Map.Entry<Integer, Persona> entry : mapa.entrySet()) {
                        System.out.println(entry);
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Numeral no valido. Ingrese nuevamente.");
            }
        } while (opcion != 6);
    }
}