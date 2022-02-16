package AbstractFactory;

public class Main {
    public static void main(String[] args) {


        Client client=new Client();
        ChairFactory chfact =new ChairFactory();
        client.setChair(chfact.createFunctionalChair());
        MagicChair mch=chfact.createMagicianChair();
        client.sit();
        mch.doMagic();
    }
}
