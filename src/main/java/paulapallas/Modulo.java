package paulapallas;

public class Modulo {

    //Atributos
    private String codigo;
    private  String nombre;
    private String descripcion;
    private Integer horas;
    private Integer sesiones;


    //Métodos
    public Modulo(){
        
    }

    

    public Modulo(String codigo, String nombre, String descripcion, Integer horas, Integer sesiones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.sesiones = sesiones;
    }



    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getSesiones() {
        return sesiones;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public void setSesiones(Integer sesiones) {
        this.sesiones = sesiones;
    }



    @Override
    public String toString() {
        return "Modulo [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", horas=" + horas
                + ", sesiones=" + sesiones + "]";
    }

    public Integer sesionesAP() {
        return 0;

    }

    public Integer sesionesPD() {
        return 0;

    }
    


}


