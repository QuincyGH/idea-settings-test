package com.qgh.idea_settings_test.company.controller;

import com.qgh.idea_settings_test.company.entity.Company;
import com.qgh.idea_settings_test.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("获取企业id为 " + id + " 的信息......");
        Company company = companyService.getCompanyById(id);
        System.out.println(company);
        return company.toString();
    }
}
