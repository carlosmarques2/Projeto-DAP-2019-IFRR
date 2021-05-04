/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto.dao;

import cliente.bean.ClienteBean;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import quarto.bean.QuartoBean;
import util.BaseDao;
import util.Conexao;

/**
 *
 * @author carlos
 */
public class QuartoDao extends BaseDao<QuartoBean> {
    private EntityManager em;

    public QuartoDao() {
        em = Conexao.getEntityManager();
    }
    
    public List<QuartoBean> pesquisarPorCodigo(Integer codigo){
        String jpql = "SELECT q FROM QuartoBean q "+
         "WHERE q.codigo = ?1";
         TypedQuery<QuartoBean> query
                = em.createQuery(jpql, QuartoBean.class);
         query.setParameter(1, codigo);
        return query.getResultList();
    }
    
    public List<QuartoBean> pesquisarPorNumDoQuarto(String num){
        String jpql = "SELECT q FROM QuartoBean q "+
         "WHERE q.numeroDoQuarto like ?1";
         TypedQuery<QuartoBean> query
                = em.createQuery(jpql, QuartoBean.class);
        query.setParameter(1, num+"%");
        return query.getResultList();
    }
}
