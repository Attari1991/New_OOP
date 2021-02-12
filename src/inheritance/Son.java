package inheritance;

public class Son extends Father{
    //looks as single level but is multi level of inheritance because of the father which is extends the grandfather
    //this is a multi inheritance
    public String sonFavouriteDish = "Turkey";
    public String sonFavouriteSport = "Cricket";
    public String sonFavouriteSSN = "92343567";
    private String sonAccountNumber;

    //constructors:

    public Son(){

    }
    public Son(String sonFavouriteDish){

    }
    public Son(String sonFavouriteDish,String sonFavouriteSport,String sonFavouriteSSN){

    }


    //method for private variable:
    public String  getSonFavouriteAccountNumber(){
        return sonAccountNumber=sonAccountNumber;
    }
    public void setSonFavouriteAccountNumber(){
        this.sonAccountNumber=sonAccountNumber;
    }


    public void student(){
        System.out.println("son is Quality Engineer student");
    }
    public void player(){
        System.out.println("son can play Cricket");

    }
    public void hiking(){
        System.out.println("son love hiking ");
    }
    public void hairStyle(){
        System.out.println("son is interested about covid 19 hair styl");

    }
    public void bodyBuilder(){
        System.out.println("son love a bodyBuilder");

    }





}
