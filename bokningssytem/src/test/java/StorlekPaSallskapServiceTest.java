import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class) 
public class StorlekPaSallskapServiceTest {

    @Mock
    private Utskriftstjanst mockUtskriftstjanst;

    @InjectMocks
    private StorlekPaSallskapService service;

    @Test
    public void testStorlekGodkandSkaAnropaLoggningEnGong() {
        int giltigStorlek = 5;
        
        service.hanteraStorlek(giltigStorlek);

        Mockito.verify(mockUtskriftstjanst, Mockito.times(1)).loggaMeddelande(Mockito.anyString()); 
    }

    @Test
    public void testStorlekOgiltigSkaKastaExceptionOchInteLogga() {
        int ogiltigStorlek = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.hanteraStorlek(ogiltigStorlek);
        });

        Mockito.verifyNoInteractions(mockUtskriftstjanst);
    }
}

/*import org.junit.jupiter.api.Test;
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
} */