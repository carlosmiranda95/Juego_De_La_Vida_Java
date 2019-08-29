/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import juego_de_la_vida_java.Juego_De_La_Vida_Java;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Miranda Rocha
 */
public class Juego_de_la_vida_java_test {
    
    public Juego_de_la_vida_java_test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testCrearTablero(){
        int row = 10;
        int col = 10;
        boolean respuesta = Juego_De_La_Vida_Java.crearTabla(row,col);
        assertEquals(true, respuesta);
    }
    @Test
    public void testPoblarCelulasIniciales(){
        int cantidadcelulas = 2;
        boolean respuesta = Juego_De_La_Vida_Java.poblarCelulasIniciales(cantidadcelulas);
        assertEquals(true, respuesta);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
