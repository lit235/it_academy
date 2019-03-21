package _8_patterns.hw_1._hm_1;

public class AnimalTrainer implements BaseEntity {
    private Animal animal;

    AnimalTrainer(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void lie() {
        System.out.println("AnimalTrainer");
        animal.lie();
    }

    @Override
    public void voice() {
        System.out.println("AnimalTrainer");
        animal.voice();
    }
}