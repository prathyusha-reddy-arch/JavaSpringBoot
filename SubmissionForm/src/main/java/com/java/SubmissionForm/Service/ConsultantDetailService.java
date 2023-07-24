package com.java.SubmissionForm.Service;

import com.java.SubmissionForm.Entity.ConsultantDetail;
import com.java.SubmissionForm.Entity.LeadDetail;
import com.java.SubmissionForm.Repository.IConsultantDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultantDetailService implements IConsultantDetailService {

    @Autowired
    private IConsultantDetailRepository repo;
    public List<ConsultantDetail> getAll(){
       return repo.findAll();
    }

    @Override
    public Optional<ConsultantDetail> getConsultantByID(Long id) {
        return repo.findById(id);
    }

    public ConsultantDetail addConsultantDetails(ConsultantDetail consultantDetail) {
        return repo.save(consultantDetail);
    }

    @Override
    public ConsultantDetail updateConsultantDetails(ConsultantDetail consultantDetail) {
        Optional<ConsultantDetail> existingConsultantDetail = repo.findById(consultantDetail.getId());
        if (existingConsultantDetail.isPresent()) {
            ConsultantDetail updatedLeadDetail = existingConsultantDetail.get();
            updatedLeadDetail.setFirstName(consultantDetail.getFirstName());
            updatedLeadDetail.setLastName(consultantDetail.getLastName());
            updatedLeadDetail.setEmail(consultantDetail.getEmail());
            updatedLeadDetail.setPhoneNumber(consultantDetail.getPhoneNumber());

            return repo.save(consultantDetail);
        }
        return null;
    }

    @Override
    public void deleteConsultant(long id) {

        repo.deleteById(id);
    }


}
