import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStorlekPaSallskap {
    @Test

    public void testStorlekPaSallskapGiltig() {
        StorlekPaSallskap sps = new StorlekPaSallskap();
        int storlek = 5; // Exempelstorlek
        assertTrue(storlek > 0 && storlek <= 12);
    }
}
