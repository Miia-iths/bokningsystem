import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StorlekPaSallskapTest {

    @Test

    public void testStorlekPaSallskapGiltig() {
        StorlekPaSallskap sallskapStorlek = new StorlekPaSallskap();

        assertTrue(sallskapStorlek.giltigStorlek(1));
        assertTrue(sallskapStorlek.giltigStorlek(6));
        assertTrue(sallskapStorlek.giltigStorlek(12));

    }

    @Test

    public void testStorlekPaSallskapOgiltig() {
        StorlekPaSallskap sallskapStorlek = new StorlekPaSallskap();

        assertFalse(sallskapStorlek.giltigStorlek(0));
        assertFalse(sallskapStorlek.giltigStorlek(13));
        assertFalse(sallskapStorlek.giltigStorlek(-6));

    }
}