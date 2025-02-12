package paulapallas;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TestNivel {
       @Test
    public void comprobarConstructorVacio(){

        Nivel superior = new Nivel();

        //boolean resultado = mengano.getNombre() == null;
        //assertTrue(resultado);
        
        assertNull(superior.getNivel());
    
    }

    
}
