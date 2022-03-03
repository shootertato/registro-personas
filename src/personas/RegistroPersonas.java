package personas;
import java.io.*;
import java.util.*;

public class RegistroPersonas {
    /** El menu va a dar las opciones al usuario */
    public static void main(String[] args) throws Exception {
        int opcion = 0; // varible para guardar la opcion del menu
        boolean terminar = false;// variable para salir del menu
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        File personatxt = new File("F:/personas.txt");
        FileReader ficheroLecturaPersona = new FileReader("F:/personas.txt");
        Persona datosPersona = new Persona();
        // comprobar el archivo
        System.out.println("Comprobando el archivo");
        try {
            if (personatxt.exists() == true) {
                System.out.println("El archivo ya existe");
            } else {
                System.out.println("Lo puedo crear?" + personatxt.createNewFile());
                if (personatxt.createNewFile() == true) {
                    System.out.println("Estoy creando el archivo");
                } else {
                    System.out.println("El archivo ya existe");
                }

            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Pedir los datos mientras el usuario lo necesite
        while (terminar == false) {
            // Opciones del menu
            System.out.println("Elige una opcion:");
            System.out.println("1 para registrar datos de persona.");
            System.out.println("2 para leer el archivo personas");
            System.out.println("0 para cerrar el programa.");
            // Leer la opcion elegida por el usuario
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    // pasar el nombre al objeto
                    System.out.println("Dime el nombre: ");
                    datosPersona.setNombre(sc.nextLine());
                    // pasar apellido al objeto
                    System.out.println("Dime el primer apellido: ");
                    datosPersona.setApellido1(sc.nextLine());
                    // pasar apellido al objeto
                    System.out.println("Dime el segundo apellido: ");
                    datosPersona.setApellido2(sc.nextLine());
                    // pasar la ocupacion al objeto
                    System.out.println("Dime la ocupacion: ");
                    datosPersona.setOcupacion(sc.nextLine());
                    // pasar la edad al objeto
                    System.out.println("Dime la edad: ");
                    datosPersona.setEdad(Integer.parseInt(sc.nextLine()));
                    // pasar el emal la objeto
                    System.out.println("Dime el email: ");
                    datosPersona.setEmail(sc.nextLine());
                    // pasar apellido al objeto
                    System.out.println("Dime el codigo del telefono: ");
                    datosPersona.setCodTelf(sc.nextLine());
                    // pasar apellido al objeto
                    System.out.println("Dime el numero de telefono: ");
                    datosPersona.setNumTelf(Integer.parseInt(sc.nextLine()));


                    Utilidad.guardarP();
                    Utilidad.grabarPersona();

                    break;
                
                case 2:
                try {
                    Utilidad.leerFichero("F:/personas.txt");                            
                }catch (Exception e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
                    ficheroLecturaPersona.close();
                    break;
                    case 4:
                case 0:
                    terminar = true;
                    break;
            }
        }
    }
}