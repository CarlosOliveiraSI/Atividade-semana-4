/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparador;

import java.util.Comparator;

/**
 *
 * @author carlo
 *
 */
public class InsertionSort<T extends Comparable<T>> {
    private long contaComparacoes;

    public long getContaComparacoes() {
        return contaComparacoes;
    }
     private void insert(T[] v, int i, Comparator<T> comparator){
        T eleito = v[i];
        int indice_comp = i-1;
        while(indice_comp>=0&& comparator.compare(eleito,v[indice_comp])<0){
               v[indice_comp+1] = v[indice_comp];// deslocando
               indice_comp--;
        }// fim while
        v[indice_comp+1] = eleito;
    }// fim insert
    
        private void insert(T[] v, int i){
        T eleito = v[i];
        int indice_comp = i-1;
        while(indice_comp>=0&& eleito.compareTo(v[indice_comp])<0){
             this.contaComparacoes ++;  
            v[indice_comp+1] = v[indice_comp];// deslocando
               indice_comp--;
        }// fim while
        v[indice_comp+1] = eleito;
    }// fim insert
    
    public void isort(T[] v, Comparator<T> comparator){
        for(int i=1;i<v.length;i++)
            insert(v, i, comparator);
    }
    
        public void sort(T[] v){
        for(int i=1;i<v.length;i++)
            insert(v, i);
    }
    
}