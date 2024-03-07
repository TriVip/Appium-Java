package labs.lab9.lab9_1;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public Animal getWinner(List<Animal> animalList){
        List<Animal> eligibleAnimals = getEligibleRacingAnimal(animalList);
        Animal winner = null;
        for (Animal animal : eligibleAnimals) {
            if (winner == null || animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

    public List<Animal> getEligibleRacingAnimal(List<Animal> animalList){
        List<Animal> eligibleAnimals = new ArrayList<>(animalList);
        List applicableAnimals = new ArrayList();

        for (Animal animal : eligibleAnimals) {
            if(!animal.isFlyable()){
                applicableAnimals.add(animal);
            }
        }
        return eligibleAnimals;
    }

}
