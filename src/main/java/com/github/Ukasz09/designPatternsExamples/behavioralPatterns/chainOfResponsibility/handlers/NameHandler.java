package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers;

import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form.IForm;

public class NameHandler extends BaseFormHandler {
    private static final String DEFAULT_NAME_REGEX = "[a-zA-Z]{2,}+[- '/a-zA-Z]*";

    private String regex = DEFAULT_NAME_REGEX;

    //----------------------------------------------------------------------------------------------------------------//
    public NameHandler() {
        super();
    }

    public NameHandler(IFormHandler nextHandler) {
        super(nextHandler);
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public boolean handle(IForm form) {
        String name = form.getName();

        if ((name != null) && name.matches(regex))
            return nextHandler == null || nextHandler.handle(form);
        return false;
    }
}
