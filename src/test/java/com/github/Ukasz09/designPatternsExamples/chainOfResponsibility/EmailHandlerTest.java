package com.github.Ukasz09.designPatternsExamples.chainOfResponsibility;

import com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.form.FormBuilder;
import com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.form.IForm;
import com.github.Ukasz09.designPatternsExamples.chainOfResponsibility.handlers.EmailHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailHandlerTest {
    @Test
    void whenCorrectEmailThenValid() {
        EmailHandler handler = new EmailHandler();
        IForm form = FormBuilder.aForm().withEmail("janek@domena.com").build();
        assertTrue(handler.handle(form));
    }

    @Test
    void whenNoAtSignInEmailThenInvalid() {
        EmailHandler handler = new EmailHandler();
        IForm form = FormBuilder.aForm().withEmail("janekdomena.com").build();
        assertFalse(handler.handle(form));
    }

    @Test
    void whenNoCommaInEmailThenInvalid() {
        EmailHandler handler = new EmailHandler();
        IForm form = FormBuilder.aForm().withEmail("janek@domena").build();
        assertFalse(handler.handle(form));
    }

    @Test
    void whenSpaceBetweenAtSignInEmailThenInvalid() {
        EmailHandler handler = new EmailHandler();
        IForm form = FormBuilder.aForm().withEmail("janek @ domena.com").build();
        assertFalse(handler.handle(form));
    }


}
