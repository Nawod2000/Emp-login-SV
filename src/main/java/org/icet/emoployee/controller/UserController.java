package org.icet.emoployee.controller;

import lombok.RequiredArgsConstructor;
import org.icet.emoployee.dto.User;
import org.icet.emoployee.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    final UserService service;

    @PostMapping("auther/login")
    public boolean login(@RequestBody User user){
        return service.login(user);
    }

    @PostMapping("register")
    public String register(@RequestBody User user){
        return service.register(user);
    }
}
