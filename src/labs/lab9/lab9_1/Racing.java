package labs.lab9.lab9_1;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Arrays;

import static labs.lab9.lab9_1.Animal.Builder;

public class Racing {
    public static void main(String[] args) {
        Animal falcon = new Builder().setName("Falcon").setSpeed(55).setFlyable(true).build();
        Animal tiger = new Builder().setName("Tiger").setSpeed(100).setFlyable(false).build();
        Animal horse = new Builder().setName("Horse").setSpeed(80).setFlyable(false).build();
        Animal dog = new Builder().setName("Dog").setSpeed(35).setFlyable(false).build();

        Animal winner = new AnimalController().getWinner(Arrays.asList(falcon, tiger, horse, dog));
        System.out.println(winner);
    }

//    private static int generateAnimalSpeed(int maxspeed){
//        return new SecureRandom().nextInt(maxspeed) + 1;
//    }
}
