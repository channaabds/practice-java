package oop.usu;

public class CircleSecond {
    private double radius;

    public CircleSecond() {
        radius = 1.0;
    }

    public CircleSecond(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double findArea() {
        return radius * radius * 3.14159;
    }
}

class Cylinder extends CircleSecond {
    private double length;

    public Cylinder() {
        super();
        length = 1.0;
    }

    public Cylinder(double r, double l) {
        super(r);
        length = l;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l;
    }

    public double findVolume() {
        return super.findArea() * length;
    }
}
