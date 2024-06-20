package BehavioralDesignPattern.chainOfResponsibility;

public class Person {

    private String skillType;

    public Person(String skillType) {
        this.skillType = skillType;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }
}
