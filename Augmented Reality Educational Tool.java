import java.util.Scanner;

public class AugmentedRealityEducationalTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Augmented Reality Educational Tool!");
        System.out.println("Choose a subject:");
        System.out.println("1. History");
        System.out.println("2. Science");
        System.out.println("3. Geography");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                learnHistory();
                break;
            case 2:
                learnScience();
                break;
            case 3:
                learnGeography();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    public static void learnHistory() {
        System.out.println("Welcome to the History lesson!");
        System.out.println("Explore historical events and figures in augmented reality.");
        // Add history learning content here
    }
    
    public static void learnScience() {
        System.out.println("Welcome to the Science lesson!");
        System.out.println("Discover scientific concepts and experiments in augmented reality.");
        // Add science learning content here
    }
    
    public static void learnGeography() {
        System.out.println("Welcome to the Geography lesson!");
        System.out.println("Travel to different parts of the world and learn about their geography in augmented reality.");
        // Add geography learning content here
    }
}
