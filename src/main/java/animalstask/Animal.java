package animalstask;

public class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }


    public void eatFood(){
        System.out.println("Animal is eating food");
    }
    public void printInfo(){
        System.out.printf("My age is %d, my weight is %.2f\n", getAge(), getWeight());
    }
}
