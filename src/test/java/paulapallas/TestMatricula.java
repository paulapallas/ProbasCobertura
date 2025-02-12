package paulapallas;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TestMatricula {

     @Test
     public void comprobarConstructorVacio(){

        Matricula alumno1 = new Matricula();

        //boolean resultado = mengano.getNombre() == null;
        //assertTrue(resultado);
        
        assertNull(alumno1.getAlumno());
        assertNull(alumno1.getModulo());
        assertNull(alumno1.getNota());
        assertNull(alumno1.getCurso());
       
    }
    
}
