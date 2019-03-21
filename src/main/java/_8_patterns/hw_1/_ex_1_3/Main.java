package _8_patterns.hw_1._ex_1_3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User Pash = new User.UserBilder().name("Pasha").age(30).bild();
        User Sasha = new User.UserBilder().name("Sasha").age(31).bild();
        User Dasha = new User.UserBilder().name("Dasha").age(40).bild();
        User Oly = new User.UserBilder().name("Oly").age(20).bild();
        User Boss = new User.UserBilder()
                .name("Boss")
                .age(30)
                .relatives(List.of(Pash, Sasha, Dasha, Oly)).bild();

        Animal Cat = new Animal("Cat", Pash);
        Animal Dog = new Animal("Dog", Oly);

        Facade facadeConsole = new PrintToConsolle();
        Facade facadeFile = new PrintToFile();

        facadeConsole.printUser(Boss, Cat);
        facadeFile.printUser(Boss, Dog);
    }
}
