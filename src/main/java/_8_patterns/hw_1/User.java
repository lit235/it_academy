package _8_patterns.hw_1;

import java.util.List;

public class User {
    private final String name;
    private final List<Anymals> pets;

    private User(String name, List<Anymals> pets) {
        this.name = name;
        this.pets = pets;
    }

    public static class UserBuilder {
        private String name;
        private List<Anymals> pets;

        UserBuilder() {
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder pets(List<Anymals> pets){
            this.pets = pets;
            return this;
        }

        public User build(){
            return new User(this.name,this.pets);
        }

    }
}
