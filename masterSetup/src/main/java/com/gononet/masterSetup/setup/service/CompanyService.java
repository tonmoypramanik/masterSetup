/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gononet.masterSetup.setup.service;

import com.gononet.masterSetup.setup.model.Company;
import com.gononet.masterSetup.setup.repo.CompanyRepo;
import com.gononet.masterSetup.userAuthManagement.service.SessionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tonmoy Pramanik
 */
@Service
public class CompanyService {
    @Autowired CompanyRepo companyRepo;

    @Autowired SessionService sessionService;

    public List<Company> findAll(){
        return companyRepo.findAll();        
    }
    @Transactional(rollbackFor = Exception.class)
    public boolean save(Company company) throws Exception {
         try{
        return companyRepo.save(company);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    @Transactional(rollbackFor = Exception.class)
    public boolean update(Company company) throws Exception {
        try{
        return companyRepo.update(company);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
