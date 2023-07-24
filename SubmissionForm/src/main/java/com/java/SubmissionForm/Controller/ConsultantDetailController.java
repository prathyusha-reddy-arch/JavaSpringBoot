package com.java.SubmissionForm.Controller;

import com.java.SubmissionForm.Entity.ConsultantDetail;
import com.java.SubmissionForm.Service.IConsultantDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consultants")
public class ConsultantDetailController {

    @Autowired
    private IConsultantDetailService service;

    @GetMapping
    public List<ConsultantDetail> getAllConsultants(){
       return service.getAll();
    }

}
