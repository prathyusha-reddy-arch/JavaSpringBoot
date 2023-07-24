package com.java.SubmissionForm.Service;

import com.java.SubmissionForm.Entity.LeadDetail;

import java.util.List;
import java.util.Optional;

public interface ILeadDetailService {
    List<LeadDetail> getAllLeads();
    Optional<LeadDetail> getLeadByID(Long id);

    LeadDetail addLeadDetails(LeadDetail leadDetail);

    LeadDetail updateLeadDetails(LeadDetail leadDetail);
}
