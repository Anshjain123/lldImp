package BehavioralDesignPattern.chainOfResponsibility;

public interface JobChain {

    public void setNextChain(JobChain jobChain);

    public void getJob(Person person);
}
