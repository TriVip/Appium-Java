package labs.lab7.lab7_2;

public class AnimalRace {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        Animal winner = determineWinner(dog, horse, tiger);
        System.out.println("Winner is " + winner.getClass().getSimpleName() + ", with speed: " + winner.getSpeed());
    }

    private static Animal determineWinner(Animal... animals) {
        Animal fastest = null;
        int maxSpeed = 0;
        for (Animal animal : animals) {
            int currentSpeed = animal.getSpeed();
            if (currentSpeed > maxSpeed) {
                maxSpeed = currentSpeed;
                fastest = animal;
            }
        }
        return fastest;
    }
}
