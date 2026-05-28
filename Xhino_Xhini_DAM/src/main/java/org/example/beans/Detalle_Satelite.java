package org.example.beans;

public class Detalle_Satelite {
    private int id_DetalleSatelite;
    private int Velocidad_Max;
    private int Combustible;
    private int Vida_Util;
    private int Temperatura_Max;
    private Satelite id_Satelite;
    private String Autor_Examen;

    public Detalle_Satelite() {
    }

    public Detalle_Satelite(int id_DetalleSatelite, int velocidad_Max, int combustible, int vida_Util, int temperatura_Max, Satelite id_Satelite, String autor_Examen) {
        this.id_DetalleSatelite = id_DetalleSatelite;
        Velocidad_Max = velocidad_Max;
        Combustible = combustible;
        Vida_Util = vida_Util;
        Temperatura_Max = temperatura_Max;
        this.id_Satelite = id_Satelite;
        Autor_Examen = autor_Examen;
    }

    public int getId_DetalleSatelite() {
        return id_DetalleSatelite;
    }

    public void setId_DetalleSatelite(int id_DetalleSatelite) {
        this.id_DetalleSatelite = id_DetalleSatelite;
    }

    public int getVelocidad_Max() {
        return Velocidad_Max;
    }

    public void setVelocidad_Max(int velocidad_Max) {
        Velocidad_Max = velocidad_Max;
    }

    public int getCombustible() {
        return Combustible;
    }

    public void setCombustible(int combustible) {
        Combustible = combustible;
    }

    public int getVida_Util() {
        return Vida_Util;
    }

    public void setVida_Util(int vida_Util) {
        Vida_Util = vida_Util;
    }

    public int getTemperatura_Max() {
        return Temperatura_Max;
    }

    public void setTemperatura_Max(int temperatura_Max) {
        Temperatura_Max = temperatura_Max;
    }

    public Satelite getId_Satelite() {
        return id_Satelite;
    }

    public void setId_Satelite(Satelite id_Satelite) {
        this.id_Satelite = id_Satelite;
    }

    public String getAutor_Examen() {
        return Autor_Examen;
    }

    public void setAutor_Examen(String autor_Examen) {
        Autor_Examen = autor_Examen;
    }

    @Override
    public String toString() {
        return "Detalle_Satelite{" +
                "id_DetalleSatelite=" + id_DetalleSatelite +
                ", Velocidad_Max=" + Velocidad_Max +
                ", Combustible=" + Combustible +
                ", Vida_Util=" + Vida_Util +
                ", Temperatura_Max=" + Temperatura_Max +
                ", id_Satelite=" + id_Satelite +
                ", Autor_Examen='" + Autor_Examen + '\'' +
                '}';
    }
}
