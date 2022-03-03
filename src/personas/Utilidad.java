package personas;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Utilidad {
    static List<String> listaPersona = new ArrayList();
    // Define las varibles donde guardare los atributos
    static String nombre;
    static String apellido1;
    static String apellido2;
    static String ocupacion;
    static int edad;
    static String email;
    static String codTelef;
    static double numTelef;
    static String edadTexto;
    
    public void Persona(String nombre, String apellido1, String apellido2, String ocupacion, int edad, String email, String codTelef, double numTelef) {
        // Asigno valores con el constructor
        Utilidad.nombre = nombre;
        Utilidad.apellido1 = apellido1;
        Utilidad.apellido2 = apellido2;
        Utilidad.ocupacion = ocupacion;
        Utilidad.edad = edad;
        Utilidad.email = email;
        Utilidad.codTelef = codTelef;
        Utilidad.numTelef = numTelef;
    }
    
    public static void guardarP() {
        String edadTexto = String.valueOf(Utilidad.edad);
        String numeroTlf = String.valueOf(Utilidad.numTelef);
        listaPersona.add(Utilidad.nombre);
        listaPersona.add(Utilidad.apellido1);
        listaPersona.add(Utilidad.apellido2);
        listaPersona.add(Utilidad.ocupacion);
        listaPersona.add(edadTexto);
        listaPersona.add(Utilidad.email);
        listaPersona.add(Utilidad.codTelef);
        listaPersona.add(numeroTlf);

    }

    // Metodo para grabar los datos
    public static void grabarPersona() throws Exception {
        FileWriter fichero = new FileWriter("F:/personas.txt", true);
        fichero.write(listaPersona + "\n");
        fichero.close();
    }

    public static String leerFichero(String nombreFichero) {
        String fichero = nombreFichero;
        String prueba = "";
        int a;
        int puntoYcoma = 0;
        String pruebaEdad = Integer.toString(edad);
        String persona = "";
        try {
            FileReader ficheroPersonas = new FileReader(fichero);
            while (((a = ficheroPersonas.read()) != -1)) {
                if ((char) a != ';') {
                    prueba = prueba + (char) a;
                    switch (puntoYcoma) {
                        case 0:
                            Utilidad.nombre = prueba;
                            persona = persona + Utilidad.nombre;
                            prueba = "";
                            break;
                        case 1:
                            Utilidad.apellido1 = prueba;
                            persona = persona + Utilidad.apellido1;
                            prueba = "";
                            break;
                        case 2:
                            Utilidad.apellido1 = prueba;
                            persona = persona + Utilidad.apellido1;
                            prueba = "";
                            break;
                        case 3:
                            Utilidad.ocupacion = prueba;
                            persona = persona + Utilidad.ocupacion;
                            prueba = "";
                            break;
                        case 4:
                            pruebaEdad = prueba;
                            persona = persona + pruebaEdad;
                            prueba = "";
                            break;
                        case 5:
                            Utilidad.email = prueba;
                            persona = persona + Utilidad.email;
                            prueba = "";
                            break;
                    }
                } else {
                    puntoYcoma++;
                }

            }
            System.out.println(persona);
            ficheroPersonas.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return prueba;
    }
}
