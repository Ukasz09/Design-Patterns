package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.templateMethod.dataProcessing;

import java.util.concurrent.TimeUnit;

public abstract class DataProcessing {

    public final void processData(String filePath) {
        openFile();
        getDataFromFile();
        analiseData();
        closeFile(filePath);
    }

    protected abstract void openFile();

    protected abstract void getDataFromFile();

    private void analiseData() {
        System.out.println("Data are analysing now ");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void closeFile(String filePath) {
        System.out.println("File: " + filePath + " is closed");
    }

}
