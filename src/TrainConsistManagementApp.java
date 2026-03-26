import java.util.LinkedHashSet;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=======================================================\nUC5 : Preserve Insertion Order of Bogies (LinkedHashSet)\n=======================================================");
        // Step 1: Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt to add duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate - will be ignored

        // Step 4: Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
    }
}