/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kalpa
 */
class Tester {
    private ArrayList<Bmi> bmiList = new ArrayList<>();
    private int idCounter = 1;
    private Scanner scanner = new Scanner(System.in);

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

            switch (choice) {
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


    public void index() {
        System.out.println("BMI data for all users:");
        for (Bmi bmi : bmiList) {
            bmi.display();
        }
    }

    public void view(int id) {
        System.out.println("Showing BMI data for user with ID " + id + ":");
        for (Bmi bmi : bmiList) {
            if (bmi.getId() == id) {
                bmi.display();
                return;
            }
        }
        System.out.println("BMI record not found");
    }
    
    public void create() {
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


    public void deleteAll() {
        bmiList.clear();
        System.out.println("All BMI records deleted.");
    }

    public void exit() {
        System.out.println("Calculator closed!");
        System.exit(0);
    }
}
