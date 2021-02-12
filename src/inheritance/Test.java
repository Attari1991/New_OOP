package inheritance;

public class Test {
    //one class extends just one other class : called single level inheritnace

    public static void main(String [] args){
        GrandFather gf=new GrandFather();
        gf.fishing();
        gf.height();
        gf.setGrandFatherFavouriteAccountNumber();
        System.out.println(gf.getGrandFatherFavouriteAccountNumber());
        gf.setIsJadi();
        System.out.println(gf.isJadi());

        //constructor of father class:
        Father father=new Father();
        father.jump();
        father .beard();
        father.swim();

        Son ghania=new Son();
        //when i do :ghania.(you will see the properties from gf and f)
        ghania.playGame();
        ghania.hiking();
        ghania.hairStyle();



    }

}
