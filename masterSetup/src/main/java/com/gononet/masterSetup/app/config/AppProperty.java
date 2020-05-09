/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gononet.masterSetup.app.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.gononet.masterSetup.userAuthManagement.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author sarker
 */
public class AppProperty {
    
    @Autowired
    SessionService sessionService;
    
    @ModelAttribute
    public void addCommonObjects(Model model, HttpServletRequest request, HttpServletResponse resp,  HttpSession httpSession){
        model.addAttribute("BASE_URL", request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/");
        model.addAttribute("BASE_URL_XPORT", request.getScheme() + "://" + request.getServerName() + request.getContextPath() + "/");
        model.addAttribute("SERVER_PORT", request.getServerPort());
        model.addAttribute("STATIC_RES", request.getContextPath() + "/resources");        
        model.addAttribute("APP", request.getContextPath());
        model.addAttribute("APP_NAME", "masterSetup");
        model.addAttribute("APP_VERSION", "1.0.0" );
        model.addAttribute("SCRIPT_VERSION", "1.0.0" ); // should app version. please change before release
       
    }
}
