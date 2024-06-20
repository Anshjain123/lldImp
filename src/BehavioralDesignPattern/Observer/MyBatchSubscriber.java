package BehavioralDesignPattern.Observer;

public class MyBatchSubscriber implements ObserverStudent{

    private VishwaSession vishwaSession;
    private String name;

    public MyBatchSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        vishwaSession.getUpdate(this);
        System.out.println("Fetched the session plan of vishwa");
    }

    @Override
    public void setVishwaSessions(VishwaSession vishwaSession) {
        this.vishwaSession = vishwaSession;
    }

    @Override
    public String getName() {
        return name;
    }
}
