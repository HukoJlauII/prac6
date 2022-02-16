package AbstractFactory;

public class Client {
    public Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }
    public void sit()
    {
        System.out.println("Сел на стул");
    }
}
