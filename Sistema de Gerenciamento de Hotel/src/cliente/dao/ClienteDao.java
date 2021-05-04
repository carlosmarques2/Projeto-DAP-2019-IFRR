/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.dao;

import cliente.bean.ClienteBean;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import util.BaseDao;
import util.Conexao;

/**
 *
 * @author carlos
 */
public class ClienteDao extends BaseDao<ClienteBean> {
    private EntityManager em;

    public ClienteDao() {
        em = Conexao.getEntityManager();
    }
    
    public List<ClienteBean> pesquisarPorCodigo(Integer codigo){
        String jpql = "SELECT c FROM ClienteBean c "+
         "WHERE c.codigo = ?1";
         TypedQuery<ClienteBean> query
                = em.createQuery(jpql, ClienteBean.class);
         query.setParameter(1, codigo);
        return query.getResultList();
    }
    
    public List<ClienteBean> pesquisarPorNome(String nome){
        String jpql = "SELECT c FROM ClienteBean c "+
         "WHERE c.nome like ?1";
         TypedQuery<ClienteBean> query
                = em.createQuery(jpql, ClienteBean.class);
        query.setParameter(1, nome+"%");
        return query.getResultList();
    }
}
