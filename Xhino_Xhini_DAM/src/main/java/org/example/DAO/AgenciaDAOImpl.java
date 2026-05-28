package org.example.DAO;
import org.example.beans.Agencia;

import java.sql.ResultSet;
import java.util.ArrayList;

public class AgenciaDAOImpl
        extends AbstractDAO<Agencia>{





















    public AgenciaDAOImpl(
            MotorSQL motorSQL) {

        super(motorSQL);
    }
    @Override
    public void add(Agencia object) {

    }

    @Override
    public void update(int id, Agencia object) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Agencia find(int id) {
        return null;
    }

    @Override
    public ArrayList<Agencia> findAll() {
        return null;
    }
}
