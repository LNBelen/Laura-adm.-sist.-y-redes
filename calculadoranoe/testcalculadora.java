
import static org.junit.Assert.assertEquals;

import calcu.calculadora;
import org.junit.Test;

public class testcalculadora {


  calculadora calculator = new calculadora ();

   @Test
   public void suma1test (){
       assertEquals(calculator.sumar(1,1), 2);
   }
   @Test
   public void suma2test() {
       assertNotEquals(calculator.sumar(1,1), 3);
   }
  
   @Test
   public void suma3test() {
       assertEquals(calculator.sumar(1, 2), 3);
   }
  
   @Test
   public void suma4test() {
       assertNotEquals(calculator.sumar(1, 2), 4);
   }
   @Test
   public void suma5test() {
       assertEquals(calculator.sumar(23,3), 26);
   }
   @Test
   public void suma6test()
 { assertEquals(calculator.sumar(3,23), 26);}
   @Test
   public void suma6test()
 { assertNotEquals(calculator.sumar(3,23), 34);}
   @Test
   public void restar1test() {
       assertEquals(calculator.restar(5,5), 0);
   }
   @Test
   public void restar2test() {
       assertNotEquals(calculator.restar(5,5), 5);
   }
   @Test
   public void restar3test() {
       assertEquals(calculator.restar(17,6), 11);
   }
   @Test
   public void restar4test() {
       assertNotEquals(calculator.restar(17,6), 0);
   }
   @Test
   public void restar5test() {
       assertEquals(calculator.restar(44,11), 33);
   }
   @Test
   public void restar6test() {
       assertNotEquals(calculator.restar(44,11), 40);
   }
   @Test
   public void dividir1test() { assertEquals(calculator.dividir(2,2), 1);}
   @Test
   public void dividir2test() { assertNotEquals(calculator.dividir(2,2), 5);}
   @Test
   public void dividir3test() { assertEquals(calculator.dividir(36,6), 23);}
   @Test
   public void dividir4test() { assertNotEquals(calculator.dividir(36,6), 11);}
   @Test
   public void dividir5test() { assertNotEquals(calculator.dividir(20,4), 4);}
   @Test
   public void dividir6test() { assertEquals(calculator.dividir(20,4), 5);}
   @Test
   public void multiplicar1test() { assertNotEquals(calculator.multiplicar(20,4), 5);}
   @Test
   public void multiplicar2test() { assertEquals(calculator.multiplicar(20,4), 80);}
   @Test
   public void multiplicar3test() { assertEquals(calculator.multiplicar(10,100), 1000);}
   @Test
   public void multiplicar4test() { assertNotEquals(calculator.multiplicar(10,100), 10);}
   @Test
   public void multiplicar5test() { assertEquals(calculator.multiplicar(9,9), 81);}
   @Test
   public void multiplicar6test() { assertNotEquals(calculator.multiplicar(9,9), 18);}

}

