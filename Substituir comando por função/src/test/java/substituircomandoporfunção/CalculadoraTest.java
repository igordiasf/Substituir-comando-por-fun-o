package substituircomandoporfunção;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void calcular() {
        Cliente cliente = new Cliente("Igor",10);
        Calculadora calculadora = new Calculadora(cliente,25);
        assertEquals(250,calculadora.calcular());
    }
}