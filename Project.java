/**
 * Project
 */
public class Project {

    private String name;
    private String description;
    private double initialCost;

    // constructors
    public Project() {
        this("unnamed project", "no description", 0);
    }

    public Project(String name) {
        this(name, "no description", 0);
    }

    public Project(String name, String description) {
        this(name, description, 0);
    }

    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    // getters
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public double getInitialCost() {
        return this.initialCost;
    }

    // instance methods
    public String elevatorPitch() {
        return this.name + " (" + this.initialCost + "): " + this.description;
    }
}
