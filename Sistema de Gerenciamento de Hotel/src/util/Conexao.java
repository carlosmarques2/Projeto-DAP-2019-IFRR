/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author TADS
 */
public class Conexao {

    private static EntityManagerFactory emf = Persistence.
            createEntityManagerFactory("jpa");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
