package com.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value="/userlogin", method = RequestMethod.GET)
    public String showLoginPage(){
        return "login";
    }

}
