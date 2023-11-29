package Programa;

public class TiempoEstimadoDeResolucionDeIncidente {
    private TipoProblema tipoproblema;
    private int horasEstimadas;

    //CONTRUCTORES//
    public TiempoEstimadoDeResolucionDeIncidente(){}



    //GETTERS Y SETTERS//
    public TipoProblema getTipoproblema() {
        return tipoproblema;
    }

    public void setTipoproblema(TipoProblema tipoproblema) {
        this.tipoproblema = tipoproblema;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
}
