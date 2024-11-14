package animalstask;

public class Donkey extends Animal{
    private String name;

    public Donkey(int age, double weight, String name) {
        super(age, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.printf("Donkey with name %s: age %d, weight %.2f\n", getName(), getAge(), getWeight());;
    }
}
