package com.example.qualifier;

import org.springframework.stereotype.Service;

@Service("defaultDataProcessorImpl")
public class DefaultDataProcessorImpl implements DataProcessor {

    @Override
    public String process(String message) {
        return "Default Data Processor Executed";
    }
}
