package inheritance;

public class Daughter {
    //variable
    public String daughterFavouriteDish = "Turkey";
    public String daughterFavouriteSport = "Handball";
    public String daughterFavouriteSSN = "998343567";
    private String daughterAccountNumber;

    //constructors for public variable:
     public Daughter(){
     }
     public Daughter(String daughterFavouriteDish ){
         this.daughterFavouriteDish =daughterFavouriteDish;
     }
     public Daughter(String daughterFavouriteDish,String daughterFavouriteSport ,String daughterFavouriteSSN){
         this.daughterFavouriteDish=daughterFavouriteDish;
         this.daughterFavouriteSport=daughterFavouriteSport;
         this.daughterFavouriteSSN=daughterFavouriteSSN;
     }

     //for private variable:
    public String getDaughterAccountNumber(){
         return daughterAccountNumber=daughterAccountNumber;
    }
    public void setDaughterAccountNumber(){
         this.daughterAccountNumber=daughterAccountNumber;
    }

    public void dancing(){
        System.out.println("daughter love dancing");
    }
    public void singing(){
        System.out.println("daughter love singing");
    }
    public void learning(){
        System.out.println("daughter likes learning a new subject");

    }
    public void shopping(){
        System.out.println("daughter love to do shopping");
    }
    public void flyOnTheSky(){
        System.out.println("daughter love to fly On the Sky");
    }













}







