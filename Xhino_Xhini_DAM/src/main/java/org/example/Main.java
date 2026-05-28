package org.example;

import org.example.DAO.MotorFactory;
import org.example.DAO.MotorSQL;
import org.example.DAO.SateliteDAOImpl;
import org.example.beans.Agencia;
import org.example.beans.Satelite;

public class Main {
    public static void main(String[] args){
        MotorSQL motorSQL =
                MotorFactory.create(
                        MotorFactory.POSTGRE
                );

        SateliteDAOImpl sateliteDAO =
                new SateliteDAOImpl(MotorFactory.
                        create(
                                MotorFactory.POSTGRE));


        Satelite satelite1 = new Satelite(6,"pachuca","Luna",50,40000,"Si","14/02/2026",3,"Xhini_Xhino_DAM2");
        sateliteDAO.add(satelite1);
        satelite1.setNombre_Satelite("Pikachu");
        satelite1.setOrbita("Saturno");
        sateliteDAO.update(6,satelite1);
        System.out.println(sateliteDAO.find(3).toString());
        sateliteDAO.findAll();
    }
}
