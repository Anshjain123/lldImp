package StructuralDesginPattern.facade;

public class PDFGenerator implements ReportTypeGenerator{
    private ReportGenerator reportGenerator;

    public PDFGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.createConnection();
        reportGenerator.generateThePDFReport();
    }
}
