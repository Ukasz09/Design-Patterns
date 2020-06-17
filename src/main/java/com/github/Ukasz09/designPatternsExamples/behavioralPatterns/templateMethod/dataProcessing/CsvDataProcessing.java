package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.templateMethod.dataProcessing;

public class CsvDataProcessing extends DataProcessing {
    @Override
    protected void openFile() {
        System.out.println("Opening cvs file");
    }

    @Override
    protected void getDataFromFile() {
        System.out.println("Retrieving data from csv file");
    }

    //some other helper methods
}
