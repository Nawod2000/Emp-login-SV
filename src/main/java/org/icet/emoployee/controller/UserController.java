package org.icet.emoployee.controller;

import org.icet.emoployee.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("auther/login")
    public boolean login(@RequestBody User user){
        return false;
    }

    @PostMapping("register")
    public String register(@RequestBody User user){
        return "reister";
    }
}
