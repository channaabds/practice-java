package oop.usu;

// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject {
    protected String color;
    protected double weight;

    // Default constructor
    protected GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    // Constructor to set color and weight
    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method for weight
    public double getWeight() {
        return weight;
    }

    // Setter method for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Abstract method to find area
    public abstract double findArea();

    // Abstract method to find perimeter
    public abstract double findPerimeter();
}
