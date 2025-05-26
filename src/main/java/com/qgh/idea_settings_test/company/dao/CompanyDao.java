package com.qgh.idea_settings_test.company.dao;

import com.qgh.idea_settings_test.company.entity.Company;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDao {
    public Company getCompanyById(int id) {
        Company company = new Company();
        company.setId(id);
        company.setName("测试数据");
        company.setProvince("四川");
        company.setCity("成都");
        company.setAddress("四川省成都市武侯区玉林街道玉林北街1号附7号");
        company.setHomePage("https://www.chinapost.com.cn/");
        company.setPhone("11185");
        return company;
    }
}
