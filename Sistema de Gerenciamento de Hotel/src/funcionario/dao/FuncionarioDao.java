/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario.dao;

import funcionario.bean.FuncionarioBean;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import util.BaseDao;
import util.Conexao;

/**
 *
 * @author fbin
 */
public class FuncionarioDao extends BaseDao<FuncionarioBean> {
    private EntityManager em;

    public FuncionarioDao() {
        em = Conexao.getEntityManager();
    }
    public List<FuncionarioBean> pesquisarPorCodigo(Integer codigo){
        String jpql = "SELECT f FROM FuncionarioBean f "+
         "WHERE f.codigo = ?1";
         TypedQuery<FuncionarioBean> query
                = em.createQuery(jpql, FuncionarioBean.class);
         query.setParameter(1, codigo);
        return query.getResultList();
    }
    
    public List<FuncionarioBean> pesquisarPorNome(String nome){
        String jpql = "SELECT f FROM FuncionarioBean f "+
         "WHERE f.nome like ?1";
         TypedQuery<FuncionarioBean> query
                = em.createQuery(jpql, FuncionarioBean.class);
        query.setParameter(1, nome+"%");
        return query.getResultList();
    }
}
