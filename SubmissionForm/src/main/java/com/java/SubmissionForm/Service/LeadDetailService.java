package com.java.SubmissionForm.Service;

import com.java.SubmissionForm.Entity.LeadDetail;
import com.java.SubmissionForm.Repository.ILeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeadDetailService implements ILeadDetailService{

    @Autowired
    private ILeadRepository repo;
    @Override
    public List<LeadDetail> getAllLeads() {
        return repo.findAll();
    }

    @Override
    public Optional<LeadDetail> getLeadByID(Long id) {

        return repo.findById(id);
    }

    @Override
    public LeadDetail addLeadDetails(LeadDetail leadDetail) {
        return repo.save(leadDetail);
    }

    @Override
    public LeadDetail updateLeadDetails(LeadDetail leadDetail) {
        return null;
    }


}
