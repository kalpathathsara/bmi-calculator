package bmicalculator;

/**
 *
 * @author Kalpa
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Bmi {
    // Attributes of the Bmi class
    private int id;
    private String name;
    private int yob;
    private int height;
    private int weight;

    // Methods of the Bmi class
    public Bmi(int id, String name, int yob, int height, int weight) { // constructor
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.height = height;
        this.weight = weight;
    }

    // setters
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    // other methods
    public double calculate() { // calculating bmi
        System.out.println("Calculated BMI");
        return 0;
    }

    public void display() { // displaying bmi
        double bmi = calculate();
        System.out.println("BMI for " + name + ": " + bmi);
    }
    
  
}
