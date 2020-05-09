/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gononet.masterSetup.setup.model;

import java.util.Date;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Tonmoy Pramanik
 */
public class Company {
    @NotNull
    private UUID company_id;

    @NotNull
    @Size(max = 500)
    private String company_name;
    @NotNull
    @Size(max = 250)
    private String business_type;
    @NotNull
    private String tax_id; 
    @NotNull
    private String industry;
    @NotNull
    private Date  date_of_establishment;
    @NotNull
    private String owner_name;
    @NotNull
    private String owner_mobile_no;
    private String owner_ssn;
    private String owner_apartment_no;
    private String owner_street_no;
    private Date owner_date_of_birth;
    private String owner_zip;
    private String owner_city;
    private String owner_country;
    private String owner_email ;
    private UUID created_by;
    private Date created_on;
    private UUID updated_by;
    private Date updated_on;

    public UUID getCompany_id() {
        return company_id;
    }

    public void setCompany_id(UUID company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

    public String getTax_id() {
        return tax_id;
    }

    public void setTax_id(String tax_id) {
        this.tax_id = tax_id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Date getDate_of_establishment() {
        return date_of_establishment;
    }

    public void setDate_of_establishment(Date date_of_establishment) {
        this.date_of_establishment = date_of_establishment;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_mobile_no() {
        return owner_mobile_no;
    }

    public void setOwner_mobile_no(String owner_mobile_no) {
        this.owner_mobile_no = owner_mobile_no;
    }

    public String getOwner_ssn() {
        return owner_ssn;
    }

    public void setOwner_ssn(String owner_ssn) {
        this.owner_ssn = owner_ssn;
    }

    public String getOwner_apartment_no() {
        return owner_apartment_no;
    }

    public void setOwner_apartment_no(String owner_apartment_no) {
        this.owner_apartment_no = owner_apartment_no;
    }

    public String getOwner_street_no() {
        return owner_street_no;
    }

    public void setOwner_street_no(String owner_street_no) {
        this.owner_street_no = owner_street_no;
    }

    public Date getOwner_date_of_birth() {
        return owner_date_of_birth;
    }

    public void setOwner_date_of_birth(Date owner_date_of_birth) {
        this.owner_date_of_birth = owner_date_of_birth;
    }

    public String getOwner_zip() {
        return owner_zip;
    }

    public void setOwner_zip(String owner_zip) {
        this.owner_zip = owner_zip;
    }

    public String getOwner_city() {
        return owner_city;
    }

    public void setOwner_city(String owner_city) {
        this.owner_city = owner_city;
    }

    public String getOwner_country() {
        return owner_country;
    }

    public void setOwner_country(String owner_country) {
        this.owner_country = owner_country;
    }

    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(String owner_email) {
        this.owner_email = owner_email;
    }

    public UUID getCreated_by() {
        return created_by;
    }

    public void setCreated_by(UUID created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public UUID getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(UUID updated_by) {
        this.updated_by = updated_by;
    }

    public Date getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Date updated_on) {
        this.updated_on = updated_on;
    }

}
