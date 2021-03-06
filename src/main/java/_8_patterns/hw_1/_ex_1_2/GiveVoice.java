package _8_patterns.hw_1._ex_1_2;

import _8_patterns.hw_1.Animal;

public class GiveVoice implements Command {
    private Animal animal;

    public GiveVoice(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        System.out.println(animal.getName() + " подать голос");
    }
}
