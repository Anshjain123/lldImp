package StructuralDesginPattern.facade;

public class ReportFacade {


    public void generateReport(ReportTypeGenerator reportTypeGenerator) {
        reportTypeGenerator.generateReport();
    }
}
