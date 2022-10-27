
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
       assertEquals(calculator.sumar(1,1), 3);
   }
  
   @Test
   public void suma3test() {
       assertEquals(calculator.sumar(1, 2), 3);
   }
  
   @Test
   public void suma4test() {
       assertEquals(calculator.sumar(4,5), 9);
   }
   @Test
   public void suma5test() {
       assertEquals(calculator.sumar(23,3), 26);
   }
   @Test
   public void suma6test() { assertEquals(calculator.sumar(100,23), 123);}
   @Test
   public void restar1test() {
       assertEquals(calculator.restar(5,5), 0);
   }
   @Test
   public void restar2test() {
       assertEquals(calculator.restar(26,26), 0);
   }
   @Test
   public void restar3test() {
       assertEquals(calculator.restar(17,6), 11);
   }
   @Test
   public void restar4test() {
       assertEquals(calculator.restar(433,344), 43);
   }
   @Test
   public void restar5test() {
       assertEquals(calculator.restar(44,11), 33);
   }
   @Test
   public void restar6test() {
       assertEquals(calculator.restar(54,14), 40);
   }
   @Test
   public void dividir1test() { assertEquals(calculator.dividir(2,2), 1);}
   @Test
   public void dividir2test() { assertEquals(calculator.dividir(25,5), 5);}
   @Test
   public void dividir3test() { assertEquals(calculator.dividir(36,6), 23);}
   @Test
   public void dividir4test() { assertEquals(calculator.dividir(44,4), 11);}
   @Test
   public void dividir5test() { assertEquals(calculator.dividir(55,5), 4);}
   @Test
   public void dividir6test() { assertEquals(calculator.dividir(20,4), 5);}
   @Test
   public void multiplicar1test() { assertEquals(calculator.multiplicar(20,4), 5);}
   @Test
   public void multiplicar2test() { assertEquals(calculator.multiplicar(20,4), 80);}
   @Test
   public void multiplicar3test() { assertEquals(calculator.multiplicar(10,100), 1000);}
   @Test
   public void multiplicar4test() { assertEquals(calculator.multiplicar(50,50), 1);}
   @Test
   public void multiplicar5test() { assertEquals(calculator.multiplicar(9,9), 81);}
   @Test
   public void multiplicar6test() { assertEquals(calculator.multiplicar(30,60), 3434);}

}

