/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.javassortaula;

import java.util.Comparator;

/**
 *
 * @author carlo
 */
public class BubbleSort<T> {
    private long contaComparacoes;

    public long getContaComparacoes() {
        return contaComparacoes;
    }
     void troca(T[] v, int i, int j){
        T temp = v[i];
        v[i] = v[j];
        v[j] = temp;
     }
     
     public T[] sort(T V[], Comparator<T> comparador){
         int n = V.length;
         for(int fase = 1 ; fase < n; fase++)
             for(int j= 0; j < n - fase; j++)
                 if(comparador.compare(V[j], V[j+1]) > 0)
                     troca(V, j, j +1);
         return V;
     }
    
}
