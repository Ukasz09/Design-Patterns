package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers;

public abstract class BaseFormHandler implements IFormHandler {
    protected IFormHandler nextHandler;

    //----------------------------------------------------------------------------------------------------------------//
    public BaseFormHandler() {
        this(null);
    }

    public BaseFormHandler(IFormHandler nextHandler) {
        setNext(nextHandler);
    }

    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public void setNext(IFormHandler handler) {
        this.nextHandler = handler;
    }

    protected boolean hasNextHandler() {
        return nextHandler != null;
    }
}
