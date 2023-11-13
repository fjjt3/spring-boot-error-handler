package com.springboot.errorcontroller.app.controllers;

import com.springboot.errorcontroller.app.errors.UserNoFoundException;
import com.springboot.errorcontroller.app.models.domain.User;
import com.springboot.errorcontroller.app.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppController {

    private UserService userService;
    @GetMapping("/index")
    public String index(){
    Integer valor = 100/0;
    // Integer valor = Integer.parseInt("10jajajja");
        return "index";
    }

    @GetMapping("/see/{id}")
    public String see(@PathVariable Integer id, Model model){
        User user = userService.getUserById(id);

        if(user == null) {
            throw new UserNoFoundException(id.toString());
        }
        model.addAttribute("user",user);
        model.addAttribute("title", "User Details: ".concat(user.getName()));
        return "see";
    }

}
