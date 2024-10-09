/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package c.bubblesort;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class BubbleSort<T> {
    
    private long contaComparacoes;
    void troca(T[] v, int i, int j){
        T temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public long getContaComparacoes() {
        return contaComparacoes;
    }
    public T[] sort(T v[], Comparator<T> comparador){
        int n = v.length;
        
        for(int fase=1;fase<n;fase++)
            for(int j=0;j<n-fase;j++){
                
                if(comparador.compare(v[j], v[j+1])>0)
                    troca(v,j,j+1);
                
            }
                
        return v;
    }
    
}

    
