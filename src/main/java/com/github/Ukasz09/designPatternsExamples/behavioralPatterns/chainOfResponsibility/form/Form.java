package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form;

import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers.EmailHandler;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers.NameHandler;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers.VerificationCodeHandler;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers.ZipCodeHandler;

public class Form implements IForm {
    private String name;
    private String verificationCode;
    private String email;
    private String zipCode;

    //----------------------------------------------------------------------------------------------------------------//
    Form() {
        //to reduce visibility
    }

    //----------------------------------------------------------------------------------------------------------------//
    public boolean IsValid() {
        return new NameHandler(new EmailHandler(new ZipCodeHandler(new VerificationCodeHandler()))).handle(this);
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void setName(String name) {
        this.name = name;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getVerificationCode() {
        return verificationCode;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getZipCode() {
        return zipCode;
    }
}
