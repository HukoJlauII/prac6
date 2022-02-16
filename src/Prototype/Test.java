package Prototype;

public class Test {
    public static void main(String[] args) {
        Dog orig=new Dog("Bobby",5,20);
        System.out.println("Original: "+orig);
        Dog clone=(Dog)orig.clone();
        System.out.println("Clone: "+clone);
    }
}
