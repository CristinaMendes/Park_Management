package project.domain;

/**
 * The Job class represents a job with a name.
 */
public class Job {
    private String name;
    /**
     * Constructor that initializes a job with a specified name.
     *
     * @param name the name of the job
     */
    public Job(String name) {
        isValidJobName(name);
        this.name = name;
    }

    /**
     * Returns the name of the job.
     *
     * @return the name of the job
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the job.
     *
     * @param name the new name of the job
     */
    public void setName(String name) {
        isValidJobName(name);
        this.name = name;
    }

    public static void isValidJobName(String name) {
        // only letters and spaces
        String regex = "^[a-zA-Z\\s]+$";
        // Check if the input(jobName) matches the expression
        if(!name.matches(regex)){
            throw new IllegalArgumentException("Invalid name. The name can only contain letters and spaces.");
        }
    }

}
