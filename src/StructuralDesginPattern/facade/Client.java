package StructuralDesginPattern.facade;

public class Client {
    public static void main(String[] args) {

        ReportTypeGenerator reportTypeGenerator = new PDFGenerator(new HDFSReportGenerator());
        ReportFacade facade = new ReportFacade();

        facade.generateReport(reportTypeGenerator);

    }
}
