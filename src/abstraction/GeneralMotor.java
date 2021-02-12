package abstraction;

public class GeneralMotor implements car{
    // the question how we call the variable from car interface
    //generalMotors get the properties from car interface by using the implements
    //because of implementation this class will be named :concrete class
    String brand="BMW";//assign
    public static void carInfo(){
        System.out.println("This is gm car information");
    }
//    public static void main(String [] args){
//        GeneralMotor gm=new GeneralMotor();
//        gm.startCar();
 //   }

    public boolean willBeAvailable(boolean availability){
        boolean releaseMonth=availability;
        return releaseMonth;
    }




    public void startCar(){
        System.out.println("generalMotor has start feature");

    }

    public void stopCar() {
        System.out.println("generalMotor has stop feature");

    }

    public void wheelCar() {
        System.out.println("generalMotor has wheel feature");
    }

    public void engineCar() {
        System.out.println("generalMotor has engine feature");
    }

    public void accelerationCar() {
        System.out.println("generalMotor has accelerationfeature");
    }

    public void steeringCar() {
        System.out.println("generalMotor has steeringfeature");
    }

    public void breakCar() {
        System.out.println("generalMotor has break feature");
    }

    public void navigation() {
        System.out.println("generalMotor has  navigation feature");
    }

    public void display() {
        System.out.println("generalMotor has start feature");
    }
}
