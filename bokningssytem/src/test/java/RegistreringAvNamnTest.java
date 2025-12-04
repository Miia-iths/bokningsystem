import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistreringAvNamnTest {

    @Test
    public void inhallerBokstaverTest() {
        RegistreringAvNamn namn = new RegistreringAvNamn();

        assertTrue(namn.inhallerBokstaver("Anna"));
        assertFalse(namn.inhallerBokstaver("1234"));

    }

    @Test
    public void inhallerSiffrorTest() {
        RegistreringAvNamn namn = new RegistreringAvNamn();

        assertTrue(namn.inhallerSiffror("Anna123"));
        assertFalse(namn.inhallerSiffror("Anna"));

    }

}
