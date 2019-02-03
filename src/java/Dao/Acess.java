/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.Test;
import Utils.DbConnection;
import org.hibernate.Session;

/**
 *
 * @author Pradyumna
 */
public class Acess {

    public static boolean save(Test beans) {
        boolean bool = false;
        try {
            Session session = DbConnection.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(beans);
            session.getTransaction().commit();
            bool = true;

        } catch (Exception e) {
            System.out.println(e);
        }

        return bool;

    }
     public void promptUser(){
            
        }
       

}
