package TareaTDD_Calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    static Calculadora c;

    @org.junit.jupiter.api.Test
    void OperacionVacia(){
        //ARRANGE
        c=new Calculadora();
        String pasar = "";
        //ACT
        int resultado=c.operacionTDD(pasar);
        //ASSERT
        assertEquals(0,resultado);
    }

    @Test
    void operacion1(){
        //ARRANGE
        c=new Calculadora();
        String pasar="1";
        //ACT
        int resultado=c.operacionTDD(pasar);
        //ASSERT
        assertEquals(1,resultado);
    }



}