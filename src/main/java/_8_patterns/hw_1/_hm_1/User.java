package _8_patterns.hw_1._hm_1;


import java.util.List;


public class User implements BaseEntity {
    private String name;
    private Integer age;
    private Animal pet;
    private List<User> relatives;

    public User() {
    }

    public User(String name, Integer age, Animal pet, List<User> relatives) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.relatives = relatives;
    }

    @Override
    public void lie() {
        System.out.println(this + " lie");

    }

    @Override
    public void voice() {
        System.out.println(this + " voice");
    }

    public User createUser(String name, Integer age, Animal pet, List<User> relatives) {
        return new User(name, age, pet, relatives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public List<User> getRelatives() {
        return relatives;
    }

    public void setRelatives(List<User> relatives) {
        this.relatives = relatives;
    }

    @Override
    public String toString() {
        return name + ", age=" + age;
    }
}
