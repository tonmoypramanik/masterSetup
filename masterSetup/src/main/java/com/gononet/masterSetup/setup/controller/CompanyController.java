/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gononet.masterSetup.setup.controller;

import com.gononet.masterSetup.app.config.AppProperty;
import com.gononet.masterSetup.app.config.AppResponse;
import com.gononet.masterSetup.app.util.AppUtil;
import com.gononet.masterSetup.setup.model.Company;
import com.gononet.masterSetup.setup.repo.CompanyRepo;
import com.gononet.masterSetup.setup.service.CompanyService;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tonmoy Pramanik
 */
@RestController
@RequestMapping("/setup/company")
public class CompanyController extends AppProperty {
    @Autowired CompanyRepo companyRepo;
    
    @Autowired CompanyService companyService;

    @RequestMapping(value = "/get/all", method = RequestMethod.POST)
    public AppResponse<List<Company>> getAll() {
        List<Company> list = companyService.findAll();
        if (!list.isEmpty()) {
            return AppResponse.build(HttpStatus.OK).body(list);
        } else {
            return AppResponse.build(HttpStatus.NO_CONTENT).message("No company found");
        }
    }
    
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AppResponse<Company> get(@PathVariable ("id") UUID companyId) {
        Company company = companyRepo.findById(companyId);
        if (company != null) {
            return AppResponse.build(HttpStatus.OK).body(company);
        } else {
            return AppResponse.build(HttpStatus.NOT_FOUND).message(" Company not found");
        }

    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public AppResponse<Object> update(@RequestBody Company company) {

        try {
            
            return AppResponse.build(HttpStatus.OK).body(companyService.update(company));
        } catch (Exception ex) {
            return AppResponse.build(HttpStatus.INTERNAL_SERVER_ERROR).message(ex.getMessage());
        }
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public AppResponse<Object> save(@RequestBody Company company) {

        try {
            
            return AppResponse.build(HttpStatus.OK).body(companyService.save(company));
        } 
        catch (Exception ex) {
            return AppResponse.build(HttpStatus.INTERNAL_SERVER_ERROR).message(ex.getMessage());
        }
    }
    
}
