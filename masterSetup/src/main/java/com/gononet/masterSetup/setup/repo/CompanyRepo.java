/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gononet.masterSetup.setup.repo;

import com.gononet.masterSetup.app.model.ModelRepo;
import com.gononet.masterSetup.app.util.AppUtil;
import com.gononet.masterSetup.setup.model.Company;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tonmoy Pramanik
 */
@Repository
public class CompanyRepo implements ModelRepo<Company> {
    @Autowired
    NamedParameterJdbcTemplate nDB;

    @Autowired
    JdbcTemplate db;

    @Autowired
    HttpSession session;
    
    @Override
    public List<Company> findAll()  {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT company_id, company_name, business_type, tax_id, industry, date_of_establishment, owner_name, owner_mobile_no, owner_ssn, owner_apartment_no, owner_street_no, owner_date_of_birth, owner_zip, owner_city, owner_country, owner_email, company_logo, created_by, created_on, updated_by, updated_on ");
        sql.append(" FROM master_setup.g_company ");
        sql.append(" order by company_name ");
        return nDB.query(sql.toString(), new BeanPropertyRowMapper(Company.class));
    }
    @Override
    public Company findById(UUID id) {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT company_id, company_name, business_type, tax_id, industry, date_of_establishment, owner_name, owner_mobile_no, owner_ssn, owner_apartment_no, owner_street_no, owner_date_of_birth, owner_zip, owner_city, owner_country, owner_email, company_logo, created_by, created_on, updated_by, updated_on ");
        sql.append(" FROM master_setup.g_company ");
        sql.append(" WHERE company_id=:company_id::uuid ");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("company_id", id);
       return (Company) nDB.queryForObject(sql.toString(), params, new BeanPropertyRowMapper(Company.class));
    }
    @Override
    public boolean save(Company model) {
        StringBuilder sql = new StringBuilder();

            sql = new StringBuilder();
            sql.append(" INSERT INTO master_setup.g_company( ");
            sql.append(" company_name, business_type, tax_id, industry, date_of_establishment, owner_name, owner_mobile_no, owner_ssn, owner_apartment_no, owner_street_no, owner_date_of_birth, owner_zip, owner_city, owner_country, owner_email, created_by) ");
            sql.append(" VALUES ( ");
            sql.append(" :company_name, :business_type, :tax_id, :industry, :date_of_establishment, :owner_name, :owner_mobile_no, :owner_ssn, :owner_apartment_no, :owner_street_no, :owner_date_of_birth, :owner_zip, :owner_city, :owner_country, :owner_email, :created_by) ");
        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(model);
        return nDB.update(sql.toString(), namedParameters) == 1;
    }
    @Override
    public boolean update(Company model) {

        StringBuilder sql = new StringBuilder();
        sql.append(" UPDATE master_setup.g_company ");
        sql.append(" SET company_name=:company_name, business_type=:business_type, tax_id=:tax_id, industry=:industry ");
        sql.append(" , date_of_establishment=:date_of_establishment, owner_name=:owner_name, owner_mobile_no=:owner_mobile_no ");
        sql.append(" , owner_ssn=:owner_ssn, owner_apartment_no=:owner_apartment_no, owner_street_no=:owner_street_no ");
        sql.append(" , owner_date_of_birth=:owner_date_of_birth, owner_zip=:owner_zip, owner_city=:owner_city ");
        sql.append(" , owner_country=:owner_country, owner_email=:owner_email,  updated_by=:updated_by,updated_on=now() ");
        sql.append(" where company_id=:company_id::uuid ");
        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(model);
        return nDB.update(sql.toString(), namedParameters) == 1;
    }
    @Override
    public boolean exist(Company model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
