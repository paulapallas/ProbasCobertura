package paulapallas;

import java.sql.Date;

public class Profesor extends Persona {   //Solo unha superclase en JAVA , unha clase so ten unha superclase , unha clase pode ter varias clases fillas.

    //Atributos
    String especialidad;
    String cuerpo;
    boolean sustituto;  //Si o valor esta en minusculas o valor é concreto
    Date fecOposicion;


    //Métodos
    public Profesor (){

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public boolean isSustituto() {
        return sustituto;
    }

    public Date getFecOposicion() {
        return fecOposicion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setSustituto(boolean sustituto) {
        this.sustituto = sustituto;
    }

    public void setFecOposicion(Date fecOposicion) {
        this.fecOposicion = fecOposicion;
    }





}
