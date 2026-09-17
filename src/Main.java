public class Main {
    public static void main(String[] args) {
    //Create two person object

        Person p1=new Person();

//        Person p2=new Person(72,19,"Blue","Ashley Andrews",139);
//        System.out.println(p2.height);

        Person p2=new Person(72,19);
        System.out.println("Height = "  +p2.height);
        System.out.println("Age = " +p2.age + "\n");

        Person p3=p2.Call_Private();

        Student s1=new Student();
        s1.GPA=4.00;
        s1.age=15;
        s1.Sid=100318459;
        System.out.println("GPA = " +s1.GPA);
        System.out.println("Age = " +s1.age);
        System.out.println("Student ID = " +s1.Sid + "\n");

        Student s2=s1.Call_Private();

        Instructor t1=new Instructor();
        t1.classroom=256;
        t1.age=42;
        System.out.println("Classroom = " +t1.classroom);
        System.out.println("Age = " + t1.age + "\n");

        Instructor t2=t1.Call_Private();
    }
}