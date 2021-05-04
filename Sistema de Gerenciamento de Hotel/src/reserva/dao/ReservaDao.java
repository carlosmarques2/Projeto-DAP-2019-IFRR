/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import reserva.bean.ReservaBean;
import util.BaseDao;
import util.Conexao;

/**
 *
 * @author carlos
 */
public class ReservaDao extends BaseDao<ReservaBean> {
    private EntityManager em;

    public ReservaDao() {
        em = Conexao.getEntityManager();
    }
    
    public List<ReservaBean> pesquisarPorCodigo(Integer codigo){
        String jpql = "SELECT r FROM ReservaBean r "+
         "WHERE r.codigo = ?1";
         TypedQuery<ReservaBean> query
                = em.createQuery(jpql, ReservaBean.class);
         query.setParameter(1, codigo);
        return query.getResultList();
    }
}
