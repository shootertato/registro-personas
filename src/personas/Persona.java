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
}