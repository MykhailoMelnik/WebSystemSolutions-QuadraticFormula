package com.сalculation.service;

import com.сalculation.dao.CoefficientDAO;
import com.сalculation.entity.Coefficients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CoefficientServiceImpl implements CoefficientService{

    @Autowired
    private CoefficientDAO coefficientDAO;

    @Override
    @Transactional
    public void saveCoefficient(Coefficients coefficients) {
        coefficientDAO.saveCoefficient(coefficients);
    }
}
