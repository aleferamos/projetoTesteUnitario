import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
    
    Calculadora calc = new Calculadora();

    @Test
    public void testSomar(){
        assertEquals(2, calc.somar(1, 1), 0.00001);
    }

    @Test
    public void testSubtrair(){
        assertEquals(2, calc.subtrair(5, 3), 0.00001);
    }

    @Test
    public void testMultiplicar(){
        assertEquals(6, calc.multiplicar(2, 3), 0.00001);
    }

    @Test
    public void testDividir(){
        assertEquals(5, calc.dividir(10, 2), 0.00001);
    }
}
