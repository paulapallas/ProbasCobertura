package paulapallas;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TestCiclo {


    @Test
     public void comprobarConstructorVacio(){

        Ciclo daw = new Ciclo();

        //boolean resultado = mengano.getNombre() == null;
        //assertTrue(resultado);
        
        assertNull(daw.getNombre());
        assertNull(daw.getCodigo());
        assertNull(daw.getNivel());
        assertNull(daw.getCentro());
       
    }



    
}
