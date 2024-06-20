package BehavioralDesignPattern.chainOfResponsibility;

public class FaangJobChain implements JobChain{

    private JobChain jobChain;

    @Override
    public void setNextChain(JobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equals("FAANG")) {
            System.out.println("Got selected in a Faang company");
        } else {
            System.out.println("Not selected in faang company going for a product based company!");
            this.jobChain.getJob(person);
        }
    }
}
