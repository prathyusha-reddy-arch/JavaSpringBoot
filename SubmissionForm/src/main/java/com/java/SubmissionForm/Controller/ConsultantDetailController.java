package com.java.SubmissionForm.Controller;

import com.java.SubmissionForm.Entity.ConsultantDetail;
import com.java.SubmissionForm.Entity.LeadDetail;
import com.java.SubmissionForm.Service.IConsultantDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consultants")
public class ConsultantDetailController {

    @Autowired
    private IConsultantDetailService service;

    @GetMapping
    public List<ConsultantDetail> getAllConsultants(){
       return service.getAll();
    }

    @RequestMapping("/id/{id}")
    public Optional<ConsultantDetail> getLeadById(@PathVariable long id)
    {
        return service.getConsultantByID(id);
    }

    @PostMapping("/addConsultant")
    public ConsultantDetail addLeadDetail(@RequestBody ConsultantDetail consultantDetail){
        return service.addConsultantDetails(consultantDetail);
    }

    @PutMapping("/updateLead")
    public ConsultantDetail updateLeadDetail(@RequestBody ConsultantDetail consultantDetail){
        return service.updateConsultantDetails(consultantDetail);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLead(@PathVariable long id){
        service.deleteConsultant(id);
    }




}
