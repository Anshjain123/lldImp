package StructuralDesginPattern.facade;

public class HDFSReportGenerator implements ReportGenerator {

    @Override
    public void createConnection() {
        System.out.println("Creating a connection with HDFS");
    }

    @Override
    public void generateTheCSVReport() {
        System.out.println("generating the csv report from hdfc");
    }

    @Override
    public void generateThePDFReport() {
        System.out.println("generating the PDF report from hdfc");
    }
}

