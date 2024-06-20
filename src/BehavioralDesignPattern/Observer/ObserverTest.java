package BehavioralDesignPattern.Observer;

public class ObserverTest {
    public static void main(String[] args) {

        // create a batch
        VishwaBatch batch = new VishwaBatch();


        // creating students;

        ObserverStudent s1 = new MyBatchSubscriber("ram");
        ObserverStudent s2 = new MyBatchSubscriber("mohan");
        ObserverStudent s3 = new MyBatchSubscriber("ansh");
        ObserverStudent s4 = new MyBatchSubscriber("robb");

        // subscribing them to the batch

        batch.register(s1);
        batch.register(s2);
        batch.register(s3);
        batch.register(s4);

        // setting vishwa session to all of the students

        s1.setVishwaSessions(batch);
        s2.setVishwaSessions(batch);
        s3.setVishwaSessions(batch);
        s4.setVishwaSessions(batch);

        // adding topic to the batch

        batch.addStudyTopic("Observer pattern");



    }
}
