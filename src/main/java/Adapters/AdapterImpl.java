package Adapters;

import entity.User;

public class AdapterImpl implements Adapter {

    @Override
    public User toUser(Object data) {

        if (data instanceof User) return (User) data;

        if (data instanceof String) {

            return fromStringToUser((String) data);
        }

        throw new ClassCastException("Этот тип данных не поддерживается");

    }

    public boolean isSupportedFormat(Object o) {

        return o instanceof User || o instanceof String;

    }

    private User fromStringToUser(String data) {
        String[] info = data.split("\\s");

        String email = info[0];
        String name = info[1];
        int age = Integer.parseInt(info[2]);

        return new User(email, name, age);
    }
}
