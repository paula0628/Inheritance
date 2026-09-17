//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Create two person object

        Person p1=new Person();

        Person p2=new Person(72,19,"Blue","Ashley Andrews",139);
        System.out.println(p2.height);
        System.out.println(p2.age);
        System.out.println(p2.color);
        System.out.println(p2.name);
        System.out.println(p2.weight);
    }
}