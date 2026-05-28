package org.example.beans;

public class Agencia {
    private int id_Agencia;
    private String Nombre_Agencia;
    private String Pais_Agencia;
    private String Fecha_Fundacion;
    private String Autor_Examen;

    public Agencia() {
    }

    public Agencia(int id_Agencia, String nombre_Agencia, String pais_Agencia, String fecha_Fundacion, String autor_Examen) {
        this.id_Agencia = id_Agencia;
        Nombre_Agencia = nombre_Agencia;
        Pais_Agencia = pais_Agencia;
        Fecha_Fundacion = fecha_Fundacion;
        Autor_Examen = autor_Examen;
    }

    public int getId_Agencia() {
        return id_Agencia;
    }

    public void setId_Agencia(int id_Agencia) {
        this.id_Agencia = id_Agencia;
    }

    public String getNombre_Agencia() {
        return Nombre_Agencia;
    }

    public void setNombre_Agencia(String nombre_Agencia) {
        Nombre_Agencia = nombre_Agencia;
    }

    public String getPais_Agencia() {
        return Pais_Agencia;
    }

    public void setPais_Agencia(String pais_Agencia) {
        Pais_Agencia = pais_Agencia;
    }

    public String getFecha_Fundacion() {
        return Fecha_Fundacion;
    }

    public void setFecha_Fundacion(String fecha_Fundacion) {
        Fecha_Fundacion = fecha_Fundacion;
    }

    public String getAutor_Examen() {
        return Autor_Examen;
    }

    public void setAutor_Examen(String autor_Examen) {
        Autor_Examen = autor_Examen;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "id_Agencia=" + id_Agencia +
                ", Nombre_Agencia='" + Nombre_Agencia + '\'' +
                ", Pais_Agencia='" + Pais_Agencia + '\'' +
                ", Fecha_Fundacion='" + Fecha_Fundacion + '\'' +
                ", Autor_Examen='" + Autor_Examen + '\'' +
                '}';
    }
}
