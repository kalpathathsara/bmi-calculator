package bmicalculator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kalpa
 */
public class Tester {
    private ArrayList<Bmi> bmiList = new ArrayList<>(); // An ArrayList to store the data of all users
    private int idCounter = 1;  // for creating a unique id
    private Scanner scanner = new Scanner(System.in);  // Scanner to get user inputs

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.displayMenu();
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("BMI Calculator Menu:");
            System.out.println("1. Create a record");
            System.out.println("2. Show BMI data for all users");
            System.out.println("3. Show BMI data for a selected user");
            System.out.println("4. Delete all");
            System.out.println("5. Exit application");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) { //Used a switch to trigger each task
                case 1:
                    create();
                    break;
                case 2:
                    index();
                    break;
                case 3:
                    System.out.print("Enter ID to view: ");
                    int viewId = scanner.nextInt();
                    view(viewId);
                    break;
                case 4:
                    deleteAll();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }


    public void index() { // Display all the data
        System.out.println("BMI data for all users:");
        for (Bmi bmi : bmiList) {
            bmi.display();
        }
    }

    public void view(int id) { // Display the data of a particular user
        System.out.println("Showing BMI data for user with ID " + id + ":");
        for (Bmi bmi : bmiList) {
            if (bmi.getId() == id) {
                bmi.display();
                return;
            }
        }
        System.out.println("BMI record not found");
    }
    
    public void create() { // Creating a record
        System.out.println("Creating a record");

        // Collect user input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter year of birth: ");
        int yob = scanner.nextInt();
        System.out.print("Enter height (in inches): ");
        int height = scanner.nextInt();
        System.out.print("Enter weight (in kg): ");
        int weight = scanner.nextInt();

        // Create a new BMI record
        Bmi newBmi = new Bmi(idCounter, name, yob, height, weight);
        idCounter++;
        bmiList.add(newBmi);

        System.out.println("BMI record created successfully.");
    }


    public void deleteAll() { // Delete all the data from the bmi ArrayList
        bmiList.clear();
        System.out.println("All BMI records deleted.");
    }

    public void exit() { // Closing calculaor
        System.out.println("Calculator closed!");
        System.exit(0);
    }
}
