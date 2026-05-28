package org.example.DAO;
import org.example.beans.Satelite;

import java.util.ArrayList;

public class SateliteDAOImpl
extends AbstractDAO<Satelite>{
    private static final String SQL_INSERT =
            "INSERT INTO SATELITES " +
                    "(" +
                    "id_Satelite, " +
                    "Nombre_Satelite, " +
                    "Orbita, " +
                    "Peso, " +
                    "Coste, " +
                    "Activo," +
                    "Fecha_Lanzamiento" +
                    "id_Agencia, " +
                    "Autor_Examen, " +
                    ") " +
                    "VALUES " +
                    "(" +
                    "?, ?, ?, ?, ?, ?,?,?,?" +
                    ")";

    private static final String SQL_FIND =
            "SELECT * " +
                    "FROM SATELITES " +
                    "WHERE id = ?";

    private static final String SQL_FIND_ALL =
            "SELECT * " +
                    "FROM SATELITES " +
                    "ORDER BY id";

    private static final String SQL_UPDATE =
            "UPDATE SATELITES " +
                    "SET " +
                    "Nombre_Satelite= ?, " +
                    "Orbita = ?, " +
                    "Peso = ?, " +
                    "Coste = ?, " +
                    "Activo = ? " +
                    "Fecha_Lanzamiento = ? " +
                    "WHERE id = ?";

    private static final String SQL_DETALLE_SATELITE =
            "SELECT" +
                    "    S.ID," +
                    "    S.Nombre_Satelite," +
                    "    S.Orbita," +
                    "    S.Peso," +
                    "    S.Coste," +
                    "    S.Activo," +
                    "    S.Fecha_Lanzamiento," +
                    "\n" +
                    "    DS.ID DETALLE_ID," +
                    "    DS.SINOPSIS," +
                    "    DS.PRESUPUESTO," +
                    "    DS.RECAUDACION," +
                    "    DS.IDIOMA_ORIGINAL" +
                    "\n" +
                    "FROM SATELITES S" +
                    "\n" +
                    "INNER JOIN DETALLE_SATELITES DS" +
                    "ON S.ID = DS.SATELITE_ID" +
                    "\n" +
                    "ORDER BY S.ID;";


    public SateliteDAOImpl(
            MotorSQL motorSQL) {

        super(motorSQL);
    }


    @Override
    public void add(Satelite satelite) {
        try{

            motorSQL.connect();

            motorSQL.prepare(SQL_INSERT);
            motorSQL.getPs().setInt(
                    1,
                    satelite.getId_Satelite());

            motorSQL.getPs().setString(
                    2,
                    satelite.getNombre_Satelite());


            motorSQL.getPs().setString(
                    3,
                    satelite.getOrbita());


            motorSQL.getPs().setInt(
                    4,
                    satelite.getPeso());



            motorSQL.getPs().setInt(
                    5,
                    satelite.getCoste());


            motorSQL.getPs().setString(
                    6,
                    satelite.getActivo());

            motorSQL.getPs().setString(
                    7,
                    satelite.getFecha_Lanzamiento());

            motorSQL.getPs().setInt(
                    8,
                    satelite.getId_Agencia());

            motorSQL.getPs().setString(
                    9,
                    satelite.getAutor_Examen());


            int rows =
                    motorSQL.executeUpdate();

            System.out.println(
                    "INSERTADOS: " +
                            rows);

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }
    }


    @Override
    public void update(int id, Satelite object) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Satelite find(int id) {
        return null;
    }

    @Override
    public ArrayList<Satelite> findAll() {
        return null;
    }
}
