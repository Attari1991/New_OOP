package inheritance;

public class GrandFather {

    public String grandFatherFavouriteDish = "Fish";
    public String grandFatherFavouriteSport = "Soccer";
    public String grandFatherFavouriteSSN = "12343567";
    private String grandFatherAccountNumber;
    private boolean isJadi=true;

    public GrandFather() {
    }

    public GrandFather(String grandFatherFavouriteDish) {
        this.grandFatherFavouriteDish = grandFatherFavouriteDish;
    }

    public GrandFather(String grandFatherFavouriteDish, String grandFatherFavouriteSport, String grandFatherFavouriteSSN) {
        this.grandFatherFavouriteDish = grandFatherFavouriteDish;
        this.grandFatherFavouriteSport = grandFatherFavouriteSport;
        this.grandFatherFavouriteSSN = grandFatherFavouriteSSN;
    }

    //make the private variable usable by the other class

    public String getGrandFatherFavouriteAccountNumber(){
        return grandFatherAccountNumber;
    }
    public void setGrandFatherFavouriteAccountNumber(){
        this.grandFatherAccountNumber=grandFatherAccountNumber;
    }

    //create a default method :

    public void fishing(){
        System.out.println("Grand Father like to do fishing");
    }
    public void height(){
        System.out.println("Grand Father height is 6.2");
    }
    public void weight(){
        System.out.println("Grand Father height is 6.2");
    }
    public void jump(){
        System.out.println("Grand Father can jump");
    }
    public void playGame(){
        System.out.println("Grand Father play Soccer");
    }
    public void bloodGroup(){
        System.out.println("Grand Father blood group is A-");
    }
    public void tellStories(){
        System.out.println("Grand Father love tell Stories");
    }
    public void loveAnimals(){
        System.out.println("Grand Father loves Animals");
    }

    public boolean isJadi(){
        return isJadi=isJadi;
    }
    public void setIsJadi(){
        this.isJadi=isJadi;
    }








}
