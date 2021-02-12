package polymorphism.methodaverloading;

public class Calculator {
    //overloading is allowing the methods to get a same name with != signature
    //compile time polymorphism:because it happen during the compilation time..

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        int number1=23;
        int number2=33;
        Calculator.doSum(1,2);
        obj.space();
        Calculator.doSum(1,2,3);
        obj.space();
        Calculator.doSum(1,2,6);
    }



//to make the method acceptable with a same name we can :
    //add more parameters
    //use != datatype
    //or both

    public static void doSum(int num1,int num2){
        int total=num1+num2;
        System.out.println("total is "+total);
    }

    public static void doSum(int num1,int num2,int num3){//same method name and more val:this is averloading
        //the != is the signature partem.
        int total=num1+num2+num3;
        System.out.println("total is "+total);
    }


     public static void doSum(int num1,int num2,int num3,int num4){//same method name and more val:this is averloading
        //the != is the signature .
        int total=num1+num2+num3;
        System.out.println("total is "+total);
    }
     public void space(){
         System.out.println("**************************");
     }


}
