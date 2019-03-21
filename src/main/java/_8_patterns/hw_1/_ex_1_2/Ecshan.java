package _8_patterns.hw_1._ex_1_2;

import _8_patterns.hw_1.Animal;

import java.util.List;

public class Ecshan {
    public static void main(String[] args) {
        List<Command> commands = List.of(new GiveVoice(new Animal("Dog")),
                new SitDown(new Animal("Cat")), new ToLie(new Animal("Eliphan")));
        commands.stream().forEach(Command::run);
    }
}
