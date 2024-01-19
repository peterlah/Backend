package com.sample.backend.service;

import org.springframework.stereotype.Service;

import com.sample.backend.model.SampleModel;

@Service
public class SampleService {
    
    public SampleModel getSampleMessage() {
        return new SampleModel("This Message is from JAVA API Server");
    }
}
