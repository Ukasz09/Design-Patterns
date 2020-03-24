package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility;

import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form.FormBuilder;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.form.IForm;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.chainOfResponsibility.handlers.NameHandler;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class NameHandlerTest {
    @Test
    void whenCorrectNameThenValid() {
        NameHandler nameHandler = new NameHandler();
        IForm form = FormBuilder.aForm().withName("Janek").build();
        assertTrue(nameHandler.handle(form));
    }

    @Test
    void whenEmptyNameThenInvalid() {
        NameHandler nameHandler = new NameHandler();
        IForm emptyForm = FormBuilder.aForm().withName("  ").build();
        IForm emptyForm2 = FormBuilder.aForm().withName("").build();
        assertFalse(nameHandler.handle(emptyForm));
        assertFalse(nameHandler.handle(emptyForm2));
    }

    @Test
    void whenCorrectFullNameThenValid() {
        NameHandler nameHandler = new NameHandler();
        IForm form = FormBuilder.aForm().withName("Jan Brzytwa").build();
        IForm form2 = FormBuilder.aForm().withName("Jan Marian Brzytwa").build();
        assertTrue(nameHandler.handle(form));
        assertTrue(nameHandler.handle(form2));
    }

    @Test
    void whenNameWithHyphenThenValid() {
        NameHandler nameHandler = new NameHandler();
        IForm form = FormBuilder.aForm().withName("Jan-Maria").build();
        assertTrue(nameHandler.handle(form));
    }


    @Test
    void whenFullNameWithHyphenThenValid() {
        NameHandler nameHandler = new NameHandler();
        IForm form = FormBuilder.aForm().withName("Jan-Maria Las").build();
        assertTrue(nameHandler.handle(form));
    }

    @Test
    void whenNameWithApostropheThenValid() {
        NameHandler nameHandler = new NameHandler();
        IForm form = FormBuilder.aForm().withName("Jan'la").build();
        assertTrue(nameHandler.handle(form));
    }

    @Test
    void whenFullNameWithApostropheThenValid() {
        NameHandler nameHandler = new NameHandler();
        IForm form = FormBuilder.aForm().withName("Van'zin Diesels").build();
        assertTrue(nameHandler.handle(form));
    }

    @Test
    void whenNameWithNumbersThenInvalid() {
        NameHandler nameHandler = new NameHandler();
        IForm form = FormBuilder.aForm().withName("Jan21").build();
        assertFalse(nameHandler.handle(form));
    }


    @Test
    void whenNameWithSpecialCharsThenInvalid() {
        NameHandler nameHandler = new NameHandler();
        IForm form = FormBuilder.aForm().withName("Jan_Wan kos").build();
        IForm form2 = FormBuilder.aForm().withName("Jan+Wan").build();
        IForm form3 = FormBuilder.aForm().withName("Jan$Wan").build();
        IForm form4 = FormBuilder.aForm().withName("~Jan").build();
        assertFalse(nameHandler.handle(form));
        assertFalse(nameHandler.handle(form2));
        assertFalse(nameHandler.handle(form3));
        assertFalse(nameHandler.handle(form4));
    }
}
