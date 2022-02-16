package Prototype;

interface Copyable
{
    Object clone();
}

public class Dog implements Copyable{
    private String name;
    private int age;
    private int weight;

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public Object clone() {
        return new Dog(name,age,weight);
    }
}
