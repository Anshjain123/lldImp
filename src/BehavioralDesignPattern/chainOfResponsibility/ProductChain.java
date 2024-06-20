package BehavioralDesignPattern.chainOfResponsibility;

public class ProductChain implements JobChain{

    private JobChain jobChain;

    @Override
    public void setNextChain(JobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equals("PRODUCT")) {
            System.out.println("Selected in product based!");
        } else {
            System.out.println("not selected in product going for service based company");
            this.jobChain.getJob(person);
        }
    }
}
