package Bulider;

public class Test {
    public static void main(String[] args) {
        Dog d1=new Dog.Builder().withName("Bobby").withAge(5).withWeight(20).build();
        System.out.println(d1);
        Dog d2 =new Dog.Builder().withName("Garry").withAge(3).build();
        System.out.println(d2);
    }
}
