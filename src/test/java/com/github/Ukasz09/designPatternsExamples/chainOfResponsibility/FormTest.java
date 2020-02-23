package com.github.Ukasz09.designPatternsExamples.chainOfResponsibility;

import com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.form.FormBuilder;
import com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.form.IForm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormTest {

    @Test
    void whenCorrectDataInFormThenTrue() {
        IForm form = FormBuilder.aForm().withName("Janusz").withEmail("janusz@soft.pl").withZipCode("12-123").withVerificationCode("1234").build();
        assertTrue(form.IsValid());
    }

    @Test
    void whenIncorrectNameInFormThenFalse() {
        IForm form = FormBuilder.aForm().withName("Janek213").withEmail("janusz@soft.pl").withZipCode("12-123").withVerificationCode("1234").build();
        assertFalse(form.IsValid());
    }

    @Test
    void whenIncorrectEmailInFormThenFalse() {
        IForm form = FormBuilder.aForm().withName("Janek").withEmail("janusz.soft.pl").withZipCode("12-123").withVerificationCode("1234").build();
        assertFalse(form.IsValid());
    }

    @Test
    void whenIncorrectZipCodeInFormThenFalse() {
        IForm form = FormBuilder.aForm().withName("Janek").withEmail("janusz@soft.pl").withZipCode("12 123").withVerificationCode("1234").build();
        assertFalse(form.IsValid());
    }

    @Test
    void whenIncorrectVerificationCodeInFormThenFalse() {
        IForm form = FormBuilder.aForm().withName("Janek").withEmail("janusz@soft.pl").withZipCode("12-123").withVerificationCode("asda").build();
        assertFalse(form.IsValid());
    }

}
