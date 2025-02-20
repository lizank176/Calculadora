import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculadoraTest {
    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("---Inicio de las pruebas---");
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("---Final de las pruebas---");
    }
    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(-1, Calculadora.sumar(-2, 1));
        assertEquals(0, Calculadora.sumar(0, 0));
    }

   @Test
    public void testRestar() {
        assertEquals(1, Calculadora.restar(3, 2));
        assertEquals(-3, Calculadora.restar(-2, 1));
        assertEquals(0, Calculadora.restar(0, 0));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, Calculadora.multiplicar(2, 3));
        assertEquals(-2, Calculadora.multiplicar(-2, 1));
        assertEquals(0, Calculadora.multiplicar(0, 5));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, Calculadora.dividir(6, 3), 0.001);
        assertEquals(-2, Calculadora.dividir(-4, 2));
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(1, 0));
    }

    @Test
    public void testCalculadora() {
        assertEquals(5, Calculadora.calculadora(2, 3, 1));
        assertEquals(1, Calculadora.calculadora(3, 2, 2));
        assertEquals(6, Calculadora.calculadora(2, 3, 3));
        assertEquals(2, Calculadora.calculadora(6, 3, 4));
        assertThrows(IllegalArgumentException.class, () -> Calculadora.calculadora(1, 1, 5));
    }
}