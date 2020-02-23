package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form;

public interface IForm {
    String getName();

    String getEmail();

    String getZipCode();

    String getVerificationCode();

    boolean IsValid();
}
