package com.example.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;

@RestController
public class Controller {

    @Autowired
    @Qualifier("AWSDataProcessorImpl")
    private DataProcessor awsDataProcessor;

    @Autowired
    @Qualifier("defaultDataProcessorImpl")
    private DataProcessor defaultDataProcessor;

    @GetMapping("/{message}")
    public String message(@PathVariable String message) {
        if(message.equals("AWS")) {
            return awsDataProcessor.process(message);
        }else {
            return defaultDataProcessor.process(message);
        }
    }


}
