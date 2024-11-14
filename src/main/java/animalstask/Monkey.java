package animalstask;

public class Monkey extends Animal{
    private String foodType;

    public Monkey(int age, double weight, String foodType) {
        super(age, weight);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void eatFood() {
        System.out.printf("This monkey loves %s\n", getFoodType());
    }
}
