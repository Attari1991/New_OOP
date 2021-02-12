package polymorphism.methodoverriding;


import abstraction.ModernCar;

public class Bmw extends ModernCar {
    //override annotation
    //when you override any method ..is like you replace it by a new method

    @Override
    public void cameras() {

    }

    @Override
    public void autoLaneControl() {

    }

    @Override
    public void selfDriven() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void gps() {

    }

    @Override
    public void emergencyBreak() {

    }
    @Override//because of this annotation the output shows up the new result
    //override happen in run time in compile time jvm gonna compile the original method without the body .
    // when jvm delivery (run)time it  gonna execute the body in the override method body

    public void remoteStart() {

        System.out.println("BMW car has Remote start feature");
        System.out.println("BMW car has Remote start feature");
    }

}
