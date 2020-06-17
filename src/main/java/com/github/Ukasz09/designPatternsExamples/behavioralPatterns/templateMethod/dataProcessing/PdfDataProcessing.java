package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.templateMethod.dataProcessing;

public class PdfDataProcessing extends DataProcessing {
    @Override
    protected void openFile() {
        System.out.println("Opening pdf file");
    }

    @Override
    protected void getDataFromFile() {
        System.out.println("Retrieving data from pdf file");
    }

    //some other helper methods
}
