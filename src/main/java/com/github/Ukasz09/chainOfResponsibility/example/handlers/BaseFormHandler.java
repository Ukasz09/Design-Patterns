package com.github.Ukasz09.chainOfResponsibility.example.handlers;

public abstract class BaseFormHandler implements IFormHandler {
    private IFormHandler nextHandler;

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
