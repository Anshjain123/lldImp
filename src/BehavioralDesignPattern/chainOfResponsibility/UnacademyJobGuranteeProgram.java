package BehavioralDesignPattern.chainOfResponsibility;

public class UnacademyJobGuranteeProgram {
    public static void main(String[] args) {

        FaangJobChain faangJobChain = new FaangJobChain();
        ProductChain productChain = new ProductChain();
        ServiceChain serviceChain = new ServiceChain();

        faangJobChain.setNextChain(productChain);
        productChain.setNextChain(serviceChain);

        Person p1 = new Person("FAANG");
        Person p2 = new Person("PRODUCT");
        Person p3 = new Person("SERVICE");
        Person p4 = new Person("faang");
        faangJobChain.getJob(p4);
    }
}
