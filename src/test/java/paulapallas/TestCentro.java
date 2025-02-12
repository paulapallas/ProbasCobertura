package paulapallas;

import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.Test;

public class TestCentro {

      @Test
    public void comprobarConstructorVacio(){

        Centro sanClemente = new Centro();

      
        assertNull(sanClemente.getCodigo());
        assertNull(sanClemente.getNombre());
        assertNull(sanClemente.getLocalidad());
        assertNull(sanClemente.getCalle());
        assertNull(sanClemente.getNumero());
        assertNull(sanClemente.getCodigoPostal());

  
    }
  
    
}
