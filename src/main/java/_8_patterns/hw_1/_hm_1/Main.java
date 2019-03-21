package _8_patterns.hw_1._hm_1;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Animal animal = new Animal();
        User user = new User();

        // - 1

        user = user.createUser(faker.name().firstName(), 20, animal.createAnimal(faker.name().name(), Type.BIRD),
                Arrays.asList(user.createUser(faker.name().firstName(),
                        30, animal.createAnimal(faker.name().firstName(), Type.CAT), null),
                        user.createUser(faker.name().firstName(),
                                35, animal.createAnimal(faker.name().firstName(), Type.DOG), null),
                        user.createUser(faker.name().firstName(),
                                32, animal.createAnimal(faker.name().firstName(), Type.FISH), Arrays.asList(user.createUser(faker.name().firstName(),
                                        32, animal.createAnimal(faker.name().firstName(), Type.FISH), null)))

                ));

        // - 2

        AdaptarUserAnimals.allAnimals(user).stream()
                .forEach(System.out::println);


        // - 3
        System.out.println("");

        BaseEntity userTrainer = new UserTrainer(user);
        userTrainer.lie();
        userTrainer.voice();

        BaseEntity animalTrainer = new AnimalTrainer(animal.createAnimal(faker.name().firstName(), Type.CAT));
        animalTrainer.lie();
        animalTrainer.voice();
    }
}
