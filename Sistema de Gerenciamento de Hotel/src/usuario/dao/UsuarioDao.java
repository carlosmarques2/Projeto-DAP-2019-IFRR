/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import usuario.bean.UsuarioBean;
import util.BaseDao;
import util.Conexao;

/**
 *
 * @author TADS
 */
public class UsuarioDao extends BaseDao<UsuarioBean>{
      private EntityManager em;

    public UsuarioDao() {
        em = Conexao.getEntityManager();
    }
    
    public List<UsuarioBean> logar(String login){
        String jpql = "SELECT u FROM UsuarioBean u "+
         "WHERE u.login LIKE ?1";
         TypedQuery<UsuarioBean> query
                = em.createQuery(jpql, UsuarioBean.class);
         query.setParameter(1, login);
        return query.getResultList();
    }   
}
