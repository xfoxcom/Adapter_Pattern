import Adapters.Adapter;
import Adapters.AdapterImpl;
import entity.User;

import java.util.Arrays;


public class Demo {

    private static final Object[] RAW_DATA = new Object[]{"foo@mail.com Liam 29", null, "jack_moo@google.com Jack 20",
            "allin@yandex.ru Alli 42", new User("hello@gmail.com", "Koala", 25), new char[]{'E'}, null,
            45.0, "NOT SUPPORTED DATA"};

    public static void main(String[] args) {

        Store store = new Storage();

        Adapter adapter = new AdapterImpl();

        Arrays.stream(RAW_DATA)
                .filter(adapter::isSupportedFormat)
                .map(adapter::toUser)
                .forEach(store::save);

        store.show();

    }
}
