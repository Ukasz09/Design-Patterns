package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.templateMethod.dataProcessing;

public class DocDataProcessing extends DataProcessing {
    @Override
    protected void openFile() {
        System.out.println("Opening doc file");
    }

    @Override
    protected void getDataFromFile() {
        System.out.println("Retrieving data from doc file");
    }

    //Assume that e.g. doc files need special closing procedure
    @Override
    protected void closeFile(String filePath) {
        System.out.println("Doing additional stuff collocated to closing doc file");
        super.closeFile(filePath);
    }

    //some other helper methods
}
