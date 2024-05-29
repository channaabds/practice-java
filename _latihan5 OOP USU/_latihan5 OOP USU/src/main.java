//TestOverrideMethods.java: Test the Cylinder class that overrides 
// itssuperclass'smethods 
public class TestOverrideMethods
{
    public static void main(String[]args)
    {
        Cylinder myCylinder= new Cylinder(5.0, 2.0);
        System.out.println("The length is " + myCylinder.getLength());
        System.out.println("The radius is " + myCylinder.getRadius());
        System.out.println("The surface area of the cylinder is "+ myCylinder.findArea());
        System.out.println("The volume of the cylinder is "+ myCylinder.findVolume());
    }
}

// New cylinder class that overrides thefindArea() method defined in 
// the circle class 
class Cylinder extends CircleSecond
{
    private double length;

    // Default constructor 
    public Cylinder()
    {
        super(); length = 1.0;
    }

    // Construct a cylinder with specified radius and length 
    public Cylinder(double r, double l)
    {
        super(r); length = l;
    }

    // Getter method for length 
    public double getLength()
    {
        return length;
    }

    // Find cylinder surface area 
    public double findArea()
    {
        return 2*super.findArea()+(2*getRadius()*Math.PI)*length;
    }

    // Find cylinder volume 
    public double findVolume()
    {
        return super.findArea()*length; 
    } 
}