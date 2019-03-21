package _8_patterns.hw_1._ex_1_3;

/**
 * 3. Напишите facade для печати relatives из User, у которых есть переданные Animal
 */
abstract public class Facade {

    void printUser(User user, Animal animal) {
        user.getRelatives().stream()
                .filter(user1 -> user1.equals(animal.getOwner()))
                .map(User::getName)
                .forEach(str->print(str));
    }

    abstract void print(String str);

}
