package _8_patterns.hw_1._hm_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 2. Напишите adapter для преобразования из user всех animal, в том числе из animal из relatives.
 */
class AdaptarUserAnimals {
    public static List<Animal> allAnimals(User user) {
        List<Animal> animals = new ArrayList<>();
        if (user.getPet() != null) {
            animals.add(user.getPet());
        }

        if (user.getRelatives() != null) {
            user.getRelatives().stream()
                    .filter(Objects::nonNull)
                    .flatMap(user1 -> allAnimals(user1).stream())
                    .filter(Objects::nonNull)
                    .forEach(animals::add);

        }
        return animals;
    }
}
