package com.java.SubmissionForm.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="consultant_detail")
public class ConsultantDetail {

    @Id
    private String consultantId;
    private String leadId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;


}
