import Adapters.Adapter;
import Adapters.AdapterImpl;
import entity.User;

import java.util.HashMap;
import java.util.Map;

interface Store {

    void save(String data);

    void show();
}

public class Storage implements Store{

    private Map<Integer, User> users = new HashMap<>();

    private int ID = 1;

    private final Adapter adapter = new AdapterImpl();

    @Override
    public void save(String data) {

        User user = adapter.toUser(data);

        users.put(ID++, user);

    }

    @Override
    public void show() {
        users.forEach((k, v) -> System.out.println("ID:" + k + " " + v.toString()));
    }

}
