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


    @Test
    void suma1y2(){
        //ARRANGE
        c=new Calculadora();
        String pasar="1,2";
        //ACT
        int resultado=c.operacionTDD(pasar);
        //ASSERT
        assertEquals(3,resultado);
    }

    @org.junit.jupiter.api.Test
    void suma3Numeros(){
        c=new Calculadora();
        String pasar="1,1,2";
        //ACT
        int resultado=c.operacionTDD(pasar);
        //ASSERT
        assertEquals(4,resultado);
    }

    @Test
    void sumaVacio(){
        c=new Calculadora();
        String pasar="1,2,";
        //ACT
        int resultado=c.operacionTDD(pasar);
        //ASSERT
        assertEquals(-1,resultado);
    }

    @Test
    void detectaNegativos(){
        //ARRANGE
        c=new Calculadora();
        String pasar ="1,2,-2";
        //ACT
        int resultado = c.operacionTDD(pasar);
        //ASSERT
        assertEquals(-1,resultado,"Número negativo no permitido");
    }

    @Test
    void detectar1000(){
        //ARRANGE
        c=new Calculadora();
        String pasar="5,1002";
        //ACT
        int resultado=c.operacionTDD(pasar);
        //ASSERT
        assertEquals(5,resultado,"Número superior a 1000 ignorado");
    }


}