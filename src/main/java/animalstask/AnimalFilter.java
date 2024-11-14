package animalstask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalFilter {

    public static ArrayList<Animal> filterAnimalsByAge(ArrayList<Animal> animals, int minAge){
        return animals.stream()
                .filter(animal -> animal.getAge() > minAge)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
