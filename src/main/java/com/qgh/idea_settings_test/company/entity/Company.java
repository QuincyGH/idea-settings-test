package com.qgh.idea_settings_test.company.entity;

import lombok.Data;

/**
 * 企业基础类
 */
@Data
public class Company {
    public int Id;
    public String Name;
    public String Province;
    public String City;
    public String Address;
    public String HomePage;
    public String Phone;
}
