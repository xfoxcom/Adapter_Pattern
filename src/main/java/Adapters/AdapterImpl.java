package Adapters;

import entity.User;

public class AdapterImpl implements Adapter {

    @Override
    public User toUser(String data) {

        String[] info = data.split("\\s");

        String email = info[0];
        String name = info[1];
        int age = Integer.parseInt(info[2]);

        return new User(email, name, age);

    }
}
