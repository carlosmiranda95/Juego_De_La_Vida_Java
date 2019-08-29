/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_de_la_vida_java;

import java.util.Random;

/**
 *
 * @author Carlos Miranda Rocha
 */
public class Juego_De_La_Vida_Java {

    /**
     * @param args the command line arguments
     */
    static int [][] matrix;
    public static void main(String[] args) {
        // TODO code application logic here
        //crearTabla(0,0);
        poblarCelulasIniciales(5);
    }
    
    public static boolean crearTabla(int row, int col){
        matrix = new int[row][col];
        boolean resp;
        if(matrix.length >= 1)
        {
            resp = true;
        }else{
            resp = false;
        }
        return resp;
    }
    public static boolean poblarCelulasIniciales(int cantidadcelulas){
        boolean respuesta = false;
        int iterador;
        Random objRandom = new Random();
        int rows = objRandom.nextInt(cantidadcelulas);
        int cols = objRandom.nextInt(cantidadcelulas);
        if(crearTabla(rows,cols)){
            for (iterador = 0; iterador <= cantidadcelulas; iterador++) {
                    int x = objRandom.nextInt(rows);
                    int y = objRandom.nextInt(cols);
                    matrix[x][y] = 1;    
            }
            if(iterador >= 1){
                respuesta = true;
            }
        }
        return respuesta;
    }
}
