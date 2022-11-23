import java.util.Arrays;
import java.util.Objects;

public class Demo {

    private static final String[] RAW_DATA = new String[]{"foo@mail.com Liam 29", "jack_moo@google.com Jack 20", "allin@yandex.ru Alli 42"};

    public static void main(String[] args) {

        Store store = new Storage();

        Arrays.stream(RAW_DATA).filter(Objects::nonNull)
                .forEach(store::save);

        store.show();

    }
}
