package refatorado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void calcular() {
        Cliente cliente = new Cliente("Igor",10, 25);
        assertEquals(250,cliente.calcular());
    }
}