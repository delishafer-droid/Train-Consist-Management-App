import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("UC3: Track Unique Bogie IDs using Set (HashSet)");

        System.out.println("Scenario: Ensuring Unique Bogie IDs with HashSet");
        System.out.println("------------------------------------------------");

        // 1. Create a HashSet<String> for bogie IDs.
        Set<String> bogieIDs = new HashSet<>();
        System.out.println("Created a HashSet to store bogie IDs. (Initial size: " + bogieIDs.size() + ")");

        // 2. Add duplicate values intentionally.
        System.out.println("\nAttempting to add bogie IDs (including duplicates):");
        System.out.println("Adding BG101: " + bogieIDs.add("BG101")); // true if added, false if already exists
        System.out.println("Adding BG102: " + bogieIDs.add("BG102"));
        System.out.println("Adding BG103: " + bogieIDs.add("BG103"));
        System.out.println("Adding BG101 (duplicate): " + bogieIDs.add("BG101")); // This should return false
        System.out.println("Adding BG104: " + bogieIDs.add("BG104"));
        System.out.println("Adding BG102 (another duplicate): " + bogieIDs.add("BG102")); // This should return false

        // 3. Print the final set.
        // 4. Observe that duplicates are removed automatically.
        System.out.println("\nFinal set of unique bogie IDs:");
        System.out.println(bogieIDs);
        System.out.println("Total unique bogies registered: " + bogieIDs.size());

        System.out.println("\nKey Concept: HashSet automatically handles deduplication, ensuring that each bogie ID is unique.");
        System.out.println("This prevents inconsistencies that could arise from duplicate IDs in a railway system.");
    }
}
