package Factory;



public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory=new ChairFactory();
        FunctionalChair functionalChair= chairFactory.createFunctionalChair();
        System.out.println(functionalChair.sum(5,6));
        MagicChair magicChair=chairFactory.createMagicianChair();
        magicChair.doMagic();

    }
}
