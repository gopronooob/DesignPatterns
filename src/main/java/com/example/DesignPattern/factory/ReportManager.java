package com.example.DesignPattern.factory;

public class ReportManager {

    public static void main(String args[])
    {
        ReportFormattorFactory factory = new ReportFormattorFactory();
        ReportFormatter formatter= factory.getReportFormatter("CSV");
        formatter.formatReport();

        formatter= factory.getReportFormatter("XML");
        formatter.formatReport();


    }
}
