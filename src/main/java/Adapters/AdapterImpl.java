package Adapters;

import entity.User;

public class AdapterImpl implements Adapter {

    private final String EMAIL_PATTERN = "\\w+@\\w+.\\w+ \\w+ \\d+";

    @Override
    public User toUser(Object data) {

        if (data instanceof User) return (User) data;

        if (data instanceof String) {

            return fromStringToUser((String) data);
        }

        throw new ClassCastException("Этот тип данных не поддерживается");

    }

    @Override
    public boolean isSupportedFormat(Object o) {

        if (o instanceof String str) {

            return str.matches(EMAIL_PATTERN);
        }

        return o instanceof User;

    }

    private User fromStringToUser(String data) {
        String[] info = data.split("\\s");

        String email = info[0];
        String name = info[1];
        int age = Integer.parseInt(info[2]);

        return new User(email, name, age);
    }
}
