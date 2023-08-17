package com.java.SubmissionForm.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="consultant_detail")
public class ConsultantDetail {

    @Column(name="consultant_id")
    @Id
    private long id;
    private String leadId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="lead_id")
    private LeadDetail leadDetail;


}
