package com.java.SubmissionForm.Repository;

import com.java.SubmissionForm.Model.SubmissionForm;

import java.util.List;

public interface SubmissionFormRepository {

    SubmissionForm getSubmission(String id);

    List<SubmissionForm > getAll();
    SubmissionForm  addSubmission(SubmissionForm submission);
    SubmissionForm  updateSubmission(SubmissionForm  submission);
    boolean deleteSubmission(String name);
}
