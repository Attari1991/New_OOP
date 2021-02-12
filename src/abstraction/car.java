package abstraction;

public interface car {
    // String carName; in interface we can not declare a variable in interface
    //interface :is guideline for future
    //not allowed to create an object in interface
    //all the val and assigned value are final in the interface

    String carName = "Honda";
    String price = "23000";
    //variable:
    String brand = "Mercedes";
    int carQuantity = 200;
    String sear = "2";
    String hearLight = "4";
    boolean gasTank = true;

    //Method:because of interface is fully abstract all the method are abstract
    //dont need to use a absract word in interface
    public void startCar();

    public void stopCar();

    public void wheelCar();

    public void engineCar();

    public void accelerationCar();

    public void steeringCar();

    public void breakCar();
    public void navigation();
    public static void main(String[] args){

    }


    //we can not declare a static variable in the interface
    //Interface is 100% Abstract
    //we can not create a method with body{}.and the opposite is true
    public void display();// we can declare a non return method in interface

    public static int carDoor(int doorNumber) {// when i use a static method should declare a body
        int totalDoor = 1 * doorNumber;
//        System.out.println();
        System.out.println("totalDoor is "+totalDoor);
        return totalDoor;
    }

public interface NewCar{//interface inside an interface
        public void carRoof();//declare a method
}

}




