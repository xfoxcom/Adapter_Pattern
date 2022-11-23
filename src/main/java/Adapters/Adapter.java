package Adapters;


import entity.User;

public interface Adapter {
    User toUser(Object data);
    boolean isSupportedFormat(Object o);
}

