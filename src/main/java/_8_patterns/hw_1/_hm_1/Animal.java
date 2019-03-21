package _8_patterns.hw_1._hm_1;

public class Animal implements BaseEntity {
    private String nickname;
    private Type type;

    public Animal() {
    }

    public Animal(String nickname, Type type) {
        this.nickname = nickname;
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void lie() {
        System.out.println(this + " lie");
    }

    @Override
    public void voice() {
        System.out.println(this + " voice");
    }

    public Animal createAnimal(String nickname, Type type) {
        return new Animal(nickname, type);
    }

    @Override
    public String toString() {
        return this.type + " " + this.nickname;
    }
}
