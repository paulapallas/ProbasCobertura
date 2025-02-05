package paulapallas;

import java.util.Date;

public class Persona {

    // Atributos
    private String dni;
    public String nombre;
    public String apellido1;
    public String apellido2;
    public String correo;
    public Integer movil;
    public Date fecNacemento;
    private String iban;

    // Si se pon public diante pode acederse desde calquera class

    // Métodos


    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getMovil() {
        return movil;
    }

    public Date getFecNacmento() {
        return fecNacemento;
    }

    public String getIban() {
        return iban;
    }

}
