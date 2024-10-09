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
public class SelectionSort<T> {
    private long contacomparacoes;
    private int indiceMenorValor(T[] v, int posicao, Comparator<T> comparador ){
        int indiceMenor = posicao;
        for(int i = posicao + 1; i < v.length; i++){
            
            if(comparador.compare(v[i], v[indiceMenor]) < 0)
                indiceMenor = 1;
        }
        return indiceMenor;
        
        }
    
    static void troca(Integer[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    
    public void ssort(T[] v, Comparator<T> comparador ){
        int n = v.length;
        this.contacomparacoes = 0;
        for(int i = 0; i < n -1; i++){
            this.contacomparacoes++;
            int indiceMenor = indiceMenorValor(v, i, comparador);
        troca((Integer[]) v, i, indiceMenor);
        }
    }

    public long getContacomparacoes() {
        return contacomparacoes;
    }
    
}