package encapsulation;

public class Pizza {

    //Encapsulation:data hiding
    public String pizzaName;
    private String toppingName;
    private int price;
    private char size;
    private String typeOfPizza;
    private boolean isAvailable;

    //create constructor:right click+ generate +constructor


    public Pizza() {
    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaName, String toppingName) {
        this.pizzaName = pizzaName;
        this.toppingName = toppingName;
    }

    public Pizza(String pizzaName, String toppingName, int price, char size, String typeOfPizza, boolean isAvailable) {
        this.pizzaName = pizzaName;
        this.toppingName = toppingName;
        this.price = price;
        this.size = size;
        this.typeOfPizza = typeOfPizza;
        this.isAvailable = isAvailable;
    }



    //Getter and Setter methods:are use for call the privat variable from another class without change the access modifier
    //for use the private variable we need to convert the privat variable into public method for get the ability to use it in another class
    //for each private variable should turn it into public method for getter for return type and setter method for non return type
    //getter and setter should be in the same class with a private class otherwise we can note use it another class
    public String getToppingName(){//this is getter method,,,is return typ
        return toppingName;
    }
    public void setToppingName(String pizzaName){//non return type method
        this.toppingName=toppingName;

    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public char getSize(){
        return size='l';
    }
    public void setSize(char size){
        this.size=size;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
