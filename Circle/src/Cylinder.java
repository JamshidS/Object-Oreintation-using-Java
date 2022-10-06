public class Cylinder {
    double radius;
    double height;

    public double lidAdrea(){
        return Math.PI*radius*radius;
    }
    public double totalSurFaceArea(){
        return 2*lidAdrea()+circumference()*height;
    }
    public double circumference(){
        return 2*Math.PI*radius;

    }

    public double volume(){
        return lidAdrea()*height;
    }
}
