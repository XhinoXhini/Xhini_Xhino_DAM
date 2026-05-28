package org.example.DAO;
import org.example.beans.Satelite;

import java.sql.ResultSet;
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
                    "    S.id_Satelite," +
                    "    S.Nombre_Satelite," +
                    "    S.Orbita," +
                    "    S.Peso," +
                    "    S.Coste," +
                    "    S.Activo," +
                    "    S.Fecha_Lanzamiento," +
                    "    S.id_Agencia" +
                    "    S.Autor_Examen" +


                    "\n" +
                    "    DS.id_DetalleSatelite," +
                    "    DS.Velocidad_Max," +
                    "    DS.Combustible," +
                    "    DS.Vida_Util," +
                    "    DS.Temperatura_Max" +
                    "    DS.Autor_Examen" +

                    "\n" +
                    "FROM SATELITES S" +
                    "\n" +
                    "INNER JOIN DETALLE_SATELITES DS" +
                    "ON S.ID = DS.id_Satelite" +
                    "\n" +
                    "ORDER BY S.id_Satelite;";


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

    public void findDetalleSateliteBySatelite(int id_Satelite) {
        try {

            motorSQL.connect();

            motorSQL.prepare(SQL_DETALLE_SATELITE);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void update(int id, Satelite satelite) {
        try{

            motorSQL.connect();

            motorSQL.prepare(SQL_UPDATE);
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
                    "ACTUALIZADOS: " +
                            rows);

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }
    }




    @Override
    public void delete(int id) {

    }

    @Override
    public Satelite find(int id) {
        Satelite satelite = null;
        try{

            motorSQL.connect();

            motorSQL.prepare(SQL_FIND);

            motorSQL.getPs().setInt(
                    1,
                    id);

            ResultSet rs =
                    motorSQL.executeQuery();

            if(rs.next()){

                satelite =
                        mapSatelite(rs);
            }

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }

        return satelite;
    }

    @Override
    public ArrayList<Satelite> findAll() {
        ArrayList<Satelite> satelites =
                new ArrayList<>();

        try{

            motorSQL.connect();

            motorSQL.prepare(SQL_FIND_ALL);

            ResultSet rs =
                    motorSQL.executeQuery();

            while(rs.next()){

                satelites.add(
                        mapSatelite(rs));
            }

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }

        return satelites;
    }


    private Satelite mapSatelite(
            ResultSet rs)
            throws Exception {

        Satelite satelite =
                new Satelite();

        satelite.setId_Satelite(
                rs.getInt("id_Satelite"));

        satelite.setNombre_Satelite(
                rs.getString("Nombre_Satelite"));

        satelite.setOrbita(
                rs.getString("Orbita"));

        satelite.setPeso(
                rs.getInt("Peso"));

        satelite.setCoste(
                rs.getInt("Coste"));

        satelite.setActivo(
                rs.getString("Activo"));
        satelite.setFecha_Lanzamiento(
                rs.getString("Fecha_Lanzamiento"));
        satelite.setId_Agencia(
                rs.getInt("id_Agencia"));

        return satelite;
    }
}
