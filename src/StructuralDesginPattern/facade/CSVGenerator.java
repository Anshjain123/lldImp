package StructuralDesginPattern.facade;

public class CSVGenerator implements ReportTypeGenerator {
    private ReportGenerator reportGenerator;

    public CSVGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.createConnection();
        reportGenerator.generateThePDFReport();
    }
}
