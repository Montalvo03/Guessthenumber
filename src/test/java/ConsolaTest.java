import org.example.Consola;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsolaTest {

    @Test
    void ComprobacionDeLectura() {
        String input = "42";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Consola consola = new Consola();
        int result = consola.leerEntero();
        assertEquals(42, result);
    }
}