package com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.handlers;

import com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.form.IForm;

public class EmailHandler extends BaseFormHandler {
    private static final String DEFAULT_REGEX = "^(\\S+)@(\\S+)\\.[A-Za-z]{2,}$";
    private String regex = DEFAULT_REGEX;

    //----------------------------------------------------------------------------------------------------------------//
    public EmailHandler() {
        super();
    }

    public EmailHandler(IFormHandler nextHandler) {
        super(nextHandler);
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public boolean handle(IForm form) {
        String email = form.getEmail();
        if ((email != null) && email.matches(regex))
            return nextHandler == null ? true : nextHandler.handle(form);
        return false;
    }
}
