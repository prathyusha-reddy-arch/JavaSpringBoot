package com.java.SubmissionForm.Service;

import com.java.SubmissionForm.Model.SubmissionForm;
import com.java.SubmissionForm.Repository.SubmissionFormRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.HashMap;

import static org.mockito.Mockito.when;

public class SubmissionServiceImplTest {


    SubmissionServiceImpl submissionService;
    SubmissionForm dto;


    SubmissionFormRepositoryImpl repo;

    @BeforeEach
    public void setup(){
        repo= new SubmissionFormRepositoryImpl();
        dto = getSubmissionForm("123","prathyusha","07/11/2023","tejan",78,"Hari","Java","Gopi");
        repo.s = new HashMap<String,SubmissionForm>() ;
        repo. s.put(dto.getId(),dto);
    }

    public static SubmissionForm getSubmissionForm(String id, String consultantName, String submissionDate, String leadName, int rate, String technology, String vendorName, String salesPersonName ) {
        SubmissionForm sform = new SubmissionForm();
        sform.setId(id);
        sform.setConsultantName(consultantName);
        sform.setSubmissionDate(submissionDate);
        sform.setLeadName(leadName);
        sform.setRate(rate);
        sform.setTechnology(technology);
        sform.setVendorName(vendorName);
        sform.setSalesPersonName(salesPersonName);

        return sform;
    }

    @Test
    public void testGetSubmission(){
        SubmissionForm sform=getSubmissionForm("1234","Swathi","07/11/2023","Kranthi",78,"Hari","Java","Gopi");
      SubmissionForm s= submissionService.getSubmission("1234");
        Assertions.assertNotNull(s);
    }
}
