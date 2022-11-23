package Adapters;


import entity.User;

public interface Adapter {
    User toUser(String data);
}

