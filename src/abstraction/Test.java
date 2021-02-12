package abstraction;

public class Test {
    public static void main(String[] args) {
        //because of banning of create an object for call the variable that car interface have we need to use a implements from car
        GeneralMotor gm=new GeneralMotor();
        gm.startCar();
        gm.stopCar();
        gm.wheelCar();
        gm.engineCar();
        //gm.brand="BMW";can not reassign value they are final in interface
        System.out.println(gm.brand);
        car.carDoor(2);
        System.out.println(car.brand);//call from interface mercedes
        //GeneralMotor.carInfo();
        Tesla tesla=new Tesla();
        tesla.startCar();
        tesla.accelerationCar();
        tesla.stopCar();


    }
}
