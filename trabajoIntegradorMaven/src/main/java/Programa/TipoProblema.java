package Programa;

public class TipoProblema {
    private String nombre;
    private String descripcion;
    private int tiempoMaximoDeResolucion;
    private List<Especialidad> especialidades;

    //CONSTRUCTORES//
    public TipoProblema(){}

    //GETTERS Y SETTERS//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoMaximoDeResolucion() {
        return tiempoMaximoDeResolucion;
    }

    public void setTiempoMaximoDeResolucion(int tiempoMaximoDeResolucion) {
        this.tiempoMaximoDeResolucion = tiempoMaximoDeResolucion;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
}
