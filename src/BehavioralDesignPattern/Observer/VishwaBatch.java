package BehavioralDesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class VishwaBatch implements VishwaSession{

    private List<ObserverStudent> registerdStudents;
    private String studyTopic;

    public VishwaBatch() {
        this.registerdStudents = new ArrayList<>();
    }

    @Override
    public void register(ObserverStudent student) {
        registerdStudents.add(student);
        System.out.println(student.getName() + "has been registerd");
    }

    @Override
    public void unregister(ObserverStudent student) {
        registerdStudents.remove(student);
        System.out.println(student.getName() + "has been unregistered");
    }

    @Override
    public void notifyObservingStudents() {
        for(ObserverStudent student: registerdStudents) {
            student.update();
        }
    }

    @Override
    public String getUpdate(ObserverStudent student) {
        if(registerdStudents.contains(student)) {
            return studyTopic;
        }
        return null;
    }
    // method to update the study topic

    public void addStudyTopic(String studyTopic) {
        this.studyTopic = studyTopic;
        System.out.println("Topic has been added");

        // now we to notify all the students/observers about the updation of the study topic

        notifyObservingStudents();
    }
}
