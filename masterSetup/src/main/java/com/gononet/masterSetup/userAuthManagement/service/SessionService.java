/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gononet.masterSetup.userAuthManagement.service;

import java.util.UUID;
import javax.servlet.http.HttpSession;
import com.gononet.masterSetup.app.constant.KEY;
import com.gononet.masterSetup.app.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tonmoy
 */
@Component
public class SessionService {

    @Autowired
    HttpSession session;

}
