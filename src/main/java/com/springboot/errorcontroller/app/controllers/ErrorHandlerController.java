package com.springboot.errorcontroller.app.controllers;

import com.springboot.errorcontroller.app.errors.UserNoFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ErrorHandlerController {
    @ExceptionHandler(ArithmeticException.class)
    public String arithmeticError(ArithmeticException ex, Model model){
        model.addAttribute("error", "ArithmeticException");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());

        return "error/generic";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String numberFormatError(NumberFormatException ex, Model model){
        model.addAttribute("error", "Error: Invalid Format Number");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());

        return "error/number-format-error";

    }

    @ExceptionHandler(UserNoFoundException.class)
    public String userNoFoundError(UserNoFoundException ex, Model model){
        model.addAttribute("error", "Error: Invalid User");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());

        return "error/generic";

    }

}
