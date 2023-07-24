package com.java.SubmissionForm.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="lead_detail")
@Data
public class LeadDetail {
    @Column(name="lead_id")
    @Id
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String emailAddress;

    @Column(name="phone_number")
    private String phoneNumber;

}
