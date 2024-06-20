package BehavioralDesignPattern.Observer;

public interface VishwaSession {

    // method to register

    public void register(ObserverStudent student);

    // method to unregister

    public void unregister(ObserverStudent student);

    // method to notify all students about the class

    public void notifyObservingStudents();

    // method to notify a single student;

    public String getUpdate(ObserverStudent student);
}
