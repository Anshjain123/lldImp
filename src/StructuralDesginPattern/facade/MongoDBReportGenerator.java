package StructuralDesginPattern.facade;

public class MongoDBReportGenerator implements ReportGenerator {

    @Override
    public void createConnection() {
        System.out.println("Creating a connection with mongodb");
    }

    @Override
    public void generateTheCSVReport() {
        System.out.println("generating the csv report from mongodb");
    }

    @Override
    public void generateThePDFReport() {
        System.out.println("generating the PDF report from monogdb");
    }
}

