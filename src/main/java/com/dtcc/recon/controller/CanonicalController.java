package com.dtcc.recon.controller;

import com.dtcc.recon.entity.BrokerRecord;
import com.dtcc.recon.repository.BrokerRecordRepo;
import com.dtcc.recon.service.SaveFIle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/canonical")
public class CanonicalController {
    @Autowired
    private BrokerRecordRepo brokerRecord;
    @Autowired
    private SaveFIle saveService;

    @PostMapping("/save")
    public ResponseEntity<String>saveFile(@RequestParam("file") MultipartFile multiPartFile) throws IOException {
            String status = saveService.saveRecordFromFile(multiPartFile);
            if(status=="Successfully file saved to database!")
                return new ResponseEntity<>(status,HttpStatus.OK);
            else
                return new ResponseEntity<>(status,HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
