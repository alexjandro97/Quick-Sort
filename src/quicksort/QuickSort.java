/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author alexj
 */
public class QuickSort {

    static int numeros[] = {55,1,3,96,56,279,495,82,15,42,11,16,57,63,25,26,102,268};
    static int pivote = numeros[0];
    static int principio = 0;
    static int fin = numeros.length - 1;
    static int auxiliar = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ordenarNumeros(numeros, principio, fin);
        imprimirNumeros(numeros);
    }
    
    static private void ordenarNumeros(int[] numeros, int principio, int fin){

        int pivote = numeros[principio]; // tomamos primer elemento como pivote
        int i = principio; // i realiza la búsqueda de izquierda a derecha
        int j = fin; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (numeros[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (numeros[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = numeros[i];                  // los intercambia
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }
        numeros[principio] = numeros[j]; // se coloca el pivote en su lugar de forma que tendremos
        numeros[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (principio < j - 1) {
            ordenarNumeros(numeros, principio, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < fin) {
            ordenarNumeros(numeros, j + 1, fin); // ordenamos subarray derecho
        }
    }
    
    static private void imprimirNumeros(int[] numeros) {
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " - ");
        }
    } 
}
