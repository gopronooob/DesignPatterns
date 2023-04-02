package com.example.DesignPattern.factory;

public class XMLFormatter implements ReportFormatter{
    @Override
    public void formatReport() {
        System.out.println("Formatted as XML");
    }
}
