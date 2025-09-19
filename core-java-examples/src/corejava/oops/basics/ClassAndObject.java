package corejava.oops.basics;

public class ClassAndObject {

    String name;
    int age;

    public void print() {
        System.out.println(name);
        System.out.println(age);



    }

}
class main {
    public static void main(String[] args) {
        ClassAndObject c = new ClassAndObject();
        c.name = "John";
        c.age = 40;
        c.print();

    }
}


