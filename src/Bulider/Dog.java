package Bulider;

public class Dog {
    private String name;
    private int age;
    private int weight;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static class Builder {
        private Dog buildDog;

        public Builder() {
            this.buildDog = new Dog();
        }

        public Builder withName(String name)
        {
            buildDog.name=name;
            return this;
        }

        public Builder withAge(int age)
        {
            buildDog.age=age;
            return this;
        }

        public Builder withWeight(int weight)
        {
            buildDog.weight=weight;
            return this;
        }
        public Dog build()
        {
            return buildDog;
        }
    }
}