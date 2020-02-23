package com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.handlers;

import com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.form.IForm;

public interface IFormHandler {
    boolean handle(IForm form);

    void setNext(IFormHandler handler);
}
