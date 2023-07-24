package com.java.SubmissionForm.Service;

import com.java.SubmissionForm.Entity.ConsultantDetail;
import com.java.SubmissionForm.Entity.LeadDetail;

import java.util.List;
import java.util.Optional;

public interface IConsultantDetailService {
    public List<ConsultantDetail> getAll();
    Optional<ConsultantDetail> getConsultantByID(Long id);

    ConsultantDetail addConsultantDetails(ConsultantDetail consultantDetail);

    ConsultantDetail updateConsultantDetails(ConsultantDetail consultantDetail);
    void deleteConsultant(long id);
}
