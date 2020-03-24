package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility;

import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form.FormBuilder;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form.IForm;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers.VerificationCodeHandler;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class VerificationCodeHandlerTest {

    @Test
    void whenDigitsQtyLowerThanLowestThenInvalid() {
        VerificationCodeHandler nameHandler = new VerificationCodeHandler();
        IForm form = FormBuilder.aForm().withVerificationCode("12").build();
        assertFalse(nameHandler.handle(form));
    }

    @Test
    void whenDigitsQtyBiggerThanBiggestThenInvalid() {
        VerificationCodeHandler nameHandler = new VerificationCodeHandler();
        IForm form = FormBuilder.aForm().withVerificationCode("121233333").build();
        assertFalse(nameHandler.handle(form));
    }

    @Test
    void whenOnlyNumberWithProperQtyThenValid() {
        VerificationCodeHandler nameHandler = new VerificationCodeHandler();
        IForm form = FormBuilder.aForm().withVerificationCode("0101").build();
        assertTrue(nameHandler.handle(form));
    }

    @Test
    void whenLetterThenInvalid() {
        VerificationCodeHandler nameHandler = new VerificationCodeHandler();
        IForm form = FormBuilder.aForm().withVerificationCode("010s1").build();
        assertFalse(nameHandler.handle(form));
    }
}
