package com.dtcc.recon.service;

import com.dtcc.recon.repository.BrokerRecordRepo;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.dtcc.recon.entity.BrokerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class SaveFIle {
    @Autowired
    BrokerRecordRepo data ;
    public String saveRecordFromFile(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        String status;
        if (fileName != null && fileName.endsWith(".csv")) {
            status = saveRecordFromCSV(file);
//        } else if (fileName != null && fileName.endsWith(".json")) {
//            return saveRecordFromJSON(file);
        }
        else {
            status = "unSupported File!!";
            throw new IllegalArgumentException("Unsupported file type");
        }
        return  status;
    }

    private String saveRecordFromCSV(MultipartFile file) throws IOException {
        String status ="";
//        BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
             CSVReader csvReader = new CSVReader(reader)) {
            BrokerRecord brokerRecord = new BrokerRecord();
            String[] line;
            while ((line = csvReader.readNext()) != null) {

                brokerRecord.setTradeId(Integer.parseInt(line[0]));
                brokerRecord.setCost(Integer.parseInt(line[1]));
                brokerRecord.setName(line[2]);

                data.save(brokerRecord);
                status = "Successfully file saved to database!";
            }
        }
        catch (CsvValidationException e) {
            status = "File upload to database unSuccesfull";
            throw new IOException("Failed to parse CSV file", e);

        }

        return status;


    }

}