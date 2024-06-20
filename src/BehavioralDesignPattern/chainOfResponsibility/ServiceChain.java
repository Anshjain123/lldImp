package BehavioralDesignPattern.chainOfResponsibility;

public class ServiceChain implements JobChain{

    private JobChain jobChain;

    @Override
    public void setNextChain(JobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equals("SERVICE")) {
            System.out.println("GOt selected in service based");
        } else {
            System.out.println("Not selected in service based going to improve my skills");
        }
    }
}
