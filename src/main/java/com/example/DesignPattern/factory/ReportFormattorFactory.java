package com.example.DesignPattern.factory;

public class ReportFormattorFactory {

    public ReportFormatter getReportFormatter(String type)
    {
        switch (type) {
            case "CSV":
                return new CSVFormatter();
            case "XML":
                return new XMLFormatter();
        }
        return null;
    }
}
