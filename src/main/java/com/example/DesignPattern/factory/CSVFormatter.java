package com.example.DesignPattern.factory;

public class CSVFormatter implements ReportFormatter{
    @Override
    public void formatReport() {
        System.out.println("Formatted as CSV");
    }
}
