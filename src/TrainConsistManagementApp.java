import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Step 1: Create Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for display
    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 2: Create List of Bogie objects
        List<Bogie> bogieList = new ArrayList<>();
        System.out.println("\n UC7 : Sort Bogies by Capacity \n ");

        // Step 3: Add bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 54));
        bogieList.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:\n");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 4: Sort using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (Ascending by Capacity):\n");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}