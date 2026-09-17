public class Person
//height, age, color, name, & weight
{
    double height;
    int age;
    String color;
    String name;
    double weight;

    //Default Constructor
    //Constructors can have private, protected, or public access modifiers
    public Person()
    {
        height=75;
        age=21;
        color="purple";
        name="";
        weight=152;
    }
    //Protected members are accessible within the same package - java files under same directory/folder
    protected Person(double height, int age)
    {
        this.height=height;
        this.age=age;
    }
    //Overloaded Constructor
    private Person(double height, int age, String color, String name, double weight)
    //Parameters are local variables to the constructor
    {
        this.height=height;
        this.age=age;
        this.color=color;
        this.name=name;
        this.weight=weight;
    }
    public Person Call_Private()
    {
        Person p3=new Person(72, 19, "red", "Paul Gills", 130);
        return p3;
    }
}
