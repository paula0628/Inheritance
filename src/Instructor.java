public class Instructor extends Person {
    String firstname;
    String lastname;
    String role;
    int classroom;
    int age;

    Instructor() {
        firstname = "Karma";
        lastname = "Collins";
        role = "9th Grade Algebra 1";
        classroom = 245;
        age = 35;
    }

    //Protected members are accessible within the same package - java files under same directory/folder
    protected Instructor(int classroom, int age) {

        this.classroom = classroom;
        this.age = age;
    }

    //Overloaded Constructor
    private Instructor(int classroom, int age, String role, String firstname, String lastname)
    //Parameters are local variables to the constructor
    {
        this.classroom = classroom;
        this.age = age;
        this.role = color;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Instructor Call_Private() {

        Instructor t2 = new Instructor(256, 42);
        return t2;
    }
}