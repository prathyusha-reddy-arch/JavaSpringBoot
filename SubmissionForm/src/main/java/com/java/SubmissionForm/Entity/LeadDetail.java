package com.java.SubmissionForm.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="lead_detail")
@Data
public class LeadDetail {

    @Id
    private long leadId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String emailAddress;

    @Column(name="phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy="leadDetail", cascade = CascadeType.ALL)
    private List<ConsultantDetail> consultantList;
}
