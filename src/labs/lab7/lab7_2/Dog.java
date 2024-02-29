package labs.lab7.lab7_2;

import java.security.SecureRandom;

public class Dog extends Animal{

    private static final int MAX_SPEED = 60;

    public Dog() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }
}
