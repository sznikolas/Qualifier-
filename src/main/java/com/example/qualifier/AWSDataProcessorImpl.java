package com.example.qualifier;

import org.springframework.stereotype.Service;

@Service("AWSDataProcessorImpl")
public class AWSDataProcessorImpl implements DataProcessor {

    @Override
    public String process(String message) {
        return "AWS data processor executed";
    }
}
