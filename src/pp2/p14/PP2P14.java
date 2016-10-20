/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p14;

/**
 *
 * @author osiri
 */
public class PP2P14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //declaracion
    int [][] r = new int [7][7];
    //proceso
    r = calcular ();
    mostrar(r);
    }
    public static int [][] calcular (){
        int [][] r = new int [7][7];
        int i, j;
        //llenado de la tabla
        for (i = 0; i < 7; ++i){
            for (j = 0; j < 7; ++j){
                if (i == j){
                    r [i][j] = 1;
                }else{
                    r [i][j] = 0;
                }
            }
        }
        return r;
    }
    public static void mostrar (int[][] r){
        int i;
        //despliegue de la tabla
        i = 0;
        System.out.println("["+r[i][0]+"] "+"["+r[i][1]+"] "+"["+r[i][2]+"] "+"["+r[i][3]+"] "+"["+r[i][4]+"] "+"["+r[i][5]+"] "+"["+r[i][6]+"] ");
        i = 1;
        System.out.println("["+r[i][0]+"] "+"["+r[i][1]+"] "+"["+r[i][2]+"] "+"["+r[i][3]+"] "+"["+r[i][4]+"] "+"["+r[i][5]+"] "+"["+r[i][6]+"] ");
        i = 2;
        System.out.println("["+r[i][0]+"] "+"["+r[i][1]+"] "+"["+r[i][2]+"] "+"["+r[i][3]+"] "+"["+r[i][4]+"] "+"["+r[i][5]+"] "+"["+r[i][6]+"] ");
        i = 3;
        System.out.println("["+r[i][0]+"] "+"["+r[i][1]+"] "+"["+r[i][2]+"] "+"["+r[i][3]+"] "+"["+r[i][4]+"] "+"["+r[i][5]+"] "+"["+r[i][6]+"] ");
        i = 4;
        System.out.println("["+r[i][0]+"] "+"["+r[i][1]+"] "+"["+r[i][2]+"] "+"["+r[i][3]+"] "+"["+r[i][4]+"] "+"["+r[i][5]+"] "+"["+r[i][6]+"] ");
        i = 5;
        System.out.println("["+r[i][0]+"] "+"["+r[i][1]+"] "+"["+r[i][2]+"] "+"["+r[i][3]+"] "+"["+r[i][4]+"] "+"["+r[i][5]+"] "+"["+r[i][6]+"] ");
        i = 6;
        System.out.println("["+r[i][0]+"] "+"["+r[i][1]+"] "+"["+r[i][2]+"] "+"["+r[i][3]+"] "+"["+r[i][4]+"] "+"["+r[i][5]+"] "+"["+r[i][6]+"] ");
    }
    
}
