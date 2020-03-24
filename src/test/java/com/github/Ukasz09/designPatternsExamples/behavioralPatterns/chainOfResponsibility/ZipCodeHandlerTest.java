package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility;

import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form.FormBuilder;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form.IForm;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers.ZipCodeHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZipCodeHandlerTest {
    @Test
    void whenCorrectZipCodeThenValid() {
        ZipCodeHandler handler = new ZipCodeHandler();
        IForm form = FormBuilder.aForm().withZipCode("23-123").build();
        IForm form2 = FormBuilder.aForm().withZipCode("00-0001").build();
        assertTrue(handler.handle(form));
        assertTrue(handler.handle(form2));
    }

    @Test
    void whenNoHyphenInZipCodeThenInvalid() {
        ZipCodeHandler handler = new ZipCodeHandler();
        IForm form = FormBuilder.aForm().withZipCode("23 123").build();
        IForm form2 = FormBuilder.aForm().withZipCode("23123").build();
        assertFalse(handler.handle(form));
        assertFalse(handler.handle(form2));
    }


    @Test
    void whenDigitsQtyLowerThenLowestInZipCodeThenInvalid() {
        ZipCodeHandler handler = new ZipCodeHandler();
        IForm form = FormBuilder.aForm().withZipCode("3-123").build();
        assertFalse(handler.handle(form));
    }

    @Test
    void whenDigitsQtyBiggerThenBiggestInZipCodeThenInvalid() {
        ZipCodeHandler handler = new ZipCodeHandler();
        IForm form = FormBuilder.aForm().withZipCode("3112414-123").build();
        assertFalse(handler.handle(form));
    }

    @Test
    void whenLetterInZipCodeThenInvalid() {
        ZipCodeHandler handler = new ZipCodeHandler();
        IForm form = FormBuilder.aForm().withZipCode("41a-12s").build();
        assertFalse(handler.handle(form));
    }
}
