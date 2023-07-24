package com.java.SubmissionForm.Repository;

import com.java.SubmissionForm.Entity.LeadDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILeadRepository extends JpaRepository<LeadDetail,Long> {

}
