import Adapters.Adapter;
import Adapters.AdapterImpl;
import entity.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {

    @Test
    void when_take_string_return_user() {

        String raw_data = "foo@mail.com Liam 29";

        Adapter adapter = new AdapterImpl();

        User actual = adapter.toUser(raw_data);

        User expected = new User("foo@mail.com", "Liam", 29);

        assertEquals(expected, actual);
    }
}
