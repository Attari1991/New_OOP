package abstraction;

public class Tesla extends ModernCar implements car,boostEngine {//by removing boostEngine and put autoPilot and remove the boostEngine method too
    //java class can implements from  multiple interfaces
   // this is a concrete class
    //extends means have the access for all the properties,variable ,methods ..ect
//

    public void startCar() {
        System.out.println("tesla has start feature");

    }

    public void stopCar() {
        System.out.println("tesla has stop feature");

    }

    public void wheelCar() {
        System.out.println("tesla has wheel feature");

    }

    public void engineCar() {
        System.out.println("tesla has engine feature");

    }

    public void accelerationCar() {
        System.out.println("tesla has acceleration feature");

    }

    public void steeringCar() {
        System.out.println("tesla has steering feature");

    }

    public void breakCar() {
        System.out.println("tesla has break feature");

    }

    public void navigation() {
        System.out.println("tesla has navigation feature");

    }

    public void display() {


    }


    public void boostEngine() {//this method is added from another interface which is boost  engine
//remove this when we use the autopilot interface
    }

    public void cameras() {
        System.out.println("Tesla car has cameras feature");

    }

    public void autoLaneControl() {
        System.out.println("Tesla car has auto Lane Control feature");
    }

    public void selfDriven() {
        System.out.println("Tesla has self Driven feature");

    }

    public void autoPark() {
        System.out.println("Tesla has auto Park feature");

    }

    public void gps() {
        System.out.println("Tesla has gps feature");

    }

    public void emergencyBreak() {
        System.out.println("Tesla has emergency Break feature");

    }
}
