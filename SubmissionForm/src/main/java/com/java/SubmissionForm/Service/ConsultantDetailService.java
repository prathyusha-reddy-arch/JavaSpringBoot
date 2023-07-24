package com.java.SubmissionForm.Service;

import com.java.SubmissionForm.Entity.ConsultantDetail;
import com.java.SubmissionForm.Repository.IConsultantDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultantDetailService implements IConsultantDetailService {

    @Autowired
    private IConsultantDetailRepository repo;
    public List<ConsultantDetail> getAll(){
       return repo.findAll();
    }






}
