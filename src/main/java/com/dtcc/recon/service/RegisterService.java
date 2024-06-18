package com.dtcc.recon.service;

import com.dtcc.recon.entity.ClientProperties;
import com.dtcc.recon.repository.ClientPropertiesRepo;
import com.dtcc.recon.web.dto.ClientPropertiesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;
import java.util.List;

@Service
public class RegisterService {
    @Autowired
    ClientPropertiesRepo clientRepo ;
        public String saveProfile(ClientPropertiesDto clientPropertiesDto) {
            ClientProperties clientProperties = new ClientProperties();
            clientProperties.setUserName(clientPropertiesDto.getUserName());
            clientProperties.setPassword(clientPropertiesDto.getPassword());
            clientProperties.setBrokerFirm(clientPropertiesDto.getBrokerFirm());
            clientProperties.setImage(clientPropertiesDto.getImage());
            clientRepo.save(clientProperties);
            return "User profile uploaded succesfully!";
        }
//        public ClientProperties GetProfile(long userId){
//            List<Long> array = clientRepo.findAllById(userId);
//        }
}
