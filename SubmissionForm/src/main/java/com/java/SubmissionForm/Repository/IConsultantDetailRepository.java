package com.java.SubmissionForm.Repository;

import com.java.SubmissionForm.Entity.ConsultantDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsultantDetailRepository extends JpaRepository<ConsultantDetail, String> {
}
