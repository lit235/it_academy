package _8_patterns.hw_1._hm_1;

public class UserTrainer implements BaseEntity {
    private User user;

    UserTrainer(User user) {
        this.user = user;
    }


    @Override
    public void lie() {
        System.out.println("UserTrainer");

        user.lie();
    }

    @Override
    public void voice() {
        System.out.println("UserTrainer");
        user.voice();
    }
}
