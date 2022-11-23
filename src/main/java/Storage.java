import Adapters.Adapter;
import Adapters.AdapterImpl;
import entity.User;

import java.util.HashMap;
import java.util.Map;

interface Store {

    void save(User user);

    void show();
}

public class Storage implements Store {

    private Map<Integer, User> users = new HashMap<>();

    private int ID = 1;

    @Override
    public void save(User user) {

        users.put(ID++, user);

    }

    @Override
    public void show() {
        users.forEach((k, v) -> System.out.println("ID:" + k + " " + v.toString()));
    }

}
