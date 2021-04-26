package com.сalculation.dao;

import com.сalculation.entity.Coefficients;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoefficientDAOImpl implements CoefficientDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveCoefficient(Coefficients coefficients) {
        Session session = sessionFactory.getCurrentSession();
        session.save(coefficients);
    }
}
