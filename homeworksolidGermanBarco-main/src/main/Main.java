package main;

import entidades.*;
import modelo.*;
import service.EnvioMaterial;


public class Main {

    //Se define el array de carreras para que estas sean creadas y muestren sus materias definidas en sus clases

    public static void main(String[] args) {

        Carrera[] arrayCarreras = {
                new Informatica(),
                new Industrial(),
                new Administracion(),
        };
        verMateriasCarrera(arrayCarreras);

        //Se crean estudiantes de acuerdo a cada carrera y son asignados sus materiales respectivos por clase

        EnvioMaterial material = new EnvioMaterial();
        material.asignarDatos(new Daniel());
        material.asignarDatos(new Cano());
        material.asignarDatos(new Laura());
    }

    public static void verMateriasCarrera(Carrera[] carreras) {

        /*De esta forma se llama el método .getCarrera de la clase abstracta padre (Carrera) que provee las carreras
        por la cantidad de carreras que hay, además estas muestran sus clases por override al metodo .verMateriasEstudiantes
         */

        for (Carrera carrera:carreras){
            System.out.println(carrera.getCarrera());
            carrera.verMateriasEstudiantes();
        }

            /*Se rompe el principio de Open/Close ya que es necesario alterar el main cada vez que entre o salga una
            carrera, solo deberían ser llamados los métodos de clases definidas por carreras.

            if (estudiante.carrera.equals("Informatica")) {
                System.out.println("Programacion, Arquitectura, Base de datos");
            }
            if (estudiante.carrera.equals("Administracion")) {
                System.out.println("Negocios, Administracion I, Historia de la Administracion");
            }
            if (estudiante.carrera.equals("Industrial")) {
                System.out.println("Procesos, Analitica de datos, Gestion de Calidad");
             */

        /*Se soluciona el open/close por medio de una clase abstracta Carrera que deriva a clases de las materias
        de esta forma el comportamiendo de las propiedades se asigna en las clases respectivas y se muestra por
        medio de overrides.

        Posterior se llama al main y por medio de un Array y un for se muestran las carreras y de cada una materias.
         */

        }
    }
