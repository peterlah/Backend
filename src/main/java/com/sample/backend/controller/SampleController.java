package com.sample.backend.controller;

import org.springframework.web.bind.annotation.RestController;
import com.sample.backend.model.SampleModel;
import com.sample.backend.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SampleController {
    
    @Autowired
    private SampleService sampleService;

    @GetMapping("/message")
    public ResponseEntity<SampleModel> getMessage() {
        SampleModel sampleModel = sampleService.getSampleMessage();
        return ResponseEntity.ok(sampleModel);
    }
    
}
