/**
 * ProjectTest
 */
public class ProjectTest {

    public static void main(String[] args) {
        Project p1 = new Project(); // no paramenters
        Project p2 = new Project("Personal website"); // one parameter
        Project p3 = new Project("Certification", "The Java certification exam"); // two parameters
        Project p4 = new Project("Buy a car", "Get a new car", 18000); // all the parameters

        p2.setDescription("A personal website to help find a job");
        p2.setInitialCost(1500);
        p4.setName("Kia Forte");

        System.out.println(p1.elevatorPitch());
        System.out.println(p2.elevatorPitch());
        System.out.println(p3.elevatorPitch());
        System.out.println(p4.elevatorPitch());
    }
}
