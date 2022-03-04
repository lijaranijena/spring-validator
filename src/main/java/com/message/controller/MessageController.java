package com.message.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@RestController
@Validated
public class MessageController {

    @GetMapping("/message")
    public String getMessage(@Pattern( regexp = "^//d{10}$" , message = "mobile number should be 10 digit") @RequestParam String mobileNo){
        return "otp sent successfully";
    }
}
