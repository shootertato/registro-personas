package personas;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Utilidad {
    List<String> listaPersona = new ArrayList();
    // Define las varibles donde guardare los atributos
    String nombre;
    String apellido1;
    String apellido2;
    String ocupacion;
    int edad;
    String email;
    String codTelef;
    double numTelef;
    String edadTexto;
    
    public void guardarP() {
        String edadTexto = String.valueOf(this.edad);
        String numeroTlf = String.valueOf(this.numTelef);
        listaPersona.add(this.nombre);
        listaPersona.add(this.apellido1);
        listaPersona.add(this.apellido2);
        listaPersona.add(this.ocupacion);
        listaPersona.add(edadTexto);
        listaPersona.add(this.email);
        listaPersona.add(this.codTelef);
        listaPersona.add(numeroTlf);

    }

    // Metodo para grabar los datos
    public void grabarPersona() throws Exception {
        FileWriter fichero = new FileWriter("F:/personas.txt", true);
        fichero.write(listaPersona + "\n");
        fichero.close();
    }

    public String leerFichero(String nombreFichero) {
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
                            this.nombre = prueba;
                            persona = persona + this.nombre;
                            prueba = "";
                            break;
                        case 1:
                            this.apellido1 = prueba;
                            persona = persona + this.apellido1;
                            prueba = "";
                            break;
                        case 2:
                            this.apellido1 = prueba;
                            persona = persona + this.apellido1;
                            prueba = "";
                            break;
                        case 3:
                            this.ocupacion = prueba;
                            persona = persona + this.ocupacion;
                            prueba = "";
                            break;
                        case 4:
                            pruebaEdad = prueba;
                            persona = persona + pruebaEdad;
                            prueba = "";
                            break;
                        case 5:
                            this.email = prueba;
                            persona = persona + this.email;
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
