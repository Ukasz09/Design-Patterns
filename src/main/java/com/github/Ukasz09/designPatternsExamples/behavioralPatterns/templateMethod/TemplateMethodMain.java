package com.github.Ukasz09.designPatternsExamples.behavioralPatterns.templateMethod;

import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.templateMethod.dataProcessing.CsvDataProcessing;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.templateMethod.dataProcessing.DocDataProcessing;
import com.github.Ukasz09.designPatternsExamples.behavioralPatterns.templateMethod.dataProcessing.PdfDataProcessing;

public class TemplateMethodMain {
    public static void main(String[] args) {
        System.out.println("\nPDF DATA \n");
        new PdfDataProcessing().processData("/path/to/data.pdf");
        System.out.println("\nCSV DATA \n");
        new CsvDataProcessing().processData("/path/to/data.csv");
        System.out.println("\nDOC DATA \n");
        new DocDataProcessing().processData("/path/to/data.doc");
    }
}
