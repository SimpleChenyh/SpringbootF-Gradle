package com.chenyh.repository;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class BasicNativeSQLQuery {

    @PersistenceContext
    private EntityManager entityManager;


    public Object execNativeSQLReturnSingleResult(String sql) {
        Query query = entityManager.createNativeQuery(sql);
        return query.getSingleResult();
    }

    public List<Object> execNativeSQLReturnListResult(String sql) {
        Query query = entityManager.createNativeQuery(sql);
        return query.getResultList();
    }

}
