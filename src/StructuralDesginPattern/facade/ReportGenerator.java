package StructuralDesginPattern.facade;

public interface ReportGenerator {

    public void createConnection();
    public void generateTheCSVReport();
    public void generateThePDFReport();
}
