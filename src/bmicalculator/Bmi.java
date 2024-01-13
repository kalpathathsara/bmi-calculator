/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

/**
 *
 * @author Kalpa
 */
import java.util.ArrayList;
import java.util.Scanner;

class Bmi {
    private int id;
    private String name;
    private int yob;
    private int height;
    private int weight;

    public Bmi(int id, String name, int yob, int height, int weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.height = height;
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double calculate() {
        System.out.println("Calculated BMI");
        return 0;
    }

    public void display() {
        double bmi = calculate();
        System.out.println("BMI for " + name + ": " + bmi);
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
  
}
