package org.zyx.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication")
public class AuthController {


    @GetMapping
    public String auth(@RequestParam("username") String username, @RequestParam("password") String password){
        return username + password;
    }

}
