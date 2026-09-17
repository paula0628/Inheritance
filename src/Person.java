public class Person
//height, age, color, name, & weight
{
    double height;
    int age;
    String color;
    String name;
    double weight;

    //Default Constructor
    Person()
    {
        height=75;
        age=21;
        color="purple";
        name="";
        weight=152;
    }
    //Overloaded Constructor
    Person(double height, int age, String color, String name, double weight)
    //Parameters are local variables to the constructor
    {
        this.height=height;
        this.age=age;
        this.color=color;
        this.name=name;
        this.weight=weight;
    }
}
