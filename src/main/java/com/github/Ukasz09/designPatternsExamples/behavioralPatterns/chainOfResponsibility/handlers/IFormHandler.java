package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers;

import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form.IForm;

public interface IFormHandler {
    boolean handle(IForm form);

    void setNext(IFormHandler handler);
}
