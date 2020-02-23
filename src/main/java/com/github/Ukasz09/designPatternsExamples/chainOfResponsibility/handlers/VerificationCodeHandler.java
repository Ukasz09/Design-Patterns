package com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.handlers;

import com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.form.IForm;

public class VerificationCodeHandler extends BaseFormHandler {
    private static final String DEFAULT_REGEX = "^[0-9]{4,8}$";

    private String regex = DEFAULT_REGEX;

    //----------------------------------------------------------------------------------------------------------------//
    public VerificationCodeHandler() {
        super();
    }

    public VerificationCodeHandler(IFormHandler nextHandler) {
        super(nextHandler);
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public boolean handle(IForm form) {
        String verificationCode = form.getVerificationCode();
        if ((verificationCode != null) && verificationCode.matches(regex))
            return nextHandler == null ? true : nextHandler.handle(form);
        return false;
    }
}

