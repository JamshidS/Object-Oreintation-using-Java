public class Main {
    public static void main(String[] args) {

        Circle c1 =  new Circle();
        c1.radius = 10;
        System.out.println("Area:"+ c1.area() );
        System.out.println("Perimeter:"+c1.perimeter());
        System.out.println("Circumference:"+c1.circumference());

        System.out.println("______________________");
        Rectangle r1 = new Rectangle();
        r1.length =5;
        r1.breadth = 4;
        System.out.println("Area:"+r1.area());
        System.out.println("Perimeter:"+r1.perimeter());
        System.out.println("Is it a Square:"+r1.isSquare());
        System.out.println("______________________");

        Cylinder cylinder = new Cylinder();
        cylinder.height=10;
        cylinder.radius = 7;
        System.out.printf("Lid Area: "+"%.2f", cylinder.lidAdrea());
        System.out.println();
        System.out.printf("Total Area: "+ "%.2f", cylinder.totalSurFaceArea());
        System.out.println();
        System.out.printf("Volume: "+ "%.2f",cylinder.volume());
        System.out.println();
        System.out.println("______________________");

        Student student = new Student();
        student.course="CS";
        student.name="Jamshid Sadiqi";
        student.rollNum = 8;
        student.m1 = 90;
        student.m2 = 85;
        student.m3 = 100;

        System.out.println("Total: "+student.total());
        System.out.println("Average: "+student.average());
        System.out.println("Grade: "+student.grade());
        System.out.println("Student Details: "+ student);//if your class has a toString method if you give the object ref it call directly toString method


    }
}