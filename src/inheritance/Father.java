package inheritance;

public class Father extends GrandFather{
    //variable:
    public String fatherFavouriteDish = "Fish";
    public String fatherFavouriteSport = "Soccer";
    public String fatherFavouriteSSN = "12343567";
    private String fatherAccountNumber;

    public String getFatherAccountNumber(){
        return fatherAccountNumber=fatherAccountNumber;
    }
    public void setFatherAccountNumber(){
        this.fatherAccountNumber="567890987";
    }




    public void swim(){
        System.out.println("Father can swim");
    }
    public void beard(){
        System.out.println("Father have long and grey beard");
    }
    public void hairColor(){
        System.out.println("Father Hair color is black and white");
    }
    public void eyes(){
        System.out.println("Father eyes color is brown ");
    }
    public void goodPersonality(){
        System.out.println("Father have a good personality");
    }






}
