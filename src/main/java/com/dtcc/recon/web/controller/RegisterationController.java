package com.dtcc.recon.web.controller;

import com.dtcc.recon.service.RegisterService;
import com.dtcc.recon.web.dto.ClientPropertiesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/auth")
public class RegisterationController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public ResponseEntity<String> registerNewUser(@RequestBody ClientPropertiesDto clientPropertiesDto){
        String message = registerService.saveProfile(clientPropertiesDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
