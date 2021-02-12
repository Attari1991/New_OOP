package polymorphism.methodoverriding;

public class Test {
    public static void main(String[] args) {
        Bmw bmw=new Bmw();
        bmw.remoteStart();

        Audi audi=new Audi();
        audi.remoteStart();

    }
}
