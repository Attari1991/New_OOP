package exercise;

public class TestMobile {
    public static void main(String[] args) {
        Mobile obj=new Mobile();
        obj.setGallery("iphon");//set for assign valuer
        System.out.println(obj.getGallery());

        obj.setCamera("normal");
        System.out.println(obj.getCamera());

        obj.setPlayStore("app");
        System.out.println(obj.getPlayStore());
        obj.setIsAvailable(true);
        System.out.println(obj.isAvailable());

    }

}
