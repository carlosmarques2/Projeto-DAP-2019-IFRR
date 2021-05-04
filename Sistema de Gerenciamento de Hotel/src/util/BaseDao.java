/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author TADS
 */
public class BaseDao<T> {

    private EntityManager em;

    public BaseDao() {
        em = Conexao.getEntityManager();
    }

    public T inserir(T obj) {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        return obj;
    }

    public T alterar(T obj) {
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        return obj;
    }

    public T inserirOuAlterar(T obj) {
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        return obj;
    }

    public Boolean excluir(Integer codigo) {
        em.getTransaction().begin();
        T obj = em.find(getTypeClass(), codigo);
        em.remove(obj);
        em.getTransaction().commit();
        return true;
    }

    public T selecionar(Integer codigo){
         return em.find(getTypeClass(), codigo); 
    }
    
    public List<T> listar() {
        String jpql = "FROM "+getTypeClass().getName();
        TypedQuery<T> query
                = em.createQuery(jpql, getTypeClass());
        List<T> objs = query.getResultList();
        return objs;
    }

    public Class<T> getTypeClass() {
        Class<T> classe = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return classe;
    }
}
