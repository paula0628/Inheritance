//Student class will inherit Person class
//How to inherit: extends
//How many classes can a class inherit: 1 class

//Student is the child class and Person is the parent class
//Student is the subclass and Person is the super class
//Person is the base class
public class Student extends Person {
//Attributes are inherited - Not the private attributes
//Methods are inherited - Not the private methods
//Getters and Setters are inherited - not the private getters and setters
//Constructors are not inherited, but you can use the constructors

    int age;
    int Sid;
    double GPA;
    String firstname;
    String lastname;

    Student()
    {
        age=20;
        Sid=1032239;
        GPA=4.00;
        firstname="Bella";
        lastname="Campbell";
    }
    //Protected members are accessible within the same package - java files under same directory/folder
    protected Student(double GPA, int Sid, int age)
    {
        this.GPA=GPA;
        this.Sid=Sid;
        this.age=age;
    }
    //Overloaded Constructor
    private Student(double GPA, int Sid, int age, String firstname, String lastname)
    //Parameters are local variables to the constructor
    {
        this.GPA=GPA;
        this.Sid=Sid;
        this.age=age;
        this.firstname=firstname;
        this.lastname=lastname;
    }
    public Student Call_Private()
    {
        Student s2=new Student(4.00, 100318459, 15, "Ellen", "Park");
        return s2;
    }
}

