package animalstask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Create empty list of animals. Add some animals to the list:
        ArrayList<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(25, 70));
        listOfAnimals.add(new Animal(3, 4.55));
        listOfAnimals.add(new Monkey(7, 39.5, "Banana"));
        listOfAnimals.add(new Monkey(18, 75, "Bamboo"));
        listOfAnimals.add(new Donkey(12, 69, "Donny"));
        listOfAnimals.add(new Donkey(2, 32.2, "Little"));

//Create Zoo instance with city "New York" and put your created collection of animals as parameter.
        Zoo newYorkZoo = new Zoo("New York", listOfAnimals);

//Call PrintAnimals() and FeedAnimals() methods for zoo instance.
//Run your program and. Be sure that in animals information you see 2 Donkeys with displayed
// names "Donny" and "Little".
// Be sure that in feeding list you see "Banana" and "Bamboo".
        newYorkZoo.printAnimals();
        newYorkZoo.feedAnimals();

//Create one more instance of List of Animals with name filteredAnimals.
//Initialize filteredAnimals list with help of FilterByAge() method from AnimalsFilter class.
// Use your previously created animals list as first parameter and 10 as MinAge parameter.
        ArrayList<Animal> filteredAnimals = AnimalFilter.filterAnimalsByAge(listOfAnimals, 10);

//Create new Zoo instance with name filteredZoo and city "City of grown-up animals".
// And use your filteredAnimals instance as argument.
//Do: filteredZoo.PrintAnimals();
//Be sure that you see in console "In City of grown-up animals zoo we have animals" stores only
// elements with age more than 10.
        Zoo filteredZoo = new Zoo("City of grown-up animals", filteredAnimals);
        filteredZoo.printAnimals();

//Continue work in your Main method (List practice, more lambda practice, string contains another string logic):
//Create list of Zoo. Add zoo and filteredZoo objects, that you created previously, to this collection.
        List<Zoo> listOfZoos = new ArrayList<>();
        listOfZoos.add(newYorkZoo);
        listOfZoos.add(filteredZoo);

//Write in console: "Practice with lambda".
//With help of lambda: Select only zoos that have "grown-up" part in City field.
// Call PrintAnimals() method for selected elements (with lamda).
//Be sure that in console after "Practice with lamda" you can see only information about grown-up animals
        System.out.println("Practice with lambda");
        listOfZoos.stream()
                .filter(zoo -> zoo.getCity().contains("grown-up"))
                .forEach(Zoo::printAnimals);
    }
}
