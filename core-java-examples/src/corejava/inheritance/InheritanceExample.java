package corejava.inheritance;

public class InheritanceExample {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.getNumberOfWheels());



    }


}


class Vehicle {

    int numberOfWheels = 4;

    public void drive() {
        System.out.println("Driving vehicle");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }


}

class Car extends Vehicle {

    int numberOfSeats = 6;
    public void drive() {
        System.out.println("Driving Car");
    }
}
