package com.qgh.idea_settings_test.company.service;

import com.qgh.idea_settings_test.company.dao.CompanyDao;
import com.qgh.idea_settings_test.company.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    private CompanyDao companyDao;

    public Company getCompanyById(int id) {
        return companyDao.getCompanyById(id);
    }
}
