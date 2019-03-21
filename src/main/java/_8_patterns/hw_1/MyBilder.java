package _8_patterns.hw_1;

import java.util.List;

/**
 * Напишите factory для классов User и Animal.
 */
public class MyBilder {
    public static void main(String[] args) {
        System.out.println( new User.UserBuilder().name("efefef").pets(List.of(new Anymals.AnymalsBuilder().anymals("ddd").Build()
        )));
    }
}

