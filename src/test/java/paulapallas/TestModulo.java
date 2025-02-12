package paulapallas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestModulo {

      @Test
    public void comprobarConstructorVacio(){

        Modulo programacion = new Modulo();

        //boolean resultado = mengano.getNombre() == null;
        //assertTrue(resultado);
        
        assertNull(programacion.getNombre());
        assertNull(programacion.getCodigo());
        assertNull(programacion.getDescripcion());
        assertNull(programacion.getHoras());
        assertNull(programacion.getSesiones());
   
}


    @Test
    public void comprobarConstructorCompleto(){

        Modulo programacion = new Modulo("prog","Programación","Aprender a programar",
         300,30);

         assertTrue(programacion.getCodigo().equals("prog"));
         assertTrue(programacion.getNombre().equals("Programación"));
         assertTrue(programacion.getDescripcion().equals("Aprender a programar"));
         assertTrue(programacion.getHoras().equals(300));
         assertTrue(programacion.getSesiones().equals(30));
         


    }

    @Test
    public void comprobarSetters(){

        Modulo programacion = new Modulo();

        programacion.setCodigo("prog");
        programacion.setNombre("Progrmación");
        programacion.setDescripcion("Aprender a programar");
        programacion.setHoras(300);
        programacion.setSesiones(30);

        assertTrue(programacion.getCodigo().equals("prog"));
        assertTrue(programacion.getNombre().equals("Programación"));
        assertTrue(programacion.getDescripcion().equals("Aprender a programar"));
        assertTrue(programacion.getHoras().equals(300));
        assertTrue(programacion.getSesiones().equals(30));


    }

        @Test
        public void comprobarToString(){

            Modulo programacion = new Modulo("prog","Programación","Aprender a programar",
            300,30);
    
   
            
            
    
            String tmp = "Modulo [codigo=prog, nombre=Programación, descripcion=Aprender a programar,horas=300,sesiones=30]";
            assertEquals(programacion.toString(), tmp);
        }    
    
    


    
                                           
     
    }





