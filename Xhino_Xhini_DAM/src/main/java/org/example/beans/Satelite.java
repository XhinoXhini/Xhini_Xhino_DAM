package org.example.beans;

public class Satelite {
    private int id_Satelite;
    private String Nombre_Satelite;
    private String Orbita;
    private int Peso;
    private int Coste;
    private String Activo;
    private String Fecha_Lanzamiento;
    private int id_Agencia;
    private String Autor_Examen;

    public Satelite() {
    }

    public Satelite(int id_Satelite, String nombre_Satelite, String orbita, int peso, int coste, String activo, String fecha_Lanzamiento, int id_Agencia, String autor_Examen) {
        this.id_Satelite = id_Satelite;
        Nombre_Satelite = nombre_Satelite;
        Orbita = orbita;
        Peso = peso;
        Coste = coste;
        Activo = activo;
        Fecha_Lanzamiento = fecha_Lanzamiento;
        this.id_Agencia = id_Agencia;
        Autor_Examen = autor_Examen;
    }

    public int getId_Satelite() {
        return id_Satelite;
    }

    public void setId_Satelite(int id_Satelite) {
        this.id_Satelite = id_Satelite;
    }

    public String getNombre_Satelite() {
        return Nombre_Satelite;
    }

    public void setNombre_Satelite(String nombre_Satelite) {
        Nombre_Satelite = nombre_Satelite;
    }

    public String getOrbita() {
        return Orbita;
    }

    public void setOrbita(String orbita) {
        Orbita = orbita;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }

    public int getCoste() {
        return Coste;
    }

    public void setCoste(int coste) {
        Coste = coste;
    }

    public String getActivo() {
        return Activo;
    }

    public void setActivo(String activo) {
        Activo = activo;
    }

    public String getFecha_Lanzamiento() {
        return Fecha_Lanzamiento;
    }

    public void setFecha_Lanzamiento(String fecha_Lanzamiento) {
        Fecha_Lanzamiento = fecha_Lanzamiento;
    }

    public int getId_Agencia() {
        return id_Agencia;
    }

    public void setId_Agencia(int id_Agencia) {
        this.id_Agencia = id_Agencia;
    }

    public String getAutor_Examen() {
        return Autor_Examen;
    }

    public void setAutor_Examen(String autor_Examen) {
        Autor_Examen = autor_Examen;
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "id_Satelite=" + id_Satelite +
                ", Nombre_Satelite='" + Nombre_Satelite + '\'' +
                ", Orbita='" + Orbita + '\'' +
                ", Peso=" + Peso +
                ", Coste=" + Coste +
                ", Activo='" + Activo + '\'' +
                ", Fecha_Lanzamiento='" + Fecha_Lanzamiento + '\'' +
                ", id_Agencia=" + id_Agencia +
                ", Autor_Examen='" + Autor_Examen + '\'' +
                '}';
    }
}
