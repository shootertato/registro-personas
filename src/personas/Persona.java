package personas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Persona {
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

    public Persona() {
        this.nombre="nombre Default";
        this.apellido1="apellido1 Default";
        this.apellido2="apellido2 Default";
        this.ocupacion="ocupacion Default";
        this.edad=0;
        this.email="email Default";
        this.codTelef="codTelef Default";
        this.numTelef=-1;
    }

    public Persona(String nombre, String apellido1, String apellido2, String ocupacion, int edad, String email, String codTelef, double numTelef) {
        // Asigno valores con el constructor
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.email = email;
        this.codTelef = codTelef;
        this.numTelef = numTelef;
    }

    // Recuperar el nombre
    public String getNombre() {
        return this.nombre;
    }

    // Dar nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Recuperar el apellido1
    public String getApellido1() {
        return this.apellido1;
    }

    // Dar apellido1
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    // Recuperar el apellido2
    public String getApellido2() {
        return this.apellido2;
    }

    // Dar apellido2
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    // Recuperar la ocupacion
    public String getOcupacion() {
        return this.ocupacion;
    }

    // Dar la ocupacion
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    // Recuperar la edad
    public int getEdad() {
        return this.edad;
    }

    // Dar la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Recuperar email
    public String getEmail() {
        return this.email;
    }

    // Dar el email
    public void setEmail(String email) {
        this.email = email;
    }

    // Recuperar codigo del telefono
    public String getCodTelef() {
        return this.codTelef;
    }

    // Dar el codigo del telefono
    public void setCodTelf(String codTelef) {
        this.codTelef = codTelef;
    }
    
    // Recuperar numero de telefono
    public double getNumTelef() {
        return this.numTelef;
    }

    // Dar el numero de telefono
    public void setNumTelf(double numTelef) {
        this.numTelef = numTelef;
    }

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