package com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.form;

/**
 * Builder pattern for form
 */
public final class FormBuilder {
    private String name;
    private String verificationCode;
    private String email;
    private String zipCode;

    //----------------------------------------------------------------------------------------------------------------//
    private FormBuilder() {
    }

    //----------------------------------------------------------------------------------------------------------------//
    public static FormBuilder aForm() {
        return new FormBuilder();
    }

    public FormBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public FormBuilder withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    public FormBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public FormBuilder withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Form build() {
        Form form = new Form();
        form.setName(name);
        form.setVerificationCode(verificationCode);
        form.setEmail(email);
        form.setZipCode(zipCode);
        return form;
    }
}
