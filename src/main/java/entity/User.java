package entity;

import java.util.Objects;

public class User {

    private String email;

    private String name;

    private int age;

    public User(String email, String name, int age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User with email: " + email + ", name: " + name + ", age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && email.equals(user.email) && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, age);
    }
}
