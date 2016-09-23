/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arretablas;
import java.util.*;
/**
 *
 * @author JorgeRicardo
 */
public class Arretablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             int[][]arr = new int [11][11];
        arr = llenarvector(arr);
        mostrartabla(arr);
    }

    
    public static int[][] llenarvector(int[][] a){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length;j++){
                a[i][j]=j+1;
            }
                }
        return a;
    }
    public static void mostrartabla(int[][] a){
        for (int i=0; i<a[0].length; i++){
            for (int j=0; j<a[1].length;j++){
                System.out.print(i*j+"\t");
            } System.out.println("\n");
        }
    }        
            
    
}
