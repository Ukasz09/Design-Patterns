package com.github.Ukasz09.chainOfResponsibility.example.handlers;

import com.github.Ukasz09.chainOfResponsibility.example.form.IForm;

public class NameHandler extends BaseFormHandler {
    private static final String DEFAULT_NAME_REGEX = "^[a-zA-Z]+[- '/a-zA-Z]*$";

    private String nameRegex = DEFAULT_NAME_REGEX;

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
        if (name == null)
            return false;
        return name.matches(nameRegex);
    }
}
