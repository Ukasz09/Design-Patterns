package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers;

import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form.IForm;

public class ZipCodeHandler extends BaseFormHandler {
    private static final String DEFAULT_REGEX = "[0-9]{2,6}[-][0-9]{2,6}";

    private String regex = DEFAULT_REGEX;

    //----------------------------------------------------------------------------------------------------------------//
    public ZipCodeHandler() {
        super();
    }

    public ZipCodeHandler(IFormHandler nextHandler) {
        super(nextHandler);
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public boolean handle(IForm form) {
        String zipCode = form.getZipCode();
        if ((zipCode != null) && zipCode.matches(regex))
            return nextHandler == null || nextHandler.handle(form);
        return false;
    }
}
