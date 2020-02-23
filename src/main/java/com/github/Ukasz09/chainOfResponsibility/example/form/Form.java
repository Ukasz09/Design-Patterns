package com.github.Ukasz09.chainOfResponsibility.example.form;

public class Form implements IForm {
    private String name;
    private String verificationCode;
    private String msg;
    private String email;
    private String zipCode;

    //----------------------------------------------------------------------------------------------------------------//
    Form() {
        //to reduce visibility
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void setName(String name) {
        this.name = name;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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
    public String getMsg() {
        return msg;
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
