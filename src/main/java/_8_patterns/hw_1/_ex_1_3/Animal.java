package _8_patterns.hw_1._ex_1_3;

public class Animal{
    private String name;
    private User owner;

    public Animal(String name, User owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public User getOwner() {
        return owner;
    }
}