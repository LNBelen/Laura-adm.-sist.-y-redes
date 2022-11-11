package testcuadratica;

import cuadratica.cuadratica;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class testcuadratica {
    cuadratica calculator = new cuadratica ();

    @Test
    public void funcioncuadratica1(){

        float[] test = calculator.resolvente(2, 4, -126);
        float[] resultado = {7,-9};
        assertTrue(Arrays.equals(resultado,test));
    }
    @Test
    public void funcioncuadratica2(){

        float[] test = calculator.resolvente(2, 4, -126);
        float[] resultado = {4,3};
        assertFalse(Arrays.equals(resultado,test));
    }
}
