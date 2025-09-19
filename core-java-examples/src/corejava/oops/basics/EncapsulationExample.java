package corejava.oops.basics;

public class EncapsulationExample {
    public static void main(String[] args) {


        Person p = new Person("Nayana",-1);
        System.out.println(p);

    }
}

class Person {
   private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        if (age < 0)
            age = 0;
        else {
            this.age = age;
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0)
            age = 0;
        else {
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
