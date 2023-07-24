package com.java.SubmissionForm.Controller;

import com.java.SubmissionForm.Entity.LeadDetail;
import com.java.SubmissionForm.Service.ILeadDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/leads")
public class LeadDetailController {

    @Autowired
    private ILeadDetailService service;

    @GetMapping
    public List<LeadDetail> getAllLeads(){
        return service.getAllLeads();
    }

    @RequestMapping("/id/{id}")
    public Optional<LeadDetail> getLeadById(@PathVariable  long id)
    {
        return service.getLeadByID(id);
    }

    @PostMapping("/addLead")
    public LeadDetail addLeadDetail(@RequestBody LeadDetail leadDetail){
        return service.addLeadDetails(leadDetail);
    }

  @PutMapping("/updateLead")
  public LeadDetail updateLeadDetail(@RequestBody LeadDetail leadDetail){
        return service.updateLeadDetails(leadDetail);
  }

    @DeleteMapping("/delete/{id}")
    public void deleteLead(@PathVariable long id){
        service.deleteLeadDetail(id);
    }



}
