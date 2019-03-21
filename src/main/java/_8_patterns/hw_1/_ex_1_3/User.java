package _8_patterns.hw_1._ex_1_3;

import java.util.List;

public  class User {
    private String name;
    private Integer age;
    private List<User> relatives;

    private User(String name, Integer age, List<User> relatives) {
        this.name = name;
        this.age = age;
        this.relatives = relatives;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<User> getRelatives() {
        return relatives;
    }

    public static class UserBilder {
        private String name;
        private Integer age;
        private List<User> relatives;

        UserBilder() {
            this.name = name;
            this.age = age;
            this.relatives = relatives;
        }

        public UserBilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserBilder relatives(List<User> relatives) {
            this.relatives = relatives;
            return this;
        }

        public User bild() {
            return new User(this.name, this.age, this.relatives);
        }
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return user.name.equals(this.name) && user.age == this.age;
    }
}
