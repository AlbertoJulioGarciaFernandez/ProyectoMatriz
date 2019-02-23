package proyectomatriz;
import java.util.Scanner;
/**
 *  EJERCICIOS UT6 - 1º.- Generar matriz
 * @author Alberto Julio García Fernández
 */
public class Test {

    public static void main(String[] args) {
        //Creación de dos variables enteras (row-> filas, col->columnas:
        int row, col;        
        //Definición de una matriz que albergará valores enteros:
        int[][] matriz;        
        //Creación de la matriz con una dimensión de 5 filas y 8 columnas:
        matriz=new int[5][8];
        //Definición de un objeto de la clase Scanner:
        Scanner sc;
        //Creación de un objeto de la clase Scanner:
        sc=new Scanner(System.in);
        
        //Mensaje principal:
        System.out.println("\t**PROGRAMA MATRIZ (5*8)**");
        
        //Bloque de introducción de datos en la matriz:
        for(row=0;row<matriz.length;row++){//Nos situamos en la fila row:
            System.out.println("Por favor, introduzca los valores para la "
                    + "fila "+(row+1));
            for(col=0;col<matriz[row].length;col++){/*Dentro de la fila row, nos 
                situamos en la columna col:*/
                System.out.println("Valor para la posición "+(col+1));
                matriz[row][col]=sc.nextInt();
            }            
        }
        
        System.out.println("La matriz de valores enteros ha quedado de la "
                + "siguiente manera:");
        for(row=0;row<matriz.length;row++){
            System.out.println("\tFila "+(row+1));
            for(col=0;col<matriz[row].length;col++){
                System.out.println("Posición "+(col+1)+"-> "+matriz[row][col]);                
            }            
        }                        
    }
}
