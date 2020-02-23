package com.github.Ukasz09.chainOfResponsibility.example.handlers;

import com.github.Ukasz09.chainOfResponsibility.example.form.IForm;

public interface IFormHandler {
    boolean handle(IForm form);

    void setNext(IFormHandler handler);
}
