package animalstask;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {
    private String city;
    private ArrayList<Animal> listOfAnimals;

    public Zoo(String city, ArrayList<Animal> listOfAnimals) {
        this.city = city;
        this.listOfAnimals = listOfAnimals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Animal> getListOfAnimals() {
        return listOfAnimals;
    }

    public void setListOfAnimals(ArrayList<Animal> listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }

    public void printAnimals(){
        System.out.printf("In %s zoo we have animals:\n", getCity());
        for (Animal animal : getListOfAnimals()){
            animal.printInfo();
        }

    }

    public void feedAnimals(){
        System.out.printf("Let's feed animals in %s Zoo!\n", getCity());
        Iterator<Animal> animalIterator = getListOfAnimals().iterator();
        while (animalIterator.hasNext()){
            animalIterator.next().eatFood();
        }

    }
}
