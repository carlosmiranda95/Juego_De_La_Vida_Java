/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_de_la_vida_java;

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
        crearTabla(0,0);
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
    
}
