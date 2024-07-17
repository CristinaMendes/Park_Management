package project.domain;

public class Skill {
    private String name;

    public Skill(String name) {
        isValidSkillName(name);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        isValidSkillName(name);
        this.name = name;
    }

    public static void isValidSkillName(String name) {
        // only letters and spaces
        String regex = "^[a-zA-Z\\s]+$";
        // Check if the input(jobName) matches the expression
        if(!name.matches(regex)){
            throw new IllegalArgumentException("Invalid name. The name can only contain letters and spaces.");
        }
    }
}
