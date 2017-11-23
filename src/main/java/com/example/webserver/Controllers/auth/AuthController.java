package com.example.webserver.Controllers.auth;

import com.example.webserver.Database.entity.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alex Bukhmiller on 20.11.2017.
 */
@RestController
@RequestMapping("/test")
public class AuthController {

    @RequestMapping("/1")
    @ResponseBody
    public LoginData getString(){
        return getMockLoginData();

    }

    public LoginData getMockLoginData() {
        LoginData login = new LoginData();
        login.setName("Ivan");
        login.setPassword("qwerty");
        return login;
    }
}
