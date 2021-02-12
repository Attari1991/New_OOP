package encapsulation;

public class TestPizza {
    public static void main(String[] args) {
        Pizza pizza=new Pizza();
        //obj.pizzaName=
        //when you create getter and setter first we create getter method then setter method
        //when we use getter and setter first set value then getter
        pizza.setToppingName("Mushroom");//set value or assign value
        System.out.println(pizza.getToppingName());//get value

        //exception step with boolean:
        pizza.setAvailable(false);
        System.out.println(pizza.isAvailable());//no get method here

    }
}
